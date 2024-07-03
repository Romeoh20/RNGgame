package com.romeoh20.RNGgame.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {



    @GetMapping("/goofy")
    public String getConsole(){
        System.out.println("Shoes");
        return "test";
    }

    @PostMapping("/goofy")
    public String postConsole(){
        System.out.println("Shoes");
        return "test";
    }



}
