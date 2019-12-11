package com.csqf.rocketmq.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @StreamListener(Sink.INPUT)
    public void receiveInput(String message) {
        System.out.println("Receive input: " + message);
    }

    @StreamListener(MySink.INPUT)
    public void receiveInputWithMySink(String message) {
        System.out.println("receiveInputWithMySink input: " + message);
    }
}
