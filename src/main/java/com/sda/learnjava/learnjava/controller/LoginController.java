package com.sda.learnjava.learnjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login(){
        return "login";
    }

}
