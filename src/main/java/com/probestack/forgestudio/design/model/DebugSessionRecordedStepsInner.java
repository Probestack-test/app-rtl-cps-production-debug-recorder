package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DebugSessionRecordedStepsInner
 */
@JsonTypeName("DebugSession_recordedSteps_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-06T05:01:44.455851395Z[GMT]")public class DebugSessionRecordedStepsInner {

  private UUID stepId;

  private Integer stepNumber;

  /**
   * Gets or Sets stepType
   */
  public enum StepTypeEnum {
    SHELL_COMMAND("SHELL_COMMAND"),
    
    SQL_QUERY("SQL_QUERY"),
    
    HTTP_CALL("HTTP_CALL"),
    
    KUBECTL_COMMAND("KUBECTL_COMMAND"),
    
    LOG_QUERY("LOG_QUERY"),
    
    METRIC_QUERY("METRIC_QUERY"),
    
    NOTE("NOTE"),
    
    FILE_VIEW("FILE_VIEW");

    private String value;

    StepTypeEnum(String value) {
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
    public static StepTypeEnum fromValue(String value) {
      for (StepTypeEnum b : StepTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StepTypeEnum stepType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String action;

  private String target;

  private String output;

  private Integer durationMs;

  private Integer exitCode;

  private String error;

  private String annotation;

  private Boolean bookmarked;

  private UUID bookmarkId;

  public DebugSessionRecordedStepsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DebugSessionRecordedStepsInner(UUID stepId, Integer stepNumber, StepTypeEnum stepType, OffsetDateTime timestamp, String action) {
    this.stepId = stepId;
    this.stepNumber = stepNumber;
    this.stepType = stepType;
    this.timestamp = timestamp;
    this.action = action;
  }

  public DebugSessionRecordedStepsInner stepId(UUID stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * Get stepId
   * @return stepId
  */
  @NotNull @Valid   @Schema(name = "stepId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stepId")
  public UUID getStepId() {
    return stepId;
  }

  public void setStepId(UUID stepId) {
    this.stepId = stepId;
  }

  public DebugSessionRecordedStepsInner stepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }

  /**
   * Get stepNumber
   * @return stepNumber
  */
  @NotNull   @Schema(name = "stepNumber", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stepNumber")
  public Integer getStepNumber() {
    return stepNumber;
  }

  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

  public DebugSessionRecordedStepsInner stepType(StepTypeEnum stepType) {
    this.stepType = stepType;
    return this;
  }

  /**
   * Get stepType
   * @return stepType
  */
  @NotNull   @Schema(name = "stepType", example = "SQL_QUERY", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stepType")
  public StepTypeEnum getStepType() {
    return stepType;
  }

  public void setStepType(StepTypeEnum stepType) {
    this.stepType = stepType;
  }

  public DebugSessionRecordedStepsInner timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @NotNull @Valid   @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public DebugSessionRecordedStepsInner action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The actual command or action.
   * @return action
  */
  @NotNull   @Schema(name = "action", example = "SELECT count(*) FROM payment_orders WHERE status='PENDING' AND created_at < NOW() - INTERVAL '5 min'", description = "The actual command or action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DebugSessionRecordedStepsInner target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Where the action was executed.
   * @return target
  */
    @Schema(name = "target", example = "payment-db-prod", description = "Where the action was executed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public DebugSessionRecordedStepsInner output(String output) {
    this.output = output;
    return this;
  }

  /**
   * The captured output (redacted if enabled).
   * @return output
  */
    @Schema(name = "output", example = "count: 42817", description = "The captured output (redacted if enabled).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public DebugSessionRecordedStepsInner durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Get durationMs
   * @return durationMs
  */
    @Schema(name = "durationMs", example = "245", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationMs")
  public Integer getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }

  public DebugSessionRecordedStepsInner exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Get exitCode
   * @return exitCode
  */
    @Schema(name = "exitCode", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exitCode")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public DebugSessionRecordedStepsInner error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
    @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public DebugSessionRecordedStepsInner annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * Optional note the engineer added inline.
   * @return annotation
  */
    @Schema(name = "annotation", example = "Normal backlog is <100; this confirms queue buildup.", description = "Optional note the engineer added inline.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annotation")
  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }

  public DebugSessionRecordedStepsInner bookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
    return this;
  }

  /**
   * Get bookmarked
   * @return bookmarked
  */
    @Schema(name = "bookmarked", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmarked")
  public Boolean getBookmarked() {
    return bookmarked;
  }

  public void setBookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
  }

  public DebugSessionRecordedStepsInner bookmarkId(UUID bookmarkId) {
    this.bookmarkId = bookmarkId;
    return this;
  }

  /**
   * Get bookmarkId
   * @return bookmarkId
  */
  @Valid   @Schema(name = "bookmarkId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmarkId")
  public UUID getBookmarkId() {
    return bookmarkId;
  }

  public void setBookmarkId(UUID bookmarkId) {
    this.bookmarkId = bookmarkId;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSessionRecordedStepsInner debugSessionRecordedStepsInner = (DebugSessionRecordedStepsInner) o;
    return Objects.equals(this.stepId, debugSessionRecordedStepsInner.stepId) &&
        Objects.equals(this.stepNumber, debugSessionRecordedStepsInner.stepNumber) &&
        Objects.equals(this.stepType, debugSessionRecordedStepsInner.stepType) &&
        Objects.equals(this.timestamp, debugSessionRecordedStepsInner.timestamp) &&
        Objects.equals(this.action, debugSessionRecordedStepsInner.action) &&
        Objects.equals(this.target, debugSessionRecordedStepsInner.target) &&
        Objects.equals(this.output, debugSessionRecordedStepsInner.output) &&
        Objects.equals(this.durationMs, debugSessionRecordedStepsInner.durationMs) &&
        Objects.equals(this.exitCode, debugSessionRecordedStepsInner.exitCode) &&
        Objects.equals(this.error, debugSessionRecordedStepsInner.error) &&
        Objects.equals(this.annotation, debugSessionRecordedStepsInner.annotation) &&
        Objects.equals(this.bookmarked, debugSessionRecordedStepsInner.bookmarked) &&
        Objects.equals(this.bookmarkId, debugSessionRecordedStepsInner.bookmarkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepId, stepNumber, stepType, timestamp, action, target, output, durationMs, exitCode, error, annotation, bookmarked, bookmarkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugSessionRecordedStepsInner {\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    bookmarked: ").append(toIndentedString(bookmarked)).append("\n");
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
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

