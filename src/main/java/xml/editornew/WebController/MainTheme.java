package xml.editornew.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainTheme {

    ModelAndView modelAndView = new ModelAndView();

    @GetMapping("/")
    public ModelAndView mainTheme(){
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

}
