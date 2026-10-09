package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * SessionListContentInner
 */
@JsonTypeName("SessionList_content_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T09:30:22.044820552Z[GMT]")public class SessionListContentInner {

  private UUID sessionId;

  private String title;

  private String engineerId;

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  private Integer durationSeconds;

  private Integer totalSteps;

  private Integer bookmarksCount;

  private String rootCauseSummary;

  private String incidentId;

  @Valid
  private List<String> matchHighlights;

  public SessionListContentInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SessionListContentInner(UUID sessionId, String title, String engineerId, String targetSystem, StatusEnum status, OffsetDateTime startedAt, Integer durationSeconds, Integer totalSteps) {
    this.sessionId = sessionId;
    this.title = title;
    this.engineerId = engineerId;
    this.targetSystem = targetSystem;
    this.status = status;
    this.startedAt = startedAt;
    this.durationSeconds = durationSeconds;
    this.totalSteps = totalSteps;
  }

  public SessionListContentInner sessionId(UUID sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  @NotNull @Valid   @Schema(name = "sessionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sessionId")
  public UUID getSessionId() {
    return sessionId;
  }

  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }

  public SessionListContentInner title(String title) {
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

  public SessionListContentInner engineerId(String engineerId) {
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

  public SessionListContentInner targetSystem(String targetSystem) {
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

  public SessionListContentInner environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
    @Schema(name = "environment", example = "PRODUCTION", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public SessionListContentInner status(StatusEnum status) {
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

  public SessionListContentInner startedAt(OffsetDateTime startedAt) {
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

  public SessionListContentInner durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Get durationSeconds
   * @return durationSeconds
  */
  @NotNull   @Schema(name = "durationSeconds", example = "1245", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public SessionListContentInner totalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
    return this;
  }

  /**
   * Get totalSteps
   * @return totalSteps
  */
  @NotNull   @Schema(name = "totalSteps", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalSteps")
  public Integer getTotalSteps() {
    return totalSteps;
  }

  public void setTotalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
  }

  public SessionListContentInner bookmarksCount(Integer bookmarksCount) {
    this.bookmarksCount = bookmarksCount;
    return this;
  }

  /**
   * Get bookmarksCount
   * @return bookmarksCount
  */
    @Schema(name = "bookmarksCount", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmarksCount")
  public Integer getBookmarksCount() {
    return bookmarksCount;
  }

  public void setBookmarksCount(Integer bookmarksCount) {
    this.bookmarksCount = bookmarksCount;
  }

  public SessionListContentInner rootCauseSummary(String rootCauseSummary) {
    this.rootCauseSummary = rootCauseSummary;
    return this;
  }

  /**
   * Get rootCauseSummary
   * @return rootCauseSummary
  */
    @Schema(name = "rootCauseSummary", example = "Thread pool exhaustion caused by slow downstream API.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootCauseSummary")
  public String getRootCauseSummary() {
    return rootCauseSummary;
  }

  public void setRootCauseSummary(String rootCauseSummary) {
    this.rootCauseSummary = rootCauseSummary;
  }

  public SessionListContentInner incidentId(String incidentId) {
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

  public SessionListContentInner matchHighlights(List<String> matchHighlights) {
    this.matchHighlights = matchHighlights;
    return this;
  }

  public SessionListContentInner addMatchHighlightsItem(String matchHighlightsItem) {
    if (this.matchHighlights == null) {
      this.matchHighlights = new ArrayList<>();
    }
    this.matchHighlights.add(matchHighlightsItem);
    return this;
  }

  /**
   * Snippets of matched content from full-text search.
   * @return matchHighlights
  */
    @Schema(name = "matchHighlights", example = "[\"...HikariCP pool maxed at 20, wait queue at 500ms+...\",\"...connection pool exhaustion confirmed via metrics...\"]", description = "Snippets of matched content from full-text search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchHighlights")
  public List<String> getMatchHighlights() {
    return matchHighlights;
  }

  public void setMatchHighlights(List<String> matchHighlights) {
    this.matchHighlights = matchHighlights;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionListContentInner sessionListContentInner = (SessionListContentInner) o;
    return Objects.equals(this.sessionId, sessionListContentInner.sessionId) &&
        Objects.equals(this.title, sessionListContentInner.title) &&
        Objects.equals(this.engineerId, sessionListContentInner.engineerId) &&
        Objects.equals(this.targetSystem, sessionListContentInner.targetSystem) &&
        Objects.equals(this.environment, sessionListContentInner.environment) &&
        Objects.equals(this.status, sessionListContentInner.status) &&
        Objects.equals(this.startedAt, sessionListContentInner.startedAt) &&
        Objects.equals(this.durationSeconds, sessionListContentInner.durationSeconds) &&
        Objects.equals(this.totalSteps, sessionListContentInner.totalSteps) &&
        Objects.equals(this.bookmarksCount, sessionListContentInner.bookmarksCount) &&
        Objects.equals(this.rootCauseSummary, sessionListContentInner.rootCauseSummary) &&
        Objects.equals(this.incidentId, sessionListContentInner.incidentId) &&
        Objects.equals(this.matchHighlights, sessionListContentInner.matchHighlights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, title, engineerId, targetSystem, environment, status, startedAt, durationSeconds, totalSteps, bookmarksCount, rootCauseSummary, incidentId, matchHighlights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionListContentInner {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    engineerId: ").append(toIndentedString(engineerId)).append("\n");
    sb.append("    targetSystem: ").append(toIndentedString(targetSystem)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
    sb.append("    bookmarksCount: ").append(toIndentedString(bookmarksCount)).append("\n");
    sb.append("    rootCauseSummary: ").append(toIndentedString(rootCauseSummary)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    matchHighlights: ").append(toIndentedString(matchHighlights)).append("\n");
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

