package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public ResponseEntity<String> handleWebhook(@RequestBody Map<String, Object> payload) {
        // Process the webhook payload
        System.out.println("Received webhook payload: " + payload);

        // Create a new client or process the payload as needed
        createNewClient(payload);

        return new ResponseEntity<>("Webhook received and processed", HttpStatus.OK);
    }

    private void createNewClient(Map<String, Object> payload) {
        // Implement the logic to handle the dynamic payload
        // For example, save the data to a database or trigger other business logic
        System.out.println("Processing payload: " + payload);
    }
}
