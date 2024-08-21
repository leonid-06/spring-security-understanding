//package com.leonid.springsecurityunderstanding.part4.security;
//
//import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class CustomAuthProvider implements AuthenticationProvider {
//
//    private final CustomUserDetailsService userService;
//
//    public CustomAuthProvider(CustomUserDetailsService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName();
//        String password = String.valueOf(
//                authentication.getCredentials());
//        UserDetails auth = userService.userDetailsService().loadUserByUsername(username);
//        if (auth != null && auth.getUsername() != null && auth.getPassword() != null) {
//            if (userService.passwordEncoder().matches(password, auth.getPassword())) {
//                return new UsernamePasswordAuthenticationToken(username, password, auth.getAuthorities());
//            } else {
//                throw new AuthenticationCredentialsNotFoundException(username);
//            }
//        }
//        throw new AuthenticationCredentialsNotFoundException(username);
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//    }
//}
