//package com.leonid.springsecurityunderstanding.part5.security;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.List;
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    List<UserDetails> users;
//
//    public UserDetailsServiceImpl(List<UserDetails> users) {
//        this.users = users;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElseThrow(()->new UsernameNotFoundException("User " + username + " not found"));
//    }
//}
