package com.genshintutor.demo.controllers;

import com.genshintutor.demo.models.Character;
import com.genshintutor.demo.repo.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping("/hutao")
    public String hutao(Model model) {
        Iterable<Character> characters = characterRepository.findAll();
        model.addAttribute("characters", characters);
        model.addAttribute("title", "Ху Тао");
        return "hutao";
    }

    @GetMapping("/yelan")
    public String yelan(Model model) {
        Iterable<Character> characters = characterRepository.findAll();
        model.addAttribute("characters", characters);
        model.addAttribute("title", "Е Лань");
        return "yelan";
    }

}
