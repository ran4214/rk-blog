package com.rkblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class defaultController {

    @RequestMapping("/home")
    public String homeGET(){
        System.out.println("hi!");
        return "home";
    }
}
