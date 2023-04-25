package com.example.demo.messageProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.message.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@EnableScheduling
public class MessageProducer {
    private static final Logger LOG = LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private Message msg;

    private final String[] patientIds = {"john", "stephane", "alice"};

    @Scheduled(fixedDelay = 1000)
    public void produce() {
        String patientId = patientIds[(int) (Math.random() * patientIds.length)];
        String transactionString = msg.newRandomTransaction(patientId);
        LOG.info("Sending message: patientId={}, message={}", patientId, transactionString);
        kafkaTemplate.send("vital-signs-topic",transactionString);
    }
}



