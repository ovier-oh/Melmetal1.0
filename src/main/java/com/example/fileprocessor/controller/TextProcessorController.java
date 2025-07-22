package com.example.fileprocessor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TextProcessorController {
    @PostMapping("/process-text")
    public ResponseEntity<String> processText(@RequestBody String input){
        if (input == null || input.trim().isEmpty()){
            return ResponseEntity.badRequest().body("Texto vacio o nulo");
        }
        String processed = input.toUpperCase(); 
        return ResponseEntity.ok(processed);
    }
}
