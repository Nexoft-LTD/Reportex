package com.reportex.Controller;

import com.reportex.Dto.UserDto;
import com.reportex.Service.Impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userServiceImpl.crateUser(userDto));
    }

    @DeleteMapping
    public void deleteUser(@RequestParam int id) {
        userServiceImpl.deleteUser(id);
    }

    @GetMapping
    public ResponseEntity<UserDto> getUserById(@RequestParam int id) {
        return ResponseEntity.ok(userServiceImpl.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getAllUser() {
        return ResponseEntity.ok(userServiceImpl.findAll());
    }

}
