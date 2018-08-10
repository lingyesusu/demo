package com.example.demo.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by SCPC03 on 2018/8/9.
 */
public class IndexVo {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

}