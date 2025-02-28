package com.sabinghost19.aspect_practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(@RequestParam(required=false) String color,
                       @RequestParam(required = false)String name,
                       Model page){
        page.addAttribute("username",name);
        page.addAttribute("color",color);
        return "home.html";
    }

    @RequestMapping("/home2/{color}/{name}")
    public String getHomePage2(
            @PathVariable String color, @PathVariable String name, Model page){
        page.addAttribute("username",name);
        page.addAttribute("color",color);
        return "home.html";
    }
}
