package neeraj.springframework.springbootjokesapp.controller;

import neeraj.springframework.springbootjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping(value = "")
    public String jokes(Model model){
        model.addAttribute("joke",jokeService.sayJokes());
        return "index";
    }

}
