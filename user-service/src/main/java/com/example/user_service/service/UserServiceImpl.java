package com.example.user_service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.user_service.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public UserDto createUser(UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());
        return null;
    }

}
