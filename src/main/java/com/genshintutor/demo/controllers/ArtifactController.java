package com.genshintutor.demo.controllers;

import com.genshintutor.demo.models.Artifact;
import com.genshintutor.demo.models.Character;
import com.genshintutor.demo.services.ArtifactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ArtifactController {
    private final ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

    @GetMapping("/artifact/{id}")
    public String buildDetails(@PathVariable(value = "id") long id, Model model) {
        Optional<Artifact> artifact = artifactService.findById(id);
        model.addAttribute("artifact", artifact.get());
        return "artifact-details";
    }

    @GetMapping("/artifacts")
    public String build(Model model) {
        Iterable<Artifact> artifacts = artifactService.findAll();
        model.addAttribute("artifacts", artifacts);
        model.addAttribute("title", "Сборки на персонажей");
        return "artifacts";
    }
}
