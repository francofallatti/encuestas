package com.project.encuestabackend.controllers;


import com.project.encuestabackend.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping()
    public String createUser(@RequestBody @Valid UserDto userDto){
        return "Create user";
    }
}