package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.Bookmark;
import com.probestack.forgestudio.design.model.DebugSessionRecordedStepsInner;
import com.probestack.forgestudio.design.model.DebugSessionSummary;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DebugSession
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T09:30:22.044820552Z[GMT]")public class DebugSession {

  private UUID sessionId;

  private String title;

  private String engineerId;

  private String engineerName;

  private String targetSystem;

  /**
   * Gets or Sets environment
   */
  public enum EnvironmentEnum {
    STAGING("STAGING"),
    
    PRODUCTION("PRODUCTION");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnvironmentEnum environment;

  private String purpose;

  private String incidentId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RECORDING("RECORDING"),
    
    COMPLETED("COMPLETED"),
    
    ABORTED("ABORTED"),
    
    TIMEOUT("TIMEOUT");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  /**
   * Gets or Sets captureMode
   */
  public enum CaptureModeEnum {
    COMMANDS_ONLY("COMMANDS_ONLY"),
    
    COMMANDS_AND_OUTPUT("COMMANDS_AND_OUTPUT"),
    
    FULL_TERMINAL("FULL_TERMINAL"),
    
    SHELL_AND_HTTP("SHELL_AND_HTTP");

    private String value;

    CaptureModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CaptureModeEnum fromValue(String value) {
      for (CaptureModeEnum b : CaptureModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CaptureModeEnum captureMode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endedAt;

  private Integer durationSeconds;

  @Valid
  private List<@Valid DebugSessionRecordedStepsInner> recordedSteps = new ArrayList<>();

  @Valid
  private List<@Valid Bookmark> bookmarks;

  @Valid
  private List<String> shareWith;

  @Valid
  private List<String> redactPatterns;

  private DebugSessionSummary summary;

  private String recordedBy;

  private String auditReference;

  public DebugSession() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DebugSession(UUID sessionId, String title, String engineerId, String targetSystem, EnvironmentEnum environment, StatusEnum status, OffsetDateTime startedAt, List<@Valid DebugSessionRecordedStepsInner> recordedSteps) {
    this.sessionId = sessionId;
    this.title = title;
    this.engineerId = engineerId;
    this.targetSystem = targetSystem;
    this.environment = environment;
    this.status = status;
    this.startedAt = startedAt;
    this.recordedSteps = recordedSteps;
  }

  public DebugSession sessionId(UUID sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  @NotNull @Valid   @Schema(name = "sessionId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sessionId")
  public UUID getSessionId() {
    return sessionId;
  }

  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }

  public DebugSession title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull   @Schema(name = "title", example = "Payment timeout investigation - 2026-10-06", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DebugSession engineerId(String engineerId) {
    this.engineerId = engineerId;
    return this;
  }

  /**
   * Get engineerId
   * @return engineerId
  */
  @NotNull   @Schema(name = "engineerId", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engineerId")
  public String getEngineerId() {
    return engineerId;
  }

  public void setEngineerId(String engineerId) {
    this.engineerId = engineerId;
  }

  public DebugSession engineerName(String engineerName) {
    this.engineerName = engineerName;
    return this;
  }

  /**
   * Get engineerName
   * @return engineerName
  */
    @Schema(name = "engineerName", example = "Amit Kumar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engineerName")
  public String getEngineerName() {
    return engineerName;
  }

  public void setEngineerName(String engineerName) {
    this.engineerName = engineerName;
  }

  public DebugSession targetSystem(String targetSystem) {
    this.targetSystem = targetSystem;
    return this;
  }

  /**
   * Get targetSystem
   * @return targetSystem
  */
  @NotNull   @Schema(name = "targetSystem", example = "payment-processor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetSystem")
  public String getTargetSystem() {
    return targetSystem;
  }

  public void setTargetSystem(String targetSystem) {
    this.targetSystem = targetSystem;
  }

  public DebugSession environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public DebugSession purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
  */
    @Schema(name = "purpose", example = "Investigating 5xx spike on /charge endpoint since 14:00 UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public DebugSession incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * Get incidentId
   * @return incidentId
  */
    @Schema(name = "incidentId", example = "INC-2050", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentId")
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public DebugSession status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "COMPLETED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DebugSession captureMode(CaptureModeEnum captureMode) {
    this.captureMode = captureMode;
    return this;
  }

  /**
   * Get captureMode
   * @return captureMode
  */
    @Schema(name = "captureMode", example = "SHELL_AND_HTTP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("captureMode")
  public CaptureModeEnum getCaptureMode() {
    return captureMode;
  }

  public void setCaptureMode(CaptureModeEnum captureMode) {
    this.captureMode = captureMode;
  }

  public DebugSession startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @NotNull @Valid   @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public DebugSession endedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
    return this;
  }

  /**
   * Get endedAt
   * @return endedAt
  */
  @Valid   @Schema(name = "endedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endedAt")
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }

  public DebugSession durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Get durationSeconds
   * @return durationSeconds
  */
    @Schema(name = "durationSeconds", example = "1245", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public DebugSession recordedSteps(List<@Valid DebugSessionRecordedStepsInner> recordedSteps) {
    this.recordedSteps = recordedSteps;
    return this;
  }

  public DebugSession addRecordedStepsItem(DebugSessionRecordedStepsInner recordedStepsItem) {
    if (this.recordedSteps == null) {
      this.recordedSteps = new ArrayList<>();
    }
    this.recordedSteps.add(recordedStepsItem);
    return this;
  }

  /**
   * Chronological list of every action in the session.
   * @return recordedSteps
  */
  @NotNull @Valid   @Schema(name = "recordedSteps", description = "Chronological list of every action in the session.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recordedSteps")
  public List<@Valid DebugSessionRecordedStepsInner> getRecordedSteps() {
    return recordedSteps;
  }

  public void setRecordedSteps(List<@Valid DebugSessionRecordedStepsInner> recordedSteps) {
    this.recordedSteps = recordedSteps;
  }

  public DebugSession bookmarks(List<@Valid Bookmark> bookmarks) {
    this.bookmarks = bookmarks;
    return this;
  }

  public DebugSession addBookmarksItem(Bookmark bookmarksItem) {
    if (this.bookmarks == null) {
      this.bookmarks = new ArrayList<>();
    }
    this.bookmarks.add(bookmarksItem);
    return this;
  }

  /**
   * Get bookmarks
   * @return bookmarks
  */
  @Valid   @Schema(name = "bookmarks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmarks")
  public List<@Valid Bookmark> getBookmarks() {
    return bookmarks;
  }

  public void setBookmarks(List<@Valid Bookmark> bookmarks) {
    this.bookmarks = bookmarks;
  }

  public DebugSession shareWith(List<String> shareWith) {
    this.shareWith = shareWith;
    return this;
  }

  public DebugSession addShareWithItem(String shareWithItem) {
    if (this.shareWith == null) {
      this.shareWith = new ArrayList<>();
    }
    this.shareWith.add(shareWithItem);
    return this;
  }

  /**
   * Get shareWith
   * @return shareWith
  */
    @Schema(name = "shareWith", example = "[\"payments-team\",\"sre-team@forgesphere.example.com\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shareWith")
  public List<String> getShareWith() {
    return shareWith;
  }

  public void setShareWith(List<String> shareWith) {
    this.shareWith = shareWith;
  }

  public DebugSession redactPatterns(List<String> redactPatterns) {
    this.redactPatterns = redactPatterns;
    return this;
  }

  public DebugSession addRedactPatternsItem(String redactPatternsItem) {
    if (this.redactPatterns == null) {
      this.redactPatterns = new ArrayList<>();
    }
    this.redactPatterns.add(redactPatternsItem);
    return this;
  }

  /**
   * Get redactPatterns
   * @return redactPatterns
  */
    @Schema(name = "redactPatterns", example = "[\"password=.*\",\"token=.*\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redactPatterns")
  public List<String> getRedactPatterns() {
    return redactPatterns;
  }

  public void setRedactPatterns(List<String> redactPatterns) {
    this.redactPatterns = redactPatterns;
  }

  public DebugSession summary(DebugSessionSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public DebugSessionSummary getSummary() {
    return summary;
  }

  public void setSummary(DebugSessionSummary summary) {
    this.summary = summary;
  }

  public DebugSession recordedBy(String recordedBy) {
    this.recordedBy = recordedBy;
    return this;
  }

  /**
   * Get recordedBy
   * @return recordedBy
  */
    @Schema(name = "recordedBy", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordedBy")
  public String getRecordedBy() {
    return recordedBy;
  }

  public void setRecordedBy(String recordedBy) {
    this.recordedBy = recordedBy;
  }

  public DebugSession auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://debug-recorder/session-9c8f1a3b", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSession debugSession = (DebugSession) o;
    return Objects.equals(this.sessionId, debugSession.sessionId) &&
        Objects.equals(this.title, debugSession.title) &&
        Objects.equals(this.engineerId, debugSession.engineerId) &&
        Objects.equals(this.engineerName, debugSession.engineerName) &&
        Objects.equals(this.targetSystem, debugSession.targetSystem) &&
        Objects.equals(this.environment, debugSession.environment) &&
        Objects.equals(this.purpose, debugSession.purpose) &&
        Objects.equals(this.incidentId, debugSession.incidentId) &&
        Objects.equals(this.status, debugSession.status) &&
        Objects.equals(this.captureMode, debugSession.captureMode) &&
        Objects.equals(this.startedAt, debugSession.startedAt) &&
        Objects.equals(this.endedAt, debugSession.endedAt) &&
        Objects.equals(this.durationSeconds, debugSession.durationSeconds) &&
        Objects.equals(this.recordedSteps, debugSession.recordedSteps) &&
        Objects.equals(this.bookmarks, debugSession.bookmarks) &&
        Objects.equals(this.shareWith, debugSession.shareWith) &&
        Objects.equals(this.redactPatterns, debugSession.redactPatterns) &&
        Objects.equals(this.summary, debugSession.summary) &&
        Objects.equals(this.recordedBy, debugSession.recordedBy) &&
        Objects.equals(this.auditReference, debugSession.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, title, engineerId, engineerName, targetSystem, environment, purpose, incidentId, status, captureMode, startedAt, endedAt, durationSeconds, recordedSteps, bookmarks, shareWith, redactPatterns, summary, recordedBy, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugSession {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    engineerId: ").append(toIndentedString(engineerId)).append("\n");
    sb.append("    engineerName: ").append(toIndentedString(engineerName)).append("\n");
    sb.append("    targetSystem: ").append(toIndentedString(targetSystem)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    captureMode: ").append(toIndentedString(captureMode)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    recordedSteps: ").append(toIndentedString(recordedSteps)).append("\n");
    sb.append("    bookmarks: ").append(toIndentedString(bookmarks)).append("\n");
    sb.append("    shareWith: ").append(toIndentedString(shareWith)).append("\n");
    sb.append("    redactPatterns: ").append(toIndentedString(redactPatterns)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    recordedBy: ").append(toIndentedString(recordedBy)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

