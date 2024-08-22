package com.leonid.springsecurityunderstanding.part6.controller;

import com.leonid.springsecurityunderstanding.part6.security.CustomJDBCManager;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegistrationController {

    private final CustomJDBCManager jdbcManager;

    @Data
    static class UserDTO {
        private String username;
        private String password;
        private final boolean enabled = true;
    }

    @PostMapping("/register")
    public void register(@RequestBody UserDTO user) {
        UserDetails details = User.withUsername(user.getUsername()).password(user.getPassword()).authorities("write").build();
        jdbcManager.createUser(details);
    }
}
