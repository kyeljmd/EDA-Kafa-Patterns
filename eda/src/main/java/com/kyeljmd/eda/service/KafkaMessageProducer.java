package com.kyeljmd.eda.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyeljmd.eda.event.messages.pageevent.PageViewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageProducer {

    @Autowired
    private KafkaTemplate<String, PageViewDTO> kafkaTemplate;

    private static final String topicName = "pageviews-json";

    private static final ObjectMapper mapper = new ObjectMapper();

    public void sendMessage(String currtime) {
        PageViewDTO pageViewDTO = new PageViewDTO();
        pageViewDTO.setPage("1");
        pageViewDTO.setPageCount(23);
        String pageViewJSON = null;
        try {
            pageViewJSON = mapper.writeValueAsString(pageViewDTO);
            System.out.println("Converted POJO to JSON");
            System.out.println(pageViewJSON);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("Sending messagge: "+pageViewJSON);
        kafkaTemplate.send(topicName, pageViewDTO);
    }
}
