package com.genshintutor.demo.controllers;

import com.genshintutor.demo.models.Character;
import com.genshintutor.demo.repo.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

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

//    @GetMapping("/assembly/${charID}")
//    public String getCharacters(Long charID) {
//        Iterable<Character> characters = characterRepository.findAll();
//        Character character = this.characterRepository.findById.(charID);
//        model.addAttribute("character", character);
//        model.addAttribute("title", "Е Лань");
//        return "character";
//    }

    @GetMapping("/assembly/{id}")
    public String assemblyDetails(@PathVariable(value = "id") long id, Model model) {
        System.out.println(id);
        Optional<Character> character = characterRepository.findById(id);
        System.out.println(character.get().getName());
//        ArrayList<Character> res = new ArrayList<>();
//        character.ifPresent(res::add);
//        System.out.println(res.get(0).getName());
        model.addAttribute("character", character.get());
        return "assembly-details";
    }
}
