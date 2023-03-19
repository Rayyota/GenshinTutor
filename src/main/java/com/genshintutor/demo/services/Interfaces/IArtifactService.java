package com.genshintutor.demo.services.Interfaces;

import com.genshintutor.demo.models.Artifact;

import java.util.Optional;

public interface IArtifactService {
    Optional<Artifact> findById(long id);
}
