package org.example.webhook;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public ResponseEntity<String> handleWebhook(@RequestBody WebhookPayload payload) {
        // Process the webhook payload
        System.out.println("Received webhook payload: " + payload);

        // Create a new client in the Spring Boot application based on the payload
        createNewClient(payload);

        return new ResponseEntity<>("Webhook received and processed", HttpStatus.OK);
    }

    @GetMapping
    public String getWebHook(){

        System.out.println("WebHook called.");
        return "WebHook called.";
    }

    private void createNewClient(WebhookPayload payload) {
        // Implement your logic to create a new client in your Spring Boot application
        // This could involve saving the data to a database, calling another service, etc.
        System.out.println("Creating new client: " + payload.getFirstname() + " " + payload.getLastname());
    }
}