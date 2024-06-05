package com.example.user_service.dto;

import java.util.Date;
import java.util.List;

import com.example.user_service.vo.ResponseOrder;

import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String email;
    private String pwd;
    private String userId;
    private Date createdAt;

    private String encryptedPwd;

    private List<ResponseOrder> orders;
}
