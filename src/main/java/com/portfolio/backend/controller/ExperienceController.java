package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experience;
import com.portfolio.backend.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/experience")
@RequiredArgsConstructor
@CrossOrigin(origins = "${cors.allowed-origin}")
public class ExperienceController {

    private final ExperienceRepository experienceRepository;

    @GetMapping
    public ResponseEntity<List<Experience>> getAll() {
        return ResponseEntity.ok(
                experienceRepository.findAllByOrderByOrderAsc());
    }

    @PostMapping
    public ResponseEntity<Experience> create(
            @RequestBody Experience experience) {
        return ResponseEntity.ok(experienceRepository.save(experience));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Experience> update(
            @PathVariable String id,
            @RequestBody Experience experience) {
        experience.setId(id);
        return ResponseEntity.ok(experienceRepository.save(experience));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        experienceRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}