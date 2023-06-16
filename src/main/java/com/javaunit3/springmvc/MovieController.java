package com.javaunit3.springmvc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/voteForBestMovieForm")
    public String voteForBestMovieFormPage() {
        return "voteForBestMovie";
    }

    @RequestMapping("/voteForBestMovie")
    public String voteForBestMovie(HttpServletRequest request, Model model) {

        String movieTitle = request.getParameter("movieTitle");

        model.addAttribute("BestMovieVote", movieTitle);

        return "voteForBestMovie";
    }
}
