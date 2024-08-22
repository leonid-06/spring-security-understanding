//package com.leonid.springsecurityunderstanding.part5.security;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Collections;
//
//public class CustomUser implements UserDetails {
//
//    private final String username;
//    private String password;
//    private Collection<? extends GrantedAuthority> authorities;
//
//    public CustomUser(String username, String password) {
//        this.username = username;
//        this.password = password;
//        this.authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//}
