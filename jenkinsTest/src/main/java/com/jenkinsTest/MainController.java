package com.jenkinsTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    @GetMapping("/test")
    public String Test(){
        return "test";
    }
    @GetMapping("/test2")
    public String Test2(){
        return "test2";
    }
    @GetMapping("/test3")
    public String Test3(){
        return "test2";
    }
}
