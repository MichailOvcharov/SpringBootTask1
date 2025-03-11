package ru.diasoft.example.services;

import org.springframework.stereotype.Service;
import ru.diasoft.example.dto.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingServices {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting newGreeting(String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
