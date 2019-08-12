package com.zcw.web.forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserForward {
    @RequestMapping("/reg")
    public String reg(){
        return "manager/reg";
    }

    @RequestMapping("/login")
    public  String login(){
        return "manager/login";
    }

}
