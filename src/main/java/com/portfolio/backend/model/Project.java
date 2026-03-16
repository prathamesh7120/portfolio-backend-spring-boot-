package com.portfolio.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "projects")
public class Project {

    @Id
    private String id;

    private String title;
    private String description;
    private String category;
    private String icon;
    private boolean featured;
    private List<String> tech;
    private String liveUrl;
    private String githubUrl;
    private String color;
    private LocalDateTime createdAt = LocalDateTime.now();

}

