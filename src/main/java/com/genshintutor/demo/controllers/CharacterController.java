package com.genshintutor.demo.controllers;

import com.genshintutor.demo.models.Character;
import com.genshintutor.demo.models.CharacterPage;
import com.genshintutor.demo.services.CharacterService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/hutao")
    public String hutao(Model model) {
        return characterService.hutao(model);
    }

    @GetMapping("/yelan")
    public String yelan(Model model) {
        return characterService.yelan(model);
    }

    @GetMapping("/assembly/{id}")
    public String assemblyDetails(@PathVariable(value = "id") long id, Model model) {
        return characterService.assemblyDetails(id, model);
    }

//    @GetMapping("/assembly/{id}")
//    public Page<Character> getCharacter(@PathVariable(value = "id") CharacterPage characterPage) {
//        return characterService.getCharacter(characterPage);
//    }
}
