package com.example.springbootnotifier.service;

import com.example.springbootnotifier.contract.WhatsAppMessageSender;
import com.example.springbootnotifier.dto.WhatsAppMessageRequest;
import com.example.springbootnotifier.impl.TwilioWhatsAppMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppMessageService {
    private final WhatsAppMessageSender whatsAppMessageSender;

    @Autowired
    public WhatsAppMessageService(@Qualifier("twilioWhatsAppMessageSender") TwilioWhatsAppMessageSender whatsAppMessageSender) {
        this.whatsAppMessageSender = whatsAppMessageSender;
    }

    public void sendWhatsAppMessage(WhatsAppMessageRequest whatsAppMessageRequest) {
        whatsAppMessageSender.sendWhatsAppMessage(whatsAppMessageRequest);
    }
}
