package com.example.springbootnotifier.impl;

import com.example.springbootnotifier.config.TwilioConfig;
import com.example.springbootnotifier.contract.CallSender;
import com.example.springbootnotifier.dto.CallRequest;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;

@Service("twilioCallSender")
public class TwilioCallSender implements CallSender {
    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);

    private final TwilioConfig twilioConfig;

    public TwilioCallSender(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    @Override
    public void makeCall(CallRequest callRequest) throws URISyntaxException {
        if (isPhoneNumberValid(callRequest.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber(callRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());
            Call.creator(to, from, new URI("http://demo.twilio.com/docs/voice.xml")).create();
            LOGGER.info("Making a call to {}", to);
        } else {
            throw new IllegalArgumentException(
                    "Phone number [" + callRequest.getPhoneNumber() + "] is not a valid number"
            );
        }
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        // TODO: Implement phone number validator
        return true;
    }
}
