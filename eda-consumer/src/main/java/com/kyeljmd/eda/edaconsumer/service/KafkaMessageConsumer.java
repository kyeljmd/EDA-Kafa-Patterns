package com.kyeljmd.eda.edaconsumer.service;

import com.kyeljmd.eda.edaconsumer.event.messages.TransitionsEvent;
import com.kyeljmd.eda.edaconsumer.event.messages.UsersEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer {

    @KafkaListener(topics = "dbchangesUsers",
            containerFactory = "userKafkaListenerContainerFactory",
            groupId = "${users.group.id}")
    public void listenNewApplicants(UsersEvent cv) {
        System.out.println("Received a message from  " + cv.toString());
    }

    @KafkaListener(topics = "dbchangesTransitions",
            containerFactory = "transitionsKafkaListenerContainerFactory",
            groupId =  "${transitions.group.id")
    public void listenNewTransitions(TransitionsEvent transitionsEvent) {
        System.out.println("Received a message from  " + transitionsEvent.toString());
    }
}
