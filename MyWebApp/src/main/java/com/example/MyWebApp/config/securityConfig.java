package com.example.MyWebApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class securityConfig extends WebSecurityConfiguration {

    @Bean
    protected UserDetailsService userDetailsService(){
        PasswordEncoder encoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
        User.UserBuilder userBuilder=User.builder().passwordEncoder(encoder::encode);

        UserDetails user1=userBuilder
                .username("user")
                .password("password")
                .roles("user")
                .build();

        return new InMemoryUserDetailsManager(user1);
}
}
