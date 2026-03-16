package com.portfolio.backend.controller;

import com.portfolio.backend.model.Message;
import com.portfolio.backend.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
@CrossOrigin(origins = "${cors.allowed-origin}")
public class ContactController {

    private final MessageRepository messageRepository;

    // PUBLIC — anyone can send a message
    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody Message message) {
        messageRepository.save(message);
        return ResponseEntity.ok(Map.of("message", "Message sent successfully"));
    }

    // PROTECTED — only admin can read messages
    @GetMapping
    public ResponseEntity<List<Message>> getMessages() {
        return ResponseEntity.ok(messageRepository.findAll());
    }

    // PROTECTED — admin can delete messages
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable String id) {
        messageRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}