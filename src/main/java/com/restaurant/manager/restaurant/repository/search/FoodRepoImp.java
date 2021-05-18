// package com.restaurant.manager.restaurant.repository.search;

// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.restaurant.manager.restaurant.domain.Food;

// import org.apache.http.HttpHost;
// import org.elasticsearch.action.search.SearchRequest;
// import org.elasticsearch.action.search.SearchResponse;
// import org.elasticsearch.client.RequestOptions;
// import org.elasticsearch.client.RestClient;
// import org.elasticsearch.client.RestHighLevelClient;
// import org.elasticsearch.index.query.QueryBuilders;
// import org.elasticsearch.search.SearchHit;
// import org.elasticsearch.search.builder.SearchSourceBuilder;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;

// @Component
// public class FoodRepoImp implements FoodRepo {
//     @Autowired
//     private ObjectMapper objectMapper;

//     RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));

//     @Override
//     public List<Food> findAllFoodFromElastic() {
//         SearchRequest searchRequest = new SearchRequest();
//         searchRequest.indices("food");
//         SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
//         searchSourceBuilder.query(QueryBuilders.matchAllQuery());
//         searchRequest.source(searchSourceBuilder);
//         List<Food> foodList = new ArrayList<>();
//         SearchResponse searchResponse = null;
//         try {
//             searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
//             if (searchResponse.getHits().getTotalHits().value > 0) {
//                 SearchHit[] searchHit = searchResponse.getHits().getHits();
//                 for (SearchHit hit : searchHit) {
//                     Map<String, Object> map = hit.getSourceAsMap();
//                     foodList.add(objectMapper.convertValue(map, Food.class));
//                 }
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return foodList;
//     }

// }
