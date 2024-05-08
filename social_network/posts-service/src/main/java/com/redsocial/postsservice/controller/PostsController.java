package com.redsocial.postsservice.controller;

import com.redsocial.postsservice.model.Post;
import com.redsocial.postsservice.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private IPostService postService;
    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/{userId}")
    public List<Post> getPostByUserId(@PathVariable Long userId){
        System.out.println("------------ Estoy en el puerto: " + serverPort);
        return postService.findPostByUserId(userId);
    }
}
