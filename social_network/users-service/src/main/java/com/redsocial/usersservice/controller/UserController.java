package com.redsocial.usersservice.controller;

import com.redsocial.usersservice.dto.UserDto;
import com.redsocial.usersservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/posts/{id}")
    public UserDto findPostsByUser(@PathVariable Long id){
        return userService.getPostsByUserId(id);
    }

}
