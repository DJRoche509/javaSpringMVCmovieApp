package com.javaunit3.springmvc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MovieController {
    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/")
    public String getBestMoviePage(Model model){
        BestMovieService bestMovieService = null;
        model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTitle());
        return ("bestMovie");
    }
}
