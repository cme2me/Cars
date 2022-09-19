package com.example.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class UserEntity {
    private UUID userId;
    private String name;
    private String number;
    private Long previousOperations;
    private String feedBack;
    private String email;
    private byte[] photo;
    private Long favorites;
}
