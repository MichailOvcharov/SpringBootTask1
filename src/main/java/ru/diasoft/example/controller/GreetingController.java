package ru.diasoft.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.diasoft.example.dto.Greeting;
import ru.diasoft.example.services.GreetingServices;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

    @Autowired
    private GreetingServices greetingServices;

    @GetMapping("/greetings")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingServices.newGreeting(name);
    }
}
