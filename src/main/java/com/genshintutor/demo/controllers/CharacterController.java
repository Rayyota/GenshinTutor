package com.genshintutor.demo.controllers;

import com.genshintutor.demo.models.Character;
import com.genshintutor.demo.repositories.CharacterRepository;
import com.genshintutor.demo.services.CharacterService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CharacterController {
    private final CharacterService characterService;
    private final CharacterRepository characterRepository;

    public CharacterController(CharacterService characterService,
                               CharacterRepository characterRepository) {
        this.characterService = characterService;
        this.characterRepository = characterRepository;
    }

    @GetMapping("/character/{id}")
    public String buildDetails(@PathVariable(value = "id") long id, Model model) {
        System.out.println(id);
        Optional<Character> character = characterService.findById(id);
        Iterable<Character> characters = characterService.findAll();
        System.out.println(character.get().getName());
        model.addAttribute("characters", characters);
        model.addAttribute("character", character.get());
        return "character-details";
    }

    @GetMapping("/characters")
    public String assembly(Model model) {
        Iterable<Character> characters = characterService.findAll();
        model.addAttribute("characters", characters);
        model.addAttribute("title", "Сборки на персонажей");
        return "characters";
    }

    @GetMapping("/character/add")
    public String characterAdd(Model model) {
        return "character-add";
    }

    @PostMapping("/character/add")
    public String characterAdd(@ModelAttribute Character character, Model model) {
        characterRepository.save(character);
        return "redirect:/character";
    }
}
