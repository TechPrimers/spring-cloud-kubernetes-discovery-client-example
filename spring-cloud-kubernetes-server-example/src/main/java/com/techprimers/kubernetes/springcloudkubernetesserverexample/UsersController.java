package com.techprimers.kubernetes.springcloudkubernetesserverexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public String getUsers() {
        return "Raju, Ram, Vijay, Ryan, Chris";
    }
}
