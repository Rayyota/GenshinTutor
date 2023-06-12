package com.genshintutor.demo.repositories;

import com.genshintutor.demo.models.Weapon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends CrudRepository<Weapon, Long> {

}