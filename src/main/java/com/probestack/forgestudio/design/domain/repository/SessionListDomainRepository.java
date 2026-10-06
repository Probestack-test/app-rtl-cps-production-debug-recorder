package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.SessionList;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for SessionList domain operations.
 */
public interface SessionListDomainRepository {
    SessionList save(SessionList sessionList);

    Optional<SessionList> findById(String id);

    List<SessionList> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
