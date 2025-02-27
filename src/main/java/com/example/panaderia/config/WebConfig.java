package com.example.panaderia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/").setViewName("index");
       registry.addViewController("productos").setViewName("productos");
       //registry.addViewController("caracteristicas").setViewName("caracteristicas");
       //registry.addViewController("contacto").setViewName("contacto");
       registry.addRedirectViewController("inicio", "/");
    }
    
}
