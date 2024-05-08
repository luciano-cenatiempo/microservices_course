package com.redsocial.postsservice.service;

import com.redsocial.postsservice.model.Post;

import java.util.List;

public interface IPostService {
    public List<Post> findPostByUserId(Long userId);
}
