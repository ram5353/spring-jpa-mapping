package com.learning.springjpamapping.controller;


import com.learning.springjpamapping.dto.PostDTO;
import com.learning.springjpamapping.entity.Posts;
import com.learning.springjpamapping.repository.PostsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {

    private PostsRepository postsRepository;

    public PostsController(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @PostMapping("/addpost")
    public Posts addPost(@RequestBody PostDTO postDTO) {
        return postsRepository.save(postDTO.getPosts());
    }


    @GetMapping("/posts")
    private List<Posts> findAllPosts() {
        return postsRepository.findAll();
    }
}
