package com.example.springnative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/rest")
    public String testRest() {
        RestTemplate restTemplate = new RestTemplate();
        // I want to parse some html
        String resBody = restTemplate.getForEntity("https://start.spring.io/", String.class).getBody();
        return resBody;
    }
}