//package com.example.demo.config;
//
//import com.example.demo.servlet.Myser;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class Servletconfig {
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        //public ServletRegistrationBean(T servlet, String... urlMappings)
//        //第一个参数是 Servlet对象， 第二个是url地址
//
//        //ServletRegistrationBean bean =
//        //new ServletRegistrationBean( new MyServlet(),"/myservlet");
//       // ServletRegistrationBean bean = new ServletRegistrationBean(new Myser(),"/mysevletconfig");
//        ServletRegistrationBean bean = new ServletRegistrationBean();
//        bean.setServlet(new Myser());
//        bean.addUrlMappings("/myservlet","/test");
//
//        return bean;
//
//
//    }
//}
