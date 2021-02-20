package com.learning.springjpamapping.repository;

import com.learning.springjpamapping.entity.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tags, Integer> {
}
