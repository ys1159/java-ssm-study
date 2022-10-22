package com.example.demo.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "school")
public class Schoolinfo {

    private String name;
    private Integer age;
    private String web;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", web='" + web + '\'' +
                '}';
    }


}
