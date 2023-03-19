package com.genshintutor.demo.controllers;

import com.genshintutor.demo.models.Build;
import com.genshintutor.demo.services.BuildService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class BuildController {
    private final BuildService buildService;

    public BuildController(BuildService buildService) {
        this.buildService = buildService;
    }

    @GetMapping("/build/{id}")
    public String buildDetails(@PathVariable(value = "id") long id, Model model) {
        Optional<Build> build = buildService.findById(id);
        model.addAttribute("build", build.get());
        return "build-details";
    }

    @GetMapping("/builds")
    public String assembly(Model model) {
        Iterable<Build> builds = buildService.findAll();
        model.addAttribute("builds", builds);
        model.addAttribute("title", "Сборки на персонажей");
        return "builds";
    }
}
