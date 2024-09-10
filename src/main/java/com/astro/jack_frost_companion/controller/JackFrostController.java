package com.astro.jack_frost_companion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JackFrostController {
    
    @GetMapping("/frost")
    public String getJackFrost(Model model) {
        // key pra chamar usando o thymeleaf no html e o caminho dela
        model.addAttribute("imagePath", "/images/jack-frost.png");
        return "frost"; // nome do arquivo html
    }

}
