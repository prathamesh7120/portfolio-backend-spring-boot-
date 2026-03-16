package com.portfolio.backend.controller;

import com.portfolio.backend.model.Education;
import com.portfolio.backend.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/education")
@RequiredArgsConstructor
@CrossOrigin(origins = "${cors.allowed-origin}")
public class EducationController {

    private final EducationRepository educationRepository;

    @GetMapping
    public ResponseEntity<List<Education>> getAll() {
        return ResponseEntity.ok(
                educationRepository.findAllByOrderByOrderAsc());
    }

    @PostMapping
    public ResponseEntity<Education> create(
            @RequestBody Education education) {
        return ResponseEntity.ok(educationRepository.save(education));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Education> update(
            @PathVariable String id,
            @RequestBody Education education) {
        education.setId(id);
        return ResponseEntity.ok(educationRepository.save(education));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        educationRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}