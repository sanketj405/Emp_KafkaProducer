package com.Test.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaServicetest {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location){
        this.kafkaTemplate.send("EmployeeLocation",location);
        return true;
    }
}
