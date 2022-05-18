package com.ranjini.springboot_01study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping("/json")
    public @ResponseBody String getJson(){
        return "hello springboot";
    };
}
