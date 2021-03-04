package com.kyeljmd.eda.edaconsumer.service;

import com.kyeljmd.eda.event.messages.pageevent.PageViewDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer {

    @KafkaListener(topics = "pageviews-json")
    public void listenGroupFoo(PageViewDTO message) {
        System.out.println("received a message from pageviews-json");
        System.out.println("Received Message in group foo: " + message.toString());
    }
}
