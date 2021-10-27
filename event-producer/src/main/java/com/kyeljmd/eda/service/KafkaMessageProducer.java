package com.kyeljmd.eda.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyeljmd.eda.event.messages.pageevent.RegisterApplicantDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String topicName = "PH_SUB_TOPIC";

    private static final String new_applicant_topic  = "new-applicants";

    private static final ObjectMapper mapper = new ObjectMapper();

    public void sendMessage(String currtime) {
        System.out.println("Sending messagge: "+currtime);
        kafkaTemplate.send(topicName, currtime);
    }


    public void notifyNewApplicant(RegisterApplicantDTO applicantDTO) {
        try {
            String applicant = mapper.writeValueAsString(applicantDTO);
            System.out.println("Converted POJO to JSON");
            System.out.println(applicant);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("Sending message: "+applicantDTO);
        kafkaTemplate.send(new_applicant_topic, applicantDTO);
    }
}
