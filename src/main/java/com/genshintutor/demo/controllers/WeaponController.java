package com.genshintutor.demo.controllers;

import com.genshintutor.demo.models.Weapon;
import com.genshintutor.demo.services.WeaponService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class WeaponController {
    private final WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping("/weapon/{id}")
    public String buildDetails(@PathVariable(value = "id") long id, Model model) {
        Optional<Weapon> weapon = weaponService.findById(id);
        model.addAttribute("weapon", weapon.get());
        return "weapon-details";
    }

    @GetMapping("/weapons")
    public String build(Model model) {
        Iterable<Weapon> weapons = weaponService.findAll();
        model.addAttribute("weapons", weapons);
        model.addAttribute("title", "Сборки на персонажей");
        return "weapons";
    }
}
