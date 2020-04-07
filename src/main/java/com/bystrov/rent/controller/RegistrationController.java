package com.bystrov.rent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String getRegistrationPage() {
        return "registration";
    }
}
