package com.portfolio.backend.repository;

import com.portfolio.backend.model.Education;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface EducationRepository
        extends MongoRepository<Education, String> {

    List<Education> findAllByOrderByOrderAsc();
}