package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.StartDebugSessionRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for StartDebugSessionRequest documents.
 */
public interface StartDebugSessionRequestMongoRepository extends MongoRepository<StartDebugSessionRequestDocument, String> {
}
