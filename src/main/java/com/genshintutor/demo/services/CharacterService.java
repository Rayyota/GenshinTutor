package com.genshintutor.demo.services;

import com.genshintutor.demo.models.Character;
import com.genshintutor.demo.models.CharacterPage;
import com.genshintutor.demo.repo.CharacterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class CharacterService implements ICharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

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

    @Override
    @GetMapping("/assembly/{id}")
    public String assemblyDetails(@PathVariable(value = "id") long id, Model model) {
        System.out.println(id);
        Optional<Character> character = characterRepository.findById(id);
        System.out.println(character.get().getName());
        model.addAttribute("character", character.get());
        return "assembly-details";
    }

//    public Page<Character> getCharacter(CharacterPage characterPage) {
//        Sort sort = Sort.by(characterPage.getSortDirection(), characterPage.getSortBy());
//        Pageable pageable = PageRequest.of(characterPage.getPageNumber(), characterPage.getPageSize(), sort);
//        return characterRepository.findAll(pageable);
//    }
}
