package com.example.junitspringboot;

import com.example.junitspringboot.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "word") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
