package com.example.employeemanager.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Home {

    @GetMapping("/static/home")
    public String home() {
        return "home";
    }
}
