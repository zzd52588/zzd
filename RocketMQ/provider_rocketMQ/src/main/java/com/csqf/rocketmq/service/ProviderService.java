package com.csqf.rocketmq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    @Autowired
    private MessageChannel output;

    @Autowired
    private  MySource mySource;

    public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
    }

    public void send1(String message) {
        mySource.output1().send(MessageBuilder.withPayload(message).build());
    }
}
