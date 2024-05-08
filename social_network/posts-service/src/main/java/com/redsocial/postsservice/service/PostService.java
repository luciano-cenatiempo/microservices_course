package com.redsocial.postsservice.service;

import com.redsocial.postsservice.model.Post;
import com.redsocial.postsservice.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService{
    @Autowired
    private IPostRepository repository;
    @Override
    public List<Post> findPostByUserId(Long userId) {
        return repository.findPostByUserId(userId);
    }
}
