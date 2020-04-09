package com.abanul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SimpleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/invoke")
    public String invoke(){
        String url = "http://EUREKA-CLIENT/getValue";
        return restTemplate.getForObject(url, String.class);
    }

}
