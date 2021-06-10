package com.pr.reservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login() {
        System.out.println("login");
        return "login";
    }
}
