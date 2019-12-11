package com.csqf.rocketmq.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public interface MySource {

    String OUTPUT = "output1";

    @Output(MySource.OUTPUT)
    MessageChannel output1();
}
