package com.tj.edu.practice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcApiController1 {

    //    @RequestMapping("/test1")
    @GetMapping(value = "/test1")
    public String test1(){
        return "test1입니다.....!";
    }

    @PutMapping(value = "/put-test1")
    public String putTest1(){
        return "업데이트 http 메소드입니다.";
    }

    @DeleteMapping(value = "/delete-test1")
    public String DeleteTest1(){
        return "delete http 메소드입니다.";
    }

}
