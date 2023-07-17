package com.example.itvdn.Controllers;

import com.example.itvdn.UsersStorage;
import com.example.itvdn.dto.PutUserRequest;
import com.example.itvdn.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValidationController {
    private UsersStorage usersStorage;

    public ValidationController(UsersStorage usersStorage) {
        this.usersStorage= usersStorage;
    }

    @GetMapping(path = "/getUser")
    public UserDto getUserByID(@RequestParam("id")int id, String name){

    return  usersStorage.getUserByID(id, name);
    }

    @PutMapping(path = "/user")
    public ResponseEntity putUser(@Validated @RequestBody PutUserRequest putUserRequest){
        usersStorage.putUser(putUserRequest );
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
