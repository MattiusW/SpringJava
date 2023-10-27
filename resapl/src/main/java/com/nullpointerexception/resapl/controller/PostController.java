package com.nullpointerexception.resapl.controller;

import com.nullpointerexception.resapl.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts(){
        throw new IllegalArgumentException("Not implemented yet!");
    }
    @GetMapping("/posts/{id}")
    public Post getSinglePosts(@PathVariable long id){
        throw new IllegalArgumentException("Not implemented yet!");
    }
}
