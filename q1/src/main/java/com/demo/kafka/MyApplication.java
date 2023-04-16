package com.demo.kafka;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding({Source.class, Processor.class})
public class MyApplication {

    @StreamListener(Processor.INPUT)
    @SendTo(Source.OUTPUT)
    public String handle(String message) {
        System.out.println("Received message: " + message);
        return message.toUpperCase();
    }
}

