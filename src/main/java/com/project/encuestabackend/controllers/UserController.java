package com.project.encuestabackend.controllers;


import com.project.encuestabackend.dto.UserDto;
import com.project.encuestabackend.entites.UserEntity;
import com.project.encuestabackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping()
    public UserEntity createUser(@RequestBody @Valid UserDto userDto){

        return userService.creteUser(userDto);
    }
}
