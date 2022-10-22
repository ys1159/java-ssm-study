//package com.example.demo.config;
//
//
//import com.example.demo.filter.Myfilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class Filterconfig {
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean bean=new FilterRegistrationBean();
//        bean.setFilter(new Myfilter());
//        bean.addUrlPatterns("/user/*");
//        return bean;
//
//    }
//}
