package com.limbo.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class HelloGraphQLQuery extends GraphQLQuery {
  public HelloGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public HelloGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "hello";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public HelloGraphQLQuery build() {
      return new HelloGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
