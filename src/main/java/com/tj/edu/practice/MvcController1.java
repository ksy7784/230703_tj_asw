package com.tj.edu.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController1 {

    //    @RequestMapping("/test1")
    @GetMapping(value = "/test2view")
    public String test2() {
        return "test2입니다...";
    }
    @PostMapping(value = "/post-test1")
    public String postTest1() {
        return """
                {
                "name" : "홍길동";
                "birth" : "1990-05-05";
                }
                """;
    }


}