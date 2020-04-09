package com.abanul.eurekadiscovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/getValue")
    public String getValue(){
        return "Value from discovery";
    }

}
