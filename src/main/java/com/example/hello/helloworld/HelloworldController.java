package com.example.hello.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @RequestMapping("/")
    public String writeHello() {
        return "Jeff Ng says \"Hello, world!\"";
    }
}
