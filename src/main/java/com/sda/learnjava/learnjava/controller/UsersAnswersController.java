package com.sda.learnjava.learnjava.controller;

import com.sda.learnjava.learnjava.model.UsersAnswers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Controller
@RequestMapping("/")
public class UsersAnswersController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home(){
        return  "home";
    }

}
