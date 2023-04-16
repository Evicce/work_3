package com.demo.rabbitmq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MyApplication {

    @StreamListener(Sink.INPUT)
    public void handle(String message) {
        System.out.println("Received message: " + message);
    }
}

