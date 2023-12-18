package com.example.springbootnotifier.rest.controller;

import com.example.springbootnotifier.dto.EmailRequest;
import com.example.springbootnotifier.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }
    @PostMapping()
    public void sendEmail(@Valid @RequestBody EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest);
    }
}
