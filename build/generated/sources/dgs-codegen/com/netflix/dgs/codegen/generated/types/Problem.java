package com.netflix.dgs.codegen.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Problem implements com.netflix.dgs.codegen.generated.types.SearchableItem {
  private String id;

  private OffsetDateTime createDateTime;

  private String prettyCreateDateTime;

  private String title;

  private String content;

  private List<String> tags;

  private int solutionCount;

  public Problem() {
  }

  public Problem(String id, OffsetDateTime createDateTime, String prettyCreateDateTime,
      String title, String content, List<String> tags, int solutionCount) {
    this.id = id;
    this.createDateTime = createDateTime;
    this.prettyCreateDateTime = prettyCreateDateTime;
    this.title = title;
    this.content = content;
    this.tags = tags;
    this.solutionCount = solutionCount;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public String getPrettyCreateDateTime() {
    return prettyCreateDateTime;
  }

  public void setPrettyCreateDateTime(String prettyCreateDateTime) {
    this.prettyCreateDateTime = prettyCreateDateTime;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public int getSolutionCount() {
    return solutionCount;
  }

  public void setSolutionCount(int solutionCount) {
    this.solutionCount = solutionCount;
  }

  @Override
  public String toString() {
    return "Problem{" + "id='" + id + "'," +"createDateTime='" + createDateTime + "'," +"prettyCreateDateTime='" + prettyCreateDateTime + "'," +"title='" + title + "'," +"content='" + content + "'," +"tags='" + tags + "'," +"solutionCount='" + solutionCount + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Problem that = (Problem) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(createDateTime, that.createDateTime) &&
                            java.util.Objects.equals(prettyCreateDateTime, that.prettyCreateDateTime) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(content, that.content) &&
                            java.util.Objects.equals(tags, that.tags) &&
                            solutionCount == that.solutionCount;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, createDateTime, prettyCreateDateTime, title, content, tags, solutionCount);
  }

  public static com.netflix.dgs.codegen.generated.types.Problem.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private OffsetDateTime createDateTime;

    private String prettyCreateDateTime;

    private String title;

    private String content;

    private List<String> tags;

    private int solutionCount;

    public Problem build() {
                  com.netflix.dgs.codegen.generated.types.Problem result = new com.netflix.dgs.codegen.generated.types.Problem();
                      result.id = this.id;
          result.createDateTime = this.createDateTime;
          result.prettyCreateDateTime = this.prettyCreateDateTime;
          result.title = this.title;
          result.content = this.content;
          result.tags = this.tags;
          result.solutionCount = this.solutionCount;
                      return result;
    }

    public com.netflix.dgs.codegen.generated.types.Problem.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Problem.Builder createDateTime(
        OffsetDateTime createDateTime) {
      this.createDateTime = createDateTime;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Problem.Builder prettyCreateDateTime(
        String prettyCreateDateTime) {
      this.prettyCreateDateTime = prettyCreateDateTime;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Problem.Builder title(String title) {
      this.title = title;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Problem.Builder content(String content) {
      this.content = content;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Problem.Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Problem.Builder solutionCount(
        int solutionCount) {
      this.solutionCount = solutionCount;
      return this;
    }
  }
}
