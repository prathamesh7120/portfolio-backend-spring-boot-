package com.portfolio.backend.repository;

import com.portfolio.backend.model.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SkillRepository extends MongoRepository<Skill, String> {
    List<Skill> findByCategory(String category);
}