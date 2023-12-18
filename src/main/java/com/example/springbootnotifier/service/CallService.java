package com.example.springbootnotifier.service;

import com.example.springbootnotifier.contract.CallSender;
import com.example.springbootnotifier.dto.CallRequest;
import com.example.springbootnotifier.impl.TwilioCallSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class CallService {
    private final CallSender callSender;

    @Autowired
    public CallService(@Qualifier("twilioCallSender") TwilioCallSender callSender) {
        this.callSender = callSender;
    }

    public void makeCall(CallRequest callRequest) throws URISyntaxException {
        callSender.makeCall(callRequest);
    }
}
