package com.learning.springjpamapping.repository;

import com.learning.springjpamapping.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Integer> {
}
