package com.example.springbootnotifier.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class CallRequest {
    @NotBlank
    private final String phoneNumber; // destination

    public CallRequest(@JsonProperty("phoneNumber") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "CallRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
