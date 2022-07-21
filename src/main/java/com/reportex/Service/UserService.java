package com.reportex.Service;

import com.reportex.Dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> findAll();

    UserDto findById(int id);

    UserDto crateUser(UserDto userDto);

    void deleteUser(int id);
}
