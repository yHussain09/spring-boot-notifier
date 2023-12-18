package com.example.springbootnotifier.impl;

import com.example.springbootnotifier.config.TwilioConfig;
import com.example.springbootnotifier.contract.WhatsAppMessageSender;
import com.example.springbootnotifier.dto.WhatsAppMessageRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("twilioWhatsAppMessageSender")
public class TwilioWhatsAppMessageSender implements WhatsAppMessageSender {
    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);

    private final TwilioConfig twilioConfig;

    public TwilioWhatsAppMessageSender(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    @Override
    public void sendWhatsAppMessage(WhatsAppMessageRequest whatsAppMessageRequest) {
        if (isPhoneNumberValid(whatsAppMessageRequest.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber("whatsapp:" + whatsAppMessageRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber("whatsapp:" + twilioConfig.getTrialNumber());
            String message = whatsAppMessageRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            LOGGER.info("Send sms {}", whatsAppMessageRequest);
        } else {
            throw new IllegalArgumentException(
                    "Phone number [" + whatsAppMessageRequest.getPhoneNumber() + "] is not a valid number"
            );
        }
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        // TODO: Implement phone number validator
        return true;
    }
}
