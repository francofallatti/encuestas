package com.project.encuestabackend.services;

import com.project.encuestabackend.dto.UserDto;
import com.project.encuestabackend.entites.UserEntity;
import com.project.encuestabackend.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    //private final UserMapper mapper;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        //this.mapper = mapper;
    }

    @Override
    public List<UserDto> getUsers() {
        /*List<UserEntity> response = userRepository.findAll();
        return mapper.toUserDtoList(response);*/
        return null;
    }

    @Override
    public UserEntity creteUser(UserDto userDto) {
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(userDto,user);
        user.setEncryptedPassword(userDto.getPassword());
        return userRepository.save(user);
        /*
        UserEntity entity = mapper.toUserEntity(userDto);
        UserEntity response = userRepository.save(entity);
        return mapper.toUserDto(response);*/
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
