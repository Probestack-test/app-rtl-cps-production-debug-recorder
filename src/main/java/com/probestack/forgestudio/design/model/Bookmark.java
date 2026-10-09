package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Bookmark
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T09:30:22.044820552Z[GMT]")public class Bookmark {

  private UUID bookmarkId;

  private UUID sessionId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String title;

  private String description;

  /**
   * Gets or Sets bookmarkType
   */
  public enum BookmarkTypeEnum {
    MILESTONE("MILESTONE"),
    
    ROOT_CAUSE("ROOT_CAUSE"),
    
    FIX_APPLIED("FIX_APPLIED"),
    
    WARNING("WARNING"),
    
    DEAD_END("DEAD_END"),
    
    INSIGHT("INSIGHT");

    private String value;

    BookmarkTypeEnum(String value) {
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
    public static BookmarkTypeEnum fromValue(String value) {
      for (BookmarkTypeEnum b : BookmarkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private BookmarkTypeEnum bookmarkType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String createdBy;

  public Bookmark() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Bookmark(UUID bookmarkId, UUID sessionId, OffsetDateTime timestamp, String title, BookmarkTypeEnum bookmarkType, OffsetDateTime createdAt) {
    this.bookmarkId = bookmarkId;
    this.sessionId = sessionId;
    this.timestamp = timestamp;
    this.title = title;
    this.bookmarkType = bookmarkType;
    this.createdAt = createdAt;
  }

  public Bookmark bookmarkId(UUID bookmarkId) {
    this.bookmarkId = bookmarkId;
    return this;
  }

  /**
   * Get bookmarkId
   * @return bookmarkId
  */
  @NotNull @Valid   @Schema(name = "bookmarkId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bookmarkId")
  public UUID getBookmarkId() {
    return bookmarkId;
  }

  public void setBookmarkId(UUID bookmarkId) {
    this.bookmarkId = bookmarkId;
  }

  public Bookmark sessionId(UUID sessionId) {
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

  public Bookmark timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @NotNull @Valid   @Schema(name = "timestamp", example = "2026-10-06T14:32:18Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Bookmark title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull   @Schema(name = "title", example = "Root cause identified: thread pool exhaustion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Bookmark description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "HikariCP pool maxed at 20, wait queue at 500ms+.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bookmark bookmarkType(BookmarkTypeEnum bookmarkType) {
    this.bookmarkType = bookmarkType;
    return this;
  }

  /**
   * Get bookmarkType
   * @return bookmarkType
  */
  @NotNull   @Schema(name = "bookmarkType", example = "ROOT_CAUSE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bookmarkType")
  public BookmarkTypeEnum getBookmarkType() {
    return bookmarkType;
  }

  public void setBookmarkType(BookmarkTypeEnum bookmarkType) {
    this.bookmarkType = bookmarkType;
  }

  public Bookmark createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Bookmark createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
    @Schema(name = "createdBy", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bookmark bookmark = (Bookmark) o;
    return Objects.equals(this.bookmarkId, bookmark.bookmarkId) &&
        Objects.equals(this.sessionId, bookmark.sessionId) &&
        Objects.equals(this.timestamp, bookmark.timestamp) &&
        Objects.equals(this.title, bookmark.title) &&
        Objects.equals(this.description, bookmark.description) &&
        Objects.equals(this.bookmarkType, bookmark.bookmarkType) &&
        Objects.equals(this.createdAt, bookmark.createdAt) &&
        Objects.equals(this.createdBy, bookmark.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, sessionId, timestamp, title, description, bookmarkType, createdAt, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bookmark {\n");
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bookmarkType: ").append(toIndentedString(bookmarkType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

