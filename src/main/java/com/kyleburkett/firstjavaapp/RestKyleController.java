package com.kyleburkett.firstjavaapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestKyleController {
    @RequestMapping("/greeting")
    public String Greeting(@RequestParam(value="name", defaultValue = "World") String name) {

        return name + " hello all";
    }
}
