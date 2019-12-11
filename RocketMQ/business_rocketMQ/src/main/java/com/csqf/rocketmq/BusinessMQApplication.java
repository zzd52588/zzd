package com.csqf.rocketmq;

import com.csqf.rocketmq.service.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding({Sink.class, MySink.class})
public class BusinessMQApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessMQApplication.class);
    }
}
