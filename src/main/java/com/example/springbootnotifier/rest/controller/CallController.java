package com.example.springbootnotifier.rest.controller;

import com.example.springbootnotifier.dto.CallRequest;
import com.example.springbootnotifier.service.CallService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/call")
public class CallController {

    private final CallService callService;

    public CallController(CallService callService) {
        this.callService = callService;
    }

    @PostMapping()
    public void makeCall(@Valid @RequestBody CallRequest callRequest) throws URISyntaxException {
        callService.makeCall(callRequest);
    }

}
