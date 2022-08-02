package com.reportex.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@EqualsAndHashCode(of = {"id"})
public class UserDto {

    private Integer id;

    @NotNull(message = "Name shouldn't not be null")
    @NotEmpty(message = "Name shouldn't not be empty")
    private String name;

    @NotNull(message = "Surname shouldn't not be null")
    @NotEmpty(message = "Surname shouldn't not be empty")
    private String surname;

    @NotNull(message = "Full name shouldn't not be null")
    @NotEmpty(message = "Full name shouldn't not be empty")
    private String fullName;

    @Email(message = "Invalid email address")
    @NotNull(message = "Email shouldn't not be null")
    @NotEmpty(message = "Email shouldn't not be empty")
    private String email;

    @NotNull(message = "Username shouldn't not be null")
    @NotEmpty(message = "Username shouldn't not be empty")
    private String username;

    @NotNull(message = "Password shouldn't not be null")
    @NotEmpty(message = "Password shouldn't not be empty")
    private String password;
}
