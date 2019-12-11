package com.csqf.rocketmq.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Service;

@Service
public interface MySink {
    String INPUT = "input1";

    @Input(MySink.INPUT)
    SubscribableChannel input1();
}
