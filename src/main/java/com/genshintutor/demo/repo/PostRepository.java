package com.genshintutor.demo.repo;

import com.genshintutor.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
