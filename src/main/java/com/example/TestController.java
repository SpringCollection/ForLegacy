package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class TestController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("today", LocalDate.now());
        return "index";
    }
}
