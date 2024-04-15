package com.example.resttemplatepractice.service;

import com.example.resttemplatepractice.models.Product;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@NoArgsConstructor
public class RestTemplatePractice {

    public void getResultsFromRestTemplatePractice(){
        RestTemplate restTemplate = new RestTemplate();
        String productsUrl = "https://fakestoreapi.com/products";

        ResponseEntity<Product> responseEntity = restTemplate.getForEntity(productsUrl+"/1", Product.class);
        System.out.println(responseEntity);
    }
}
