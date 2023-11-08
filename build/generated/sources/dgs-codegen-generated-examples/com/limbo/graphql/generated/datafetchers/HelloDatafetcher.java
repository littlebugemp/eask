package com.limbo.graphql.generated.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.lang.String;

@DgsComponent
public class HelloDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "hello"
  )
  public String getHello(DataFetchingEnvironment dataFetchingEnvironment) {
    return "";
  }
}
