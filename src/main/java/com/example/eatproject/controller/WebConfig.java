// 전체 애플리케이션에 대해 CORS 허용을 위해 WebMvcConfigurer 설정
package com.example.eatproject.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
