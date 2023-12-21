package com.example.employeemanager.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {

        return "home.jsp";
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
    public String admin() {
        return "admin.html";
    }
}
