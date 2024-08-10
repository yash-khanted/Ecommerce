package my.project.ecommerce.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @GetMapping("/status")
    public HttpEntity<String> applicationStatus(){
        return ResponseEntity.ok("Application is up and running");
    }
}
