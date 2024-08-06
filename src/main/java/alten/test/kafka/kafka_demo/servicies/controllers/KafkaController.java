package alten.test.kafka.kafka_demo.servicies.controllers;

import alten.test.kafka.kafka_demo.servicies.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Message published successfully";
    }
}
