package com.genshintutor.demo.repo;

import com.genshintutor.demo.models.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {

}

//public interface CharacterRepository extends PagingAndSortingRepository<Character, Long> {
//
//}