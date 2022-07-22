package com.reportex.service.impl;

import com.reportex.dto.UserDto;
import com.reportex.entity.User;
import com.reportex.repository.UserRepository;
import com.reportex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<UserDto> findAll() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for (User user : userList) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setSurname(user.getSurname());
            userDto.setFullName(user.getFullName());
            userDto.setEmail(user.getEmail());
            userDto.setUsername(user.getUserName());
            userDto.setPassword(user.getPassword());
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

    @Override
    public Map<String, String> findAllUserName() {
        List<User> userList = userRepository.findAll();
        Map<String, String> usersMap = new HashMap<>();
        for (User user : userList) {
            usersMap.put(user.getUserName(), user.getPassword());
        }
        return usersMap;
    }

    @Override
    public UserDto findById(int id) {
        Optional<User> user = userRepository.findById(id);
        UserDto userDto = new UserDto();
        userDto.setId(user.get().getId());
        userDto.setName(user.get().getName());
        userDto.setSurname(user.get().getSurname());
        userDto.setFullName(user.get().getFullName());
        userDto.setEmail(user.get().getEmail());
        userDto.setUsername(user.get().getUserName());
        userDto.setPassword(user.get().getPassword());
        return userDto;
    }

    @Override
    public UserDto crateUser(UserDto userDto) {

        Assert.notNull(userDto, "Melumatlardan bos olan var.");

        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setFullName(userDto.getFullName());
        user.setEmail(userDto.getEmail());
        user.setUserName(userDto.getUsername());
        user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));

        User userDb = userRepository.save(user);
        userDto.setId(userDb.getId());

        return userDto;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }


}
