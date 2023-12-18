package com.example.springbootnotifier.contract;

import com.example.springbootnotifier.dto.WhatsAppMessageRequest;

public interface WhatsAppMessageSender {
    void sendWhatsAppMessage(WhatsAppMessageRequest whatsAppMessageRequest);
}
