package com.example.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}