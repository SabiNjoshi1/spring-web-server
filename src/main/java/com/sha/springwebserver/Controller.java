package com.sha.springwebserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/welcome")
    public String helloWorld() {
        return "!! Welcome to Demo Java App!! ";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "!! Thank You !! ";
    }
}