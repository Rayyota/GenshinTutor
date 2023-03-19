package com.genshintutor.demo.services;

import com.genshintutor.demo.models.Build;
import com.genshintutor.demo.repositories.BuildRepository;
import com.genshintutor.demo.services.Interfaces.IBuildService;

import java.util.Optional;

public class BuildService implements IBuildService {
    private final BuildRepository buildRepository;

    public BuildService(BuildRepository buildRepository) {
        this.buildRepository = buildRepository;
    }

    @Override
    public Optional<Build> findById(long id) {
        return buildRepository.findById(id);
    }

    public Iterable<Build> findAll() {
        return buildRepository.findAll();
    }
}
