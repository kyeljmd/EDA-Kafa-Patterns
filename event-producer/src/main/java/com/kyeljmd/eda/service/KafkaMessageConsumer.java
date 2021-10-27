package com.kyeljmd.eda.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer {

    @KafkaListener(topics = "PH_SUB_TOPIC")
    public void listenNewApplicants(String cv) {
        System.out.println("Received a message from  " + cv.toString());
    }


}
