package com.pr.reservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contact () {
        System.out.println("contact");
        return "contact";
    }
}
