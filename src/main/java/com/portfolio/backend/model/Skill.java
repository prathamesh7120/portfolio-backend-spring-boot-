package com.portfolio.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "skills")
public class Skill {
    @Id
    private String id;
    private String name;
    private int level;        // 0-100
    private String category;  // Backend, Frontend, Database & Tools
    private String color;     // indigo, cyan, violet
}