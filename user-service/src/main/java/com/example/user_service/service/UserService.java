package com.example.user_service.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.user_service.dto.UserDto;
import com.example.user_service.jpa.UserEntity;

public interface UserService extends UserDetailsService{
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
