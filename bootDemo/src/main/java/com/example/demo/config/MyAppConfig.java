package com.example.demo.config;

import com.example.demo.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor = new LoginInterceptor();
        String path[] = {"/dev/**"};
        String epath[] = {"/dev/login"};
        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(epath);


    }
}
