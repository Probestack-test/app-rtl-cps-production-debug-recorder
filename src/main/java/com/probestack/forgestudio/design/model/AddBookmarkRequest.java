package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AddBookmarkRequest
 */
@JsonTypeName("addBookmark_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T09:30:22.044820552Z[GMT]")public class AddBookmarkRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String title;

  private String description;

  /**
   * Category of the bookmark.
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

  public AddBookmarkRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddBookmarkRequest(OffsetDateTime timestamp, String title) {
    this.timestamp = timestamp;
    this.title = title;
  }

  public AddBookmarkRequest timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * When in the session this bookmark refers to.
   * @return timestamp
  */
  @NotNull @Valid   @Schema(name = "timestamp", example = "2026-10-06T14:32:18Z", description = "When in the session this bookmark refers to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public AddBookmarkRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Short title for the bookmark.
   * @return title
  */
  @NotNull   @Schema(name = "title", example = "Root cause identified: thread pool exhaustion", description = "Short title for the bookmark.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AddBookmarkRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional longer explanation.
   * @return description
  */
    @Schema(name = "description", example = "HikariCP pool maxed at 20, wait queue at 500ms+.", description = "Optional longer explanation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AddBookmarkRequest bookmarkType(BookmarkTypeEnum bookmarkType) {
    this.bookmarkType = bookmarkType;
    return this;
  }

  /**
   * Category of the bookmark.
   * @return bookmarkType
  */
    @Schema(name = "bookmarkType", example = "ROOT_CAUSE", description = "Category of the bookmark.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmarkType")
  public BookmarkTypeEnum getBookmarkType() {
    return bookmarkType;
  }

  public void setBookmarkType(BookmarkTypeEnum bookmarkType) {
    this.bookmarkType = bookmarkType;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddBookmarkRequest addBookmarkRequest = (AddBookmarkRequest) o;
    return Objects.equals(this.timestamp, addBookmarkRequest.timestamp) &&
        Objects.equals(this.title, addBookmarkRequest.title) &&
        Objects.equals(this.description, addBookmarkRequest.description) &&
        Objects.equals(this.bookmarkType, addBookmarkRequest.bookmarkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, title, description, bookmarkType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddBookmarkRequest {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bookmarkType: ").append(toIndentedString(bookmarkType)).append("\n");
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

