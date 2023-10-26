package com.example.kursspring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class SecurityConfig {


    public void configure(HttpSecurity security) throws Exception{
        security.authorizeRequests()
                .requestMatchers("/h2-console/**").permitAll();
    }

    @Autowired
    public void securityUsers(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("MattiusW").password("123456789012").roles("ADMIN");
    }

}
