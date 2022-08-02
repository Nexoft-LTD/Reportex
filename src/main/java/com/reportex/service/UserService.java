package com.reportex.service;

import com.reportex.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {

    List<UserDto> findAll();

    Map<String, String> findAllUserName();

    UserDto findById(int id);

    UserDto crateUser(UserDto userDto);

    void deleteUser(int id);

    void validationUserData(UserDto userDto);
}
