package com.genshintutor.demo.services;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

public interface ICharacterService {
    String assemblyDetails(@PathVariable(value = "id") long id, Model model);
}
