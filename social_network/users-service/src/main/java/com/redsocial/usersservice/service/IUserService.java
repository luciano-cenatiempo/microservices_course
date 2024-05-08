package com.redsocial.usersservice.service;

import com.redsocial.usersservice.dto.PostDto;
import com.redsocial.usersservice.dto.UserDto;

import java.util.List;

public interface IUserService {
    public UserDto getPostsByUserId(Long userId);
}
