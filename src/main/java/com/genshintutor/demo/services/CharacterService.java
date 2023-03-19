package com.genshintutor.demo.services;

import com.genshintutor.demo.models.Character;
import com.genshintutor.demo.repositories.CharacterRepository;
import com.genshintutor.demo.services.Interfaces.ICharacterService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CharacterService implements ICharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public Optional<Character> findById(long id) {
        return characterRepository.findById(id);
    }

    public Iterable<Character> findAll() {
        return characterRepository.findAll();
    }

    public Character save(Character character) {
        return characterRepository.save(character);
    }
}
