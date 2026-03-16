package com.portfolio.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document(collection = "education")
public class Education {

    @Id
    private String id;
    private String year;
    private String degree;
    private String institute;
    private String description;
    private String score;
    private String badge;
    private String icon;
    private String color;
    private String accent;
    private List<String> certifications; // for cert card
    private int order;
}