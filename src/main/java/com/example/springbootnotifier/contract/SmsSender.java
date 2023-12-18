package com.example.springbootnotifier.contract;

import com.example.springbootnotifier.dto.SmsRequest;

public interface SmsSender {
    void sendSms(SmsRequest smsRequest);
}
