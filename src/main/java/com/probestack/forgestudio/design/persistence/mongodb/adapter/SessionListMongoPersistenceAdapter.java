package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.SessionListDomainRepository;
import com.probestack.forgestudio.design.model.SessionList;
import com.probestack.forgestudio.design.persistence.mongodb.document.SessionListDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.SessionListMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SessionListMongoPersistenceAdapter implements SessionListDomainRepository {
    private final SessionListMongoRepository repository;

    public SessionListMongoPersistenceAdapter(SessionListMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public SessionList save(SessionList sessionList) {
        SessionListDocument document = toDocument(sessionList);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<SessionList> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<SessionList> findAll() {
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

    private SessionListDocument toDocument(SessionList sessionList) {
        SessionListDocument document = new SessionListDocument();
        BeanUtils.copyProperties(sessionList, document);
        return document;
    }

    private SessionList toDomain(SessionListDocument document) {
        SessionList domain = new SessionList();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
