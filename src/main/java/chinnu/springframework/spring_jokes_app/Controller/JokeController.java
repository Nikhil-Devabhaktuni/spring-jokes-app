package chinnu.springframework.spring_jokes_app.Controller;

import chinnu.springframework.spring_jokes_app.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  // UI Utilization import
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {


    private final JokeService jokeService;


    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/","index"})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
