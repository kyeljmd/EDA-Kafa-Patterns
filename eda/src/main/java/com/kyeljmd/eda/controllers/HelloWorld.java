package com.kyeljmd.eda.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyeljmd.eda.service.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

@RestController
public class HelloWorld {

    @Autowired
    private KafkaMessageProducer kafkaMessageProducer;
    @GetMapping("/hello")
    public String hello() {
        kafkaMessageProducer.sendMessage(LocalDateTime.now().toString());
        return "hello-world";
    }
}
