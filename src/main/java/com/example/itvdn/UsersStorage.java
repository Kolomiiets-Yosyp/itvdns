package com.example.itvdn;

import com.example.itvdn.dto.PutUserRequest;
import com.example.itvdn.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UsersStorage {
    public List<UserDto> users = new ArrayList<>();
    public void putUser(PutUserRequest putUserRequest){

        int id = users.size()+1;
         users.add(new UserDto( putUserRequest.getName(),
                 putUserRequest.getSurname(),
                 putUserRequest.getEmail(),
                 putUserRequest.getLogin()
                 ,putUserRequest.getPassword(),
        putUserRequest.getName()));
    }
    public UserDto getUserByID(int id){

        return users.get(id);
    }

}
