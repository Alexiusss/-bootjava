package ru.bootjava.restaurantvoting.model;

import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private Set<Role> roles;

}
