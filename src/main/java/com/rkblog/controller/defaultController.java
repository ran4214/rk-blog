package com.rkblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class defaultController {

    @RequestMapping("/login")
    public String loginGET(){
        return "login.html";
    }
}
