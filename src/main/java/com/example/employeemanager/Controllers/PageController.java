package com.example.employeemanager.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @GetMapping("/home")
    public String home() {
        return "home.html";
    }

    @GetMapping("/login")
    public String login() {
        return "login.jsp";
    }

    @GetMapping("/register")
    public String register() {
        return "Register.jsp";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin() {
        return "admin.html";
    }

    @PostMapping(path = "/connect")
    public @ResponseBody String connect() {
        return "login.html";
    }
}
