package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StartDebugSessionRequest
 */
@JsonTypeName("startDebugSession_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-06T05:01:44.455851395Z[GMT]")public class StartDebugSessionRequest {

  private String title;

  private String engineerId;

  private String targetSystem;

  /**
   * Environment being debugged.
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

  private Integer maxDurationMinutes = 120;

  /**
   * What to record.
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
  private CaptureModeEnum captureMode = CaptureModeEnum.COMMANDS_AND_OUTPUT;

  @Valid
  private List<String> redactPatterns;

  @Valid
  private List<String> shareWith;

  public StartDebugSessionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StartDebugSessionRequest(String title, String engineerId, String targetSystem, EnvironmentEnum environment, String purpose) {
    this.title = title;
    this.engineerId = engineerId;
    this.targetSystem = targetSystem;
    this.environment = environment;
    this.purpose = purpose;
  }

  public StartDebugSessionRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Short description of what's being debugged.
   * @return title
  */
  @NotNull   @Schema(name = "title", example = "Payment timeout investigation - 2026-10-06", description = "Short description of what's being debugged.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public StartDebugSessionRequest engineerId(String engineerId) {
    this.engineerId = engineerId;
    return this;
  }

  /**
   * Engineer running the session.
   * @return engineerId
  */
  @NotNull   @Schema(name = "engineerId", example = "amit.kumar@forgesphere.example.com", description = "Engineer running the session.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engineerId")
  public String getEngineerId() {
    return engineerId;
  }

  public void setEngineerId(String engineerId) {
    this.engineerId = engineerId;
  }

  public StartDebugSessionRequest targetSystem(String targetSystem) {
    this.targetSystem = targetSystem;
    return this;
  }

  /**
   * System being debugged.
   * @return targetSystem
  */
  @NotNull   @Schema(name = "targetSystem", example = "payment-processor", description = "System being debugged.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetSystem")
  public String getTargetSystem() {
    return targetSystem;
  }

  public void setTargetSystem(String targetSystem) {
    this.targetSystem = targetSystem;
  }

  public StartDebugSessionRequest environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Environment being debugged.
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", description = "Environment being debugged.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public StartDebugSessionRequest purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Why the session is being run (min 20 chars).
   * @return purpose
  */
  @NotNull @Size(min = 20)   @Schema(name = "purpose", example = "Investigating 5xx spike on /charge endpoint since 14:00 UTC.", description = "Why the session is being run (min 20 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public StartDebugSessionRequest incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * Optional incident reference.
   * @return incidentId
  */
    @Schema(name = "incidentId", example = "INC-2050", description = "Optional incident reference.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentId")
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public StartDebugSessionRequest maxDurationMinutes(Integer maxDurationMinutes) {
    this.maxDurationMinutes = maxDurationMinutes;
    return this;
  }

  /**
   * Maximum session duration (auto-stops after this).
   * minimum: 15
   * maximum: 480
   * @return maxDurationMinutes
  */
  @Min(15) @Max(480)   @Schema(name = "maxDurationMinutes", example = "120", description = "Maximum session duration (auto-stops after this).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxDurationMinutes")
  public Integer getMaxDurationMinutes() {
    return maxDurationMinutes;
  }

  public void setMaxDurationMinutes(Integer maxDurationMinutes) {
    this.maxDurationMinutes = maxDurationMinutes;
  }

  public StartDebugSessionRequest captureMode(CaptureModeEnum captureMode) {
    this.captureMode = captureMode;
    return this;
  }

  /**
   * What to record.
   * @return captureMode
  */
    @Schema(name = "captureMode", example = "SHELL_AND_HTTP", description = "What to record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("captureMode")
  public CaptureModeEnum getCaptureMode() {
    return captureMode;
  }

  public void setCaptureMode(CaptureModeEnum captureMode) {
    this.captureMode = captureMode;
  }

  public StartDebugSessionRequest redactPatterns(List<String> redactPatterns) {
    this.redactPatterns = redactPatterns;
    return this;
  }

  public StartDebugSessionRequest addRedactPatternsItem(String redactPatternsItem) {
    if (this.redactPatterns == null) {
      this.redactPatterns = new ArrayList<>();
    }
    this.redactPatterns.add(redactPatternsItem);
    return this;
  }

  /**
   * Regex patterns to redact from recording.
   * @return redactPatterns
  */
    @Schema(name = "redactPatterns", example = "[\"password=.*\",\"token=.*\",\"\\\\b\\\\d{16}\\\\b\"]", description = "Regex patterns to redact from recording.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redactPatterns")
  public List<String> getRedactPatterns() {
    return redactPatterns;
  }

  public void setRedactPatterns(List<String> redactPatterns) {
    this.redactPatterns = redactPatterns;
  }

  public StartDebugSessionRequest shareWith(List<String> shareWith) {
    this.shareWith = shareWith;
    return this;
  }

  public StartDebugSessionRequest addShareWithItem(String shareWithItem) {
    if (this.shareWith == null) {
      this.shareWith = new ArrayList<>();
    }
    this.shareWith.add(shareWithItem);
    return this;
  }

  /**
   * Engineers or teams who can view the replay.
   * @return shareWith
  */
    @Schema(name = "shareWith", example = "[\"payments-team\",\"sre-team@forgesphere.example.com\"]", description = "Engineers or teams who can view the replay.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shareWith")
  public List<String> getShareWith() {
    return shareWith;
  }

  public void setShareWith(List<String> shareWith) {
    this.shareWith = shareWith;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartDebugSessionRequest startDebugSessionRequest = (StartDebugSessionRequest) o;
    return Objects.equals(this.title, startDebugSessionRequest.title) &&
        Objects.equals(this.engineerId, startDebugSessionRequest.engineerId) &&
        Objects.equals(this.targetSystem, startDebugSessionRequest.targetSystem) &&
        Objects.equals(this.environment, startDebugSessionRequest.environment) &&
        Objects.equals(this.purpose, startDebugSessionRequest.purpose) &&
        Objects.equals(this.incidentId, startDebugSessionRequest.incidentId) &&
        Objects.equals(this.maxDurationMinutes, startDebugSessionRequest.maxDurationMinutes) &&
        Objects.equals(this.captureMode, startDebugSessionRequest.captureMode) &&
        Objects.equals(this.redactPatterns, startDebugSessionRequest.redactPatterns) &&
        Objects.equals(this.shareWith, startDebugSessionRequest.shareWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, engineerId, targetSystem, environment, purpose, incidentId, maxDurationMinutes, captureMode, redactPatterns, shareWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartDebugSessionRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    engineerId: ").append(toIndentedString(engineerId)).append("\n");
    sb.append("    targetSystem: ").append(toIndentedString(targetSystem)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    maxDurationMinutes: ").append(toIndentedString(maxDurationMinutes)).append("\n");
    sb.append("    captureMode: ").append(toIndentedString(captureMode)).append("\n");
    sb.append("    redactPatterns: ").append(toIndentedString(redactPatterns)).append("\n");
    sb.append("    shareWith: ").append(toIndentedString(shareWith)).append("\n");
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

