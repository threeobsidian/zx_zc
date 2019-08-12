package com.zcw.web.forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexForward {
    @RequestMapping("")
    public String login(){
        return "index";
    }
    @RequestMapping("pay-step-1")
    public String payStep1(){
        return "pay-step-1";
    }
    @RequestMapping("pay-step-2")
    public String payStep2(){
        return "pay-step-2";
    }
    @RequestMapping("project")
    public String project(){
        return "project";
    }
    @RequestMapping("projects")
    public String projects(){
        return "projects";
    }
}
