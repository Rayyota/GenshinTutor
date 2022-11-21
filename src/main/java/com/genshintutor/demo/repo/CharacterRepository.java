package com.genshintutor.demo.repo;

import com.genshintutor.demo.models.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Long> {
}
