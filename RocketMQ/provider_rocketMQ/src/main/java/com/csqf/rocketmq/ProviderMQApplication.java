package com.csqf.rocketmq;

import com.csqf.rocketmq.service.MySource;
import com.csqf.rocketmq.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Source.class, MySource.class})
public class ProviderMQApplication implements CommandLineRunner {

    @Autowired
    private ProviderService providerService;

    public static void main(String[] args) {
        SpringApplication.run(ProviderMQApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        providerService.send("Hello ZZD");
        providerService.send1("Hello wsw");
    }
}
