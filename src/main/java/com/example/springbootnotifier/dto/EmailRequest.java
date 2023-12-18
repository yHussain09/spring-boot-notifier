package com.example.springbootnotifier.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class EmailRequest {
    @NotBlank
    private final String toEmail; // destination
    @NotBlank
    private final String subject;
    private final String message;

    public EmailRequest(@JsonProperty("toEmail") String toEmail,
                      @JsonProperty("subject") String subject, @JsonProperty("message") String message) {
        this.toEmail = toEmail;
        this.subject = subject;
        this.message = message;
    }

    public String getToEmail() {
        return toEmail;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
