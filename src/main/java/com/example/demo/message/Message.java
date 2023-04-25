package com.example.demo.message;

import java.time.Instant;
import java.util.Random;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Component
public class Message {
	
	public String newRandomTransaction(String patientId) {
	    ObjectNode transaction = JsonNodeFactory.instance.objectNode();
	    Random random = new Random();
	    long timestamp = System.currentTimeMillis();
	    transaction.put("patientId", patientId);
	    transaction.put("time", timestamp);
	    transaction.put("heartRate", random.nextInt(200));
	    transaction.put("bloodPressure", random.nextInt(100));
	    return transaction.toString();
	}

}
