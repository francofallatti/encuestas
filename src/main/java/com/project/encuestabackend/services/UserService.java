package com.project.encuestabackend.services;

import com.project.encuestabackend.dto.UserDto;
import com.project.encuestabackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();
    UserDto creteUser(UserDto userDto);
    UserDto updateUser(Long id, UserDto userDto);
    void deleteUser(Long id);

}
