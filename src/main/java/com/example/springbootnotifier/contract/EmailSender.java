package com.example.springbootnotifier.contract;

import com.example.springbootnotifier.dto.EmailRequest;

public interface EmailSender {
    void sendEmail(EmailRequest emailRequest);
}
