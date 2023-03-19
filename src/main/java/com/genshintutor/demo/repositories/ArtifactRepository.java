package com.genshintutor.demo.repositories;

import com.genshintutor.demo.models.Artifact;
import org.springframework.data.repository.CrudRepository;

public interface ArtifactRepository extends CrudRepository<Artifact, Long> {

}
