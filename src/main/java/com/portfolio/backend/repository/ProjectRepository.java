package com.portfolio.backend.repository;

import com.portfolio.backend.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ProjectRepository extends MongoRepository<Project, String> {

    // Spring Data generates the query automatically from the method name
    List<Project> findByCategory(String category);
    List<Project> findByFeaturedTrue();
}