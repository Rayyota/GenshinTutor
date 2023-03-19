package com.genshintutor.demo.services.Interfaces;

import com.genshintutor.demo.models.Character;

import java.util.Optional;

public interface ICharacterService {
    Optional<Character> findById(long id);
}
