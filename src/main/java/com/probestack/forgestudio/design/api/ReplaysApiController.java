package com.probestack.forgestudio.design.api;

import java.time.OffsetDateTime;
import com.probestack.forgestudio.design.model.SessionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ReplaysService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T09:30:22.044820552Z[GMT]")
@Controller
@RequestMapping("${openapi.productionDebugRecorder.base-path:/v1}")
public class ReplaysApiController implements ReplaysApi {

    private static final Logger log = LoggerFactory.getLogger(ReplaysApiController.class);

    private final ReplaysService replaysService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ReplaysApiController(ReplaysService replaysService, GeneratedRequestValidator generatedRequestValidator) {
        this.replaysService = replaysService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<SessionList> searchDebugSessions(@RequestParam(value = "q", required = false) String q, @RequestParam(value = "engineerId", required = false) String engineerId, @RequestParam(value = "targetSystem", required = false) String targetSystem, @RequestParam(value = "incidentId", required = false) String incidentId, @RequestParam(value = "bookmarkType", required = false) String bookmarkType, @RequestParam(value = "status", required = false) String status, @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate, @RequestParam(value = "toDate", required = false) OffsetDateTime toDate, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing searchDebugSessions request");
        try {
            var response = replaysService.searchDebugSessions(q, engineerId, targetSystem, incidentId, bookmarkType, status, fromDate, toDate, page, size);
            log.info("searchDebugSessions completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process searchDebugSessions: {}", e.getMessage(), e);
            throw e;
        }
    }
}
