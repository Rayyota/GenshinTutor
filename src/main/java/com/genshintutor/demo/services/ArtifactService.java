package com.genshintutor.demo.services;

import com.genshintutor.demo.models.Artifact;
import com.genshintutor.demo.repositories.ArtifactRepository;
import com.genshintutor.demo.services.Interfaces.IArtifactService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtifactService implements IArtifactService {
    private final ArtifactRepository artifactRepository;

    public ArtifactService(ArtifactRepository artifactRepository) {
        this.artifactRepository = artifactRepository;
    }

    @Override
    public Optional<Artifact> findById(long id) {
        return artifactRepository.findById(id);
    }

    public Iterable<Artifact> findAll() {
        return artifactRepository.findAll();
    }
}
