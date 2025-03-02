package com.sabinghost19.loginform.controller;

import com.sabinghost19.loginform.requestScopes.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class LoginController {

    private final Logger logger= Logger.getLogger(LoginController.class.getName());

    @GetMapping("/")
    public String getLoginForm(Model model) {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam(required = true) String username,
                            @RequestParam(required = true) String password, Model page,LoginProcessor loginProcessor) {

        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean condition=loginProcessor.login();

        logger.info("username:"+username+",password:"+password);
        if(condition){
            page.addAttribute("message","success, Loged IN");
        }else{
            page.addAttribute("message","fail....");
        }
        return "login.html";
    }

}

