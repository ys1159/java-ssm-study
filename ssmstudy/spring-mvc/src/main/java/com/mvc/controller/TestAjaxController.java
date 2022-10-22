package com.mvc.controller;


import com.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @RestController注解是springMVC提供的一个复合注解，标识在控制器的类上，就相当于为类添加了
 * @Controller注解，并且为其中的每个方法添加了@ResponseBody注解
 */
@Controller
public class TestAjaxController {

    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println("id=" + id);
        System.out.println("requestBody" + requestBody);
        response.getWriter().write("hello,Ajax");
    }

    @RequestMapping("/test/RequestBody")
    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,axios");

    }
    @RequestMapping("/test/ResponseBody/body")
    @ResponseBody
    public String testResponseBody(){
        return "success ";
    }

}
