package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.SessionListContentInner;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SessionList
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-06T05:01:44.455851395Z[GMT]")public class SessionList {

  @Valid
  private List<@Valid SessionListContentInner> content = new ArrayList<>();

  private Integer totalElements;

  private Integer totalPages;

  private Integer page;

  private Integer size;

  public SessionList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SessionList(List<@Valid SessionListContentInner> content, Integer totalElements, Integer totalPages) {
    this.content = content;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
  }

  public SessionList content(List<@Valid SessionListContentInner> content) {
    this.content = content;
    return this;
  }

  public SessionList addContentItem(SessionListContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull @Valid   @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid SessionListContentInner> getContent() {
    return content;
  }

  public void setContent(List<@Valid SessionListContentInner> content) {
    this.content = content;
  }

  public SessionList totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull   @Schema(name = "totalElements", example = "342", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public SessionList totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull   @Schema(name = "totalPages", example = "18", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public SessionList page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
    @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SessionList size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
    @Schema(name = "size", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionList sessionList = (SessionList) o;
    return Objects.equals(this.content, sessionList.content) &&
        Objects.equals(this.totalElements, sessionList.totalElements) &&
        Objects.equals(this.totalPages, sessionList.totalPages) &&
        Objects.equals(this.page, sessionList.page) &&
        Objects.equals(this.size, sessionList.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, page, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionList {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

