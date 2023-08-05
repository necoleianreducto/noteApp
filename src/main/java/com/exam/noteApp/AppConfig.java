package com.exam.noteApp;

import com.exam.noteApp.respository.UserRepository;
import com.exam.noteApp.respository.UserRespositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.exam.noteApp")
public class AppConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRespositoryImpl(); // You might need to configure and initialize UserRepository here
    }
}
