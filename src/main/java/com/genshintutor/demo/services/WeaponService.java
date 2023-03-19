package com.genshintutor.demo.services;

import com.genshintutor.demo.models.Weapon;
import com.genshintutor.demo.repositories.WeaponRepository;
import com.genshintutor.demo.services.Interfaces.IWeaponService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeaponService implements IWeaponService {
    private final WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    @Override
    public Optional<Weapon> findById(long id) {
        return weaponRepository.findById(id);
    }

    public Iterable<Weapon> findAll() {
        return weaponRepository.findAll();
    }
}
