package com.genshintutor.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssemblyController {

    @GetMapping("/assembly")
    public String assembly(Model model) {
        model.addAttribute("title", "Сборки на персонажей");
        return "assembly";
    }
}
