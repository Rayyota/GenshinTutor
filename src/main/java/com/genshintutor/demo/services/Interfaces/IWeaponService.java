package com.genshintutor.demo.services.Interfaces;

import com.genshintutor.demo.models.Weapon;

import java.util.Optional;

public interface IWeaponService {
    Optional<Weapon> findById(long id);
}
