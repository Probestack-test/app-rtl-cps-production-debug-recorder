package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.StartDebugSessionRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for StartDebugSessionRequest domain operations.
 */
public interface StartDebugSessionRequestDomainRepository {
    StartDebugSessionRequest save(StartDebugSessionRequest startDebugSessionRequest);

    Optional<StartDebugSessionRequest> findById(String id);

    List<StartDebugSessionRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
