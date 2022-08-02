package com.reportex.controller;

import com.reportex.auth.TokenManager;
import com.reportex.entity.Login;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@Api(description = "Login process,generate token")
public class AuthController {
    @Autowired
    private TokenManager tokenManager;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    @ApiOperation(value = "For generate token ", response = String.class)
    public ResponseEntity<String> login(@ApiParam(value = "Data type : Login")
                                        @RequestBody Login login) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword()));

            return ResponseEntity.ok(tokenManager.generateToken(login.getUsername()));
        } catch (Exception e) {
            throw e;
        }
    }
}
