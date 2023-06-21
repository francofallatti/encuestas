package com.project.encuestabackend.services;

import com.project.encuestabackend.dto.UserDto;
import com.project.encuestabackend.entites.UserEntity;
import com.project.encuestabackend.mappers.UserMapper;
import com.project.encuestabackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public List<UserDto> getUsers() {
        List<UserEntity> response = userRepository.findAll();
        return mapper.toUserDtoList(response);
    }

    @Override
    public UserDto creteUser(UserDto userDto) {
        UserEntity entity = mapper.toUserEntity(userDto);
        UserEntity response = userRepository.save(entity);
        return mapper.toUserDto(response);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
