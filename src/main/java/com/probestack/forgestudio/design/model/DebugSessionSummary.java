package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AI-generated summary of the session.
 */
@Schema(name = "DebugSession_summary", description = "AI-generated summary of the session.")
@JsonTypeName("DebugSession_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-06T05:01:44.455851395Z[GMT]")public class DebugSessionSummary {

  private String rootCause;

  private String fixApplied;

  private Integer totalSteps;

  private Integer deadEndsCount;

  private Integer timeToRootCauseMinutes;

  public DebugSessionSummary rootCause(String rootCause) {
    this.rootCause = rootCause;
    return this;
  }

  /**
   * Get rootCause
   * @return rootCause
  */
    @Schema(name = "rootCause", example = "Thread pool exhaustion caused by slow downstream API.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootCause")
  public String getRootCause() {
    return rootCause;
  }

  public void setRootCause(String rootCause) {
    this.rootCause = rootCause;
  }

  public DebugSessionSummary fixApplied(String fixApplied) {
    this.fixApplied = fixApplied;
    return this;
  }

  /**
   * Get fixApplied
   * @return fixApplied
  */
    @Schema(name = "fixApplied", example = "Increased HikariCP pool from 20 to 50; added circuit breaker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fixApplied")
  public String getFixApplied() {
    return fixApplied;
  }

  public void setFixApplied(String fixApplied) {
    this.fixApplied = fixApplied;
  }

  public DebugSessionSummary totalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
    return this;
  }

  /**
   * Get totalSteps
   * @return totalSteps
  */
    @Schema(name = "totalSteps", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSteps")
  public Integer getTotalSteps() {
    return totalSteps;
  }

  public void setTotalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
  }

  public DebugSessionSummary deadEndsCount(Integer deadEndsCount) {
    this.deadEndsCount = deadEndsCount;
    return this;
  }

  /**
   * Number of paths investigated that led nowhere.
   * @return deadEndsCount
  */
    @Schema(name = "deadEndsCount", example = "3", description = "Number of paths investigated that led nowhere.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deadEndsCount")
  public Integer getDeadEndsCount() {
    return deadEndsCount;
  }

  public void setDeadEndsCount(Integer deadEndsCount) {
    this.deadEndsCount = deadEndsCount;
  }

  public DebugSessionSummary timeToRootCauseMinutes(Integer timeToRootCauseMinutes) {
    this.timeToRootCauseMinutes = timeToRootCauseMinutes;
    return this;
  }

  /**
   * Get timeToRootCauseMinutes
   * @return timeToRootCauseMinutes
  */
    @Schema(name = "timeToRootCauseMinutes", example = "18", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeToRootCauseMinutes")
  public Integer getTimeToRootCauseMinutes() {
    return timeToRootCauseMinutes;
  }

  public void setTimeToRootCauseMinutes(Integer timeToRootCauseMinutes) {
    this.timeToRootCauseMinutes = timeToRootCauseMinutes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSessionSummary debugSessionSummary = (DebugSessionSummary) o;
    return Objects.equals(this.rootCause, debugSessionSummary.rootCause) &&
        Objects.equals(this.fixApplied, debugSessionSummary.fixApplied) &&
        Objects.equals(this.totalSteps, debugSessionSummary.totalSteps) &&
        Objects.equals(this.deadEndsCount, debugSessionSummary.deadEndsCount) &&
        Objects.equals(this.timeToRootCauseMinutes, debugSessionSummary.timeToRootCauseMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootCause, fixApplied, totalSteps, deadEndsCount, timeToRootCauseMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugSessionSummary {\n");
    sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
    sb.append("    fixApplied: ").append(toIndentedString(fixApplied)).append("\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
    sb.append("    deadEndsCount: ").append(toIndentedString(deadEndsCount)).append("\n");
    sb.append("    timeToRootCauseMinutes: ").append(toIndentedString(timeToRootCauseMinutes)).append("\n");
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

