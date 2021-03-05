package com.kyeljmd.eda.service;

import com.kyeljmd.eda.event.messages.pageevent.RegisterApplicantDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    @Autowired
    private KafkaMessageProducer kafkaMessageProducer;

    public RegisterApplicantDTO createApplicant(RegisterApplicantDTO registrant) {
        kafkaMessageProducer.notifyNewApplicant(registrant);
        return registrant;
    }

}
