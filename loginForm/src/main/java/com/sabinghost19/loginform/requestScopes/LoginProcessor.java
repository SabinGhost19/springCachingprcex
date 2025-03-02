package com.sabinghost19.loginform.requestScopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public LoginProcessor(){}

    public boolean login(){
        String username=this.username;
        String password=this.password;

        if("admin".equals(username) && "admin".equals(password)){
            return true;
        }
        return false;
    }
}
