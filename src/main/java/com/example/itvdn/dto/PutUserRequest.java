package com.example.itvdn.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Data;

@Data
public class PutUserRequest {
    @NotNull
    private String name;
    @Null
    private String surname;
    @NotNull
    private String login;
    @NotNull
    private String password;
    @Email
    @NotNull
    private String email;

    public PutUserRequest(){
    }
}
