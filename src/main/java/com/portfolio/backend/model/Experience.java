package com.portfolio.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "experience")
public class Experience {
    @Id
    private String id;
    private String year;
    private String title;
    private String company;
    private String description;
    private String color;     // indigo, cyan, violet
    private String dot;       // hex color e.g. #6366f1
    private int order;        // display order
}