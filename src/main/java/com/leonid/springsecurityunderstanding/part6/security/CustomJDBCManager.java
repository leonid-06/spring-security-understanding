//package com.leonid.springsecurityunderstanding.part6.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//
//@Component
//public class CustomJDBCManager extends JdbcUserDetailsManager {
//
//    @Autowired
//    public CustomJDBCManager(DataSource dataSource) {
//        super(dataSource);
//
//        String sqlForRetrieveUserDetails = "select username, password, enabled from users where username = ?";
//        String sqlForRetrieveRoles = "select username, authority from authorities where username = ?";
//        String sqlInsert = "INSERT INTO users (username, password, enabled) VALUES (?, ?, ?)";
//
//        this.setCreateUserSql(sqlInsert);
//        this.setUsersByUsernameQuery(sqlForRetrieveUserDetails);
//        this.setAuthoritiesByUsernameQuery(sqlForRetrieveRoles);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
