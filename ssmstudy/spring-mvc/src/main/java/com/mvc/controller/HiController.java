package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HiController {

    @RequestMapping("/")
    public String portal(){

        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }

    @RequestMapping("/hello/rest/{name}/{id}")
    public String rest(@PathVariable("name") String name,@PathVariable("id") Integer id){
        System.out.println("id="+id+",name="+name);
        return "success";
    }
    @RequestMapping("/hello/mav")
    public ModelAndView textmav(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("testReauest","hello,ModelAndView");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/hello/model")
    public String textmadel(Model model){
        model.addAttribute("testReauest","hello,Model");
        return "success";
    }

}
