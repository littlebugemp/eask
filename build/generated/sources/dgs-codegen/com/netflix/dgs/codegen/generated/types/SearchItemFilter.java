package com.netflix.dgs.codegen.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SearchItemFilter {
  private String keyword;

  public SearchItemFilter() {
  }

  public SearchItemFilter(String keyword) {
    this.keyword = keyword;
  }

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  @Override
  public String toString() {
    return "SearchItemFilter{" + "keyword='" + keyword + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchItemFilter that = (SearchItemFilter) o;
        return java.util.Objects.equals(keyword, that.keyword);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(keyword);
  }

  public static com.netflix.dgs.codegen.generated.types.SearchItemFilter.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String keyword;

    public SearchItemFilter build() {
      com.netflix.dgs.codegen.generated.types.SearchItemFilter result = new com.netflix.dgs.codegen.generated.types.SearchItemFilter();
          result.keyword = this.keyword;
          return result;
    }

    public com.netflix.dgs.codegen.generated.types.SearchItemFilter.Builder keyword(
        String keyword) {
      this.keyword = keyword;
      return this;
    }
  }
}
