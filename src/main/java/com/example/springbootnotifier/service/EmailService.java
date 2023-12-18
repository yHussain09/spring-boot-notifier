package com.example.springbootnotifier.service;

import com.example.springbootnotifier.contract.EmailSender;
import com.example.springbootnotifier.dto.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final EmailSender emailSender;
    @Autowired
    public EmailService(@Qualifier("javaEmailSender") EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(EmailRequest emailRequest) {
        this.emailSender.sendEmail(emailRequest);
    }
}
