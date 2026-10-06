package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.SessionListDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for SessionList documents.
 */
public interface SessionListMongoRepository extends MongoRepository<SessionListDocument, String> {
}
