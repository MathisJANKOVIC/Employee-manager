package com.example.employeemanager.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.employeemanager.repository.UserRepository;
import com.example.employeemanager.models.User;

@Controller
public class PageController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin() {
        return "admin.html";
    }

    @PostMapping(path = "/connect")
    public @ResponseBody String connect(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
        User userToConnect = userRepository.findByMail(email);
        if (userToConnect != null && userToConnect.getPassword().equals(password)) {
            return "home.html";
        } else {
            return "login.html";
        }
    }
}
