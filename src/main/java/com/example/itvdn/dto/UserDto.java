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


    public UserDto(@NotNull String id, String name, String surname, String login, String password, String email) {

    }
}
