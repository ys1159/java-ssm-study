package com.example.demo.config;

import com.example.demo.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class CharFilterconfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean reg = new ServletRegistrationBean(new
                MyServlet(), "/mycharfilter");
        return reg;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();

        CharacterEncodingFilter filter = new CharacterEncodingFilter();

        filter.setEncoding("utf-8");
        filter.setForceEncoding(true);
        bean.setFilter(filter);
        bean.addUrlPatterns("/*");
        return bean;
    }


}
