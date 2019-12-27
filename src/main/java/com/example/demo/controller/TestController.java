package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public Map<String,String> test(){
        return Map.of("test","kongsan111222333444666");
    }
    
    
    @GetMapping("zhaoxianqiang")
    public Map<String,String> test(){
        return Map.of("test","zhaoxianqiang111");
    }
    
}
