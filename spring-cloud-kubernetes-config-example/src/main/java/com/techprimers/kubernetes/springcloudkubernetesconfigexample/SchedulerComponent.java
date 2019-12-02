package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SchedulerComponent {

    @Autowired
    WelcomeConfiguration config;

    @Autowired
    RestTemplate restTemplate;


    @Scheduled(fixedDelay = 3000)
    public void schedule() {
        System.out.println(config.getMessage());

        String url = "http://users-service:8080/users";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println("Calling via Discovery Client.... " + responseEntity.getBody());
    }
}
