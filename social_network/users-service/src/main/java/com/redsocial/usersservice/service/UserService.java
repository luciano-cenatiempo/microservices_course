package com.redsocial.usersservice.service;

import com.redsocial.usersservice.dto.PostDto;
import com.redsocial.usersservice.dto.UserDto;
import com.redsocial.usersservice.model.User;
import com.redsocial.usersservice.repository.IPostsApi;
import com.redsocial.usersservice.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IPostsApi postsApi;
    @Override
    public UserDto getPostsByUserId(Long userId) {

        User user = userRepository.findById(userId).orElse(null);
        System.out.println(user.getName());
        if(user != null){
            UserDto userDto = new UserDto();

            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setCellphone(user.getCellphone());
            userDto.setLastname(user.getLastname());

            List<PostDto> posts= postsApi.getPostsByUserId(userId);
            System.out.println(posts.size());
            if (posts.size()>0){
                userDto.setPosts(posts);
            }
            return userDto;
        }

        System.out.println("-------- Devuelve null");
        return null;




    }
}
