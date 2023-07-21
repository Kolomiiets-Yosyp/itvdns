package com.example.itvdn.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;


    public UserDto(String name, String surname, String email, String login, String password, String name1) {
    }
}
