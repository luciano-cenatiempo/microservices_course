package com.redsocial.usersservice.repository;

import com.redsocial.usersservice.dto.PostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="posts-service")
public interface IPostsApi {
    @GetMapping("/posts/{userId}")
    public List<PostDto> getPostsByUserId(@PathVariable Long userId);
}
