package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AddBookmarkRequest;
import com.probestack.forgestudio.design.model.Bookmark;
import com.probestack.forgestudio.design.model.DebugSession;
import com.probestack.forgestudio.design.model.StartDebugSessionRequest;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.SessionsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-06T03:07:24.471763475Z[GMT]")
@Controller
@RequestMapping("${openapi.productionDebugRecorder.base-path:/v1}")
public class SessionsApiController implements SessionsApi {

    private static final Logger log = LoggerFactory.getLogger(SessionsApiController.class);

    private final SessionsService sessionsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public SessionsApiController(SessionsService sessionsService, GeneratedRequestValidator generatedRequestValidator) {
        this.sessionsService = sessionsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Bookmark> addBookmark(@PathVariable() UUID sessionId, @RequestBody() AddBookmarkRequest addBookmarkRequest) {
        log.info("Processing addBookmark request");
        try {
            generatedRequestValidator.validate("addBookmark", addBookmarkRequest);
            var response = sessionsService.addBookmark(sessionId, addBookmarkRequest);
            log.info("addBookmark completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process addBookmark: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<DebugSession> getDebugSession(@PathVariable() UUID sessionId, @RequestParam(value = "includeOutput", required = false, defaultValue = "true") Boolean includeOutput, @RequestParam(value = "redacted", required = false, defaultValue = "true") Boolean redacted) {
        log.info("Processing getDebugSession request");
        try {
            var response = sessionsService.getDebugSession(sessionId, includeOutput, redacted);
            log.info("getDebugSession completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getDebugSession: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<DebugSession> startDebugSession(@RequestBody() StartDebugSessionRequest startDebugSessionRequest) {
        log.info("Processing startDebugSession request");
        try {
            generatedRequestValidator.validate("startDebugSession", startDebugSessionRequest);
            var response = sessionsService.startDebugSession(startDebugSessionRequest);
            log.info("startDebugSession completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process startDebugSession: {}", e.getMessage(), e);
            throw e;
        }
    }
}
