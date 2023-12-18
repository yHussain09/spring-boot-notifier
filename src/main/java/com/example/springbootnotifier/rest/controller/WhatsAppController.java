package com.example.springbootnotifier.rest.controller;

import com.example.springbootnotifier.dto.WhatsAppMessageRequest;
import com.example.springbootnotifier.service.WhatsAppMessageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/whatsapp")
public class WhatsAppController {

    private final WhatsAppMessageService whatsAppMessageService;

    @Autowired
    public WhatsAppController(WhatsAppMessageService whatsAppMessageService) {
        this.whatsAppMessageService = whatsAppMessageService;
    }

    @PostMapping()
    public void sendWhatsAppMessage(@Valid @RequestBody WhatsAppMessageRequest whatsAppMessageRequest) {
        whatsAppMessageService.sendWhatsAppMessage(whatsAppMessageRequest);
    }
}
