//package com.leonid.springsecurityunderstanding.part3.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.httpBasic(Customizer.withDefaults()); // mandatory
//        http.authorizeHttpRequests(c->c.anyRequest().authenticated()); // c - customizer
//        // or
//        // http.authorizeHttpRequests(c->c.anyRequest().permitAll());
//
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        String encodedPassword = passwordEncoder().encode("pass");
//        UserDetails userDetails = User.builder().username("leo").password(encodedPassword).roles("USER").build();
//        manager.createUser(userDetails);
//
//        http.userDetailsService(manager);
//        return http.build();
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
