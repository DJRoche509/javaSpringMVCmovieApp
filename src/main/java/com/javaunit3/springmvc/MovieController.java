package com.javaunit3.springmvc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MovieController {
    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }
}
