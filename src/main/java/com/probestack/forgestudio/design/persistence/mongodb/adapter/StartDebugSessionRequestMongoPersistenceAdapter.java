package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.StartDebugSessionRequestDomainRepository;
import com.probestack.forgestudio.design.model.StartDebugSessionRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.StartDebugSessionRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.StartDebugSessionRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class StartDebugSessionRequestMongoPersistenceAdapter implements StartDebugSessionRequestDomainRepository {
    private final StartDebugSessionRequestMongoRepository repository;

    public StartDebugSessionRequestMongoPersistenceAdapter(
            StartDebugSessionRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public StartDebugSessionRequest save(StartDebugSessionRequest startDebugSessionRequest) {
        StartDebugSessionRequestDocument document = toDocument(startDebugSessionRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<StartDebugSessionRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<StartDebugSessionRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private StartDebugSessionRequestDocument toDocument(
            StartDebugSessionRequest startDebugSessionRequest) {
        StartDebugSessionRequestDocument document = new StartDebugSessionRequestDocument();
        BeanUtils.copyProperties(startDebugSessionRequest, document);
        return document;
    }

    private StartDebugSessionRequest toDomain(StartDebugSessionRequestDocument document) {
        StartDebugSessionRequest domain = new StartDebugSessionRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
