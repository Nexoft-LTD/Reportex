package com.reportex.Dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class UserDto {

    private Integer id;

    @NonNull
    private String name;

    @NonNull
    private String surname;

    @NonNull
    private String fullName;

    @NonNull
    private String email;

    @NonNull
    private String username;

    @NonNull
    private String password;
}
