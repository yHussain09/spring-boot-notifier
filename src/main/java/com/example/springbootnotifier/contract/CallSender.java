package com.example.springbootnotifier.contract;

import com.example.springbootnotifier.dto.CallRequest;

import java.net.URISyntaxException;

public interface CallSender {
    void makeCall(CallRequest callRequest) throws URISyntaxException;
}
