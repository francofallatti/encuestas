package com.project.encuestabackend.mappers;

import com.project.encuestabackend.dto.UserDto;
import com.project.encuestabackend.entites.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDto toUserDto(UserEntity userEntity);
    List<UserDto> toUserDtoList(List<UserEntity> userEntityList);
    UserEntity toUserEntity(UserDto userDto);
}
