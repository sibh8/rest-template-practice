package com.example.resttemplatepractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@NoArgsConstructor
public class RestTemplatePractice {

    public void getResultsFromRestTemplatePractice(){
        RestTemplate restTemplate = new RestTemplate();
        String productsUrl = "https://fakestoreapi.com/products";

        ResponseEntity<Product> responseEntity = restTemplate.getForEntity(productsUrl+"/1", Product.class);
        System.out.println(responseEntity);
    }
}
