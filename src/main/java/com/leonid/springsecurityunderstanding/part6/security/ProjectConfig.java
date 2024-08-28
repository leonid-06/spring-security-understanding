//package com.leonid.springsecurityunderstanding.part6.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class ProjectConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf(AbstractHttpConfigurer::disable);
//        http.cors(AbstractHttpConfigurer::disable);
//        http.httpBasic(Customizer.withDefaults());
//        http.formLogin(Customizer.withDefaults());
//        http.authorizeHttpRequests(c->c
//                .requestMatchers(HttpMethod.POST, "/register").permitAll()
//                .anyRequest().authenticated());
//        return http.build();
//    }
//}