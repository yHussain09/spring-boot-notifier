package com.example.springbootnotifier.impl;

import com.example.springbootnotifier.dto.EmailRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("javaEmailSender")
public class EmailSender implements com.example.springbootnotifier.contract.EmailSender {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailSender.class);
    private final JavaMailSender javaMailSender;
    public EmailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    @Override
    public void sendEmail(EmailRequest emailRequest) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("y.hussain09@gmail.com");
        simpleMailMessage.setTo(emailRequest.getToEmail());
        simpleMailMessage.setSubject(emailRequest.getSubject());
        simpleMailMessage.setText(emailRequest.getMessage());
        javaMailSender.send(simpleMailMessage);
        LOGGER.info("Sending an Email to {}", simpleMailMessage);
    }
}
