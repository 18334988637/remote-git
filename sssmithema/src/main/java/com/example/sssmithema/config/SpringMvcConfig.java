package com.example.sssmithema.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.example.sssmithema.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
