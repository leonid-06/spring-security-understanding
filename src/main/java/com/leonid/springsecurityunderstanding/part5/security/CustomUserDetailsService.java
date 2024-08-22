//package com.leonid.springsecurityunderstanding.part5.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import java.util.List;
//
//@Configuration
//public class CustomUserDetailsService {
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        String encodedPassword1 = passwordEncoder().encode("pass");
//        String encodedPassword2 = passwordEncoder().encode("word");
//        UserDetails u1 = new CustomUser("leo", encodedPassword1);
//        UserDetails u2 = new CustomUser("maty", encodedPassword2);
//
//        return new UserDetailsServiceImpl(List.of(u1, u2));
//    }
//}
