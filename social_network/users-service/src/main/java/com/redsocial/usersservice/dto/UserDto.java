package com.redsocial.usersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String cellphone;
    private String lastname;
    private String name;
    private List<PostDto> posts;
}
