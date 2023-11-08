package com.netflix.dgs.codegen.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Solution implements com.netflix.dgs.codegen.generated.types.SearchableItem {
  private String id;

  private OffsetDateTime createDateTime;

  private String prettyCreateDateTime;

  private String content;

  private SolutionCategory category;

  private Integer voteAsGoodCount;

  private Integer voteAsBasCount;

  public Solution() {
  }

  public Solution(String id, OffsetDateTime createDateTime, String prettyCreateDateTime,
      String content, SolutionCategory category, Integer voteAsGoodCount, Integer voteAsBasCount) {
    this.id = id;
    this.createDateTime = createDateTime;
    this.prettyCreateDateTime = prettyCreateDateTime;
    this.content = content;
    this.category = category;
    this.voteAsGoodCount = voteAsGoodCount;
    this.voteAsBasCount = voteAsBasCount;
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

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public SolutionCategory getCategory() {
    return category;
  }

  public void setCategory(SolutionCategory category) {
    this.category = category;
  }

  public Integer getVoteAsGoodCount() {
    return voteAsGoodCount;
  }

  public void setVoteAsGoodCount(Integer voteAsGoodCount) {
    this.voteAsGoodCount = voteAsGoodCount;
  }

  public Integer getVoteAsBasCount() {
    return voteAsBasCount;
  }

  public void setVoteAsBasCount(Integer voteAsBasCount) {
    this.voteAsBasCount = voteAsBasCount;
  }

  @Override
  public String toString() {
    return "Solution{" + "id='" + id + "'," +"createDateTime='" + createDateTime + "'," +"prettyCreateDateTime='" + prettyCreateDateTime + "'," +"content='" + content + "'," +"category='" + category + "'," +"voteAsGoodCount='" + voteAsGoodCount + "'," +"voteAsBasCount='" + voteAsBasCount + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution that = (Solution) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(createDateTime, that.createDateTime) &&
                            java.util.Objects.equals(prettyCreateDateTime, that.prettyCreateDateTime) &&
                            java.util.Objects.equals(content, that.content) &&
                            java.util.Objects.equals(category, that.category) &&
                            java.util.Objects.equals(voteAsGoodCount, that.voteAsGoodCount) &&
                            java.util.Objects.equals(voteAsBasCount, that.voteAsBasCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, createDateTime, prettyCreateDateTime, content, category, voteAsGoodCount, voteAsBasCount);
  }

  public static com.netflix.dgs.codegen.generated.types.Solution.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private OffsetDateTime createDateTime;

    private String prettyCreateDateTime;

    private String content;

    private SolutionCategory category;

    private Integer voteAsGoodCount;

    private Integer voteAsBasCount;

    public Solution build() {
                  com.netflix.dgs.codegen.generated.types.Solution result = new com.netflix.dgs.codegen.generated.types.Solution();
                      result.id = this.id;
          result.createDateTime = this.createDateTime;
          result.prettyCreateDateTime = this.prettyCreateDateTime;
          result.content = this.content;
          result.category = this.category;
          result.voteAsGoodCount = this.voteAsGoodCount;
          result.voteAsBasCount = this.voteAsBasCount;
                      return result;
    }

    public com.netflix.dgs.codegen.generated.types.Solution.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Solution.Builder createDateTime(
        OffsetDateTime createDateTime) {
      this.createDateTime = createDateTime;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Solution.Builder prettyCreateDateTime(
        String prettyCreateDateTime) {
      this.prettyCreateDateTime = prettyCreateDateTime;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Solution.Builder content(String content) {
      this.content = content;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Solution.Builder category(
        SolutionCategory category) {
      this.category = category;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Solution.Builder voteAsGoodCount(
        Integer voteAsGoodCount) {
      this.voteAsGoodCount = voteAsGoodCount;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.Solution.Builder voteAsBasCount(
        Integer voteAsBasCount) {
      this.voteAsBasCount = voteAsBasCount;
      return this;
    }
  }
}
