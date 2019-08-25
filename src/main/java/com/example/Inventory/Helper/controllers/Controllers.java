package com.example.Inventory.Helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers {
    @RequestMapping(value = "")
    @ResponseBody
    public String index(){
        return "My first Controller";
    }

    @RequestMapping(value = "NonRoot")
    @ResponseBody
    public String NonRootController(){
        return "This one is not in the root directory";
    }
}
