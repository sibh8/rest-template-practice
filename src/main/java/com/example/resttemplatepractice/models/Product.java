package com.example.resttemplatepractice.models;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private Integer id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
