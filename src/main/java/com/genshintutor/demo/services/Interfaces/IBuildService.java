package com.genshintutor.demo.services.Interfaces;

import com.genshintutor.demo.models.Build;

import java.util.Optional;

public interface IBuildService {
    Optional<Build> findById(long id);
}
