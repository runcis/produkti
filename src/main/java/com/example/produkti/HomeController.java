package com.example.produkti;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {


    @RequestMapping("/")
    public ModelAndView home () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping("/veikali")
    public ModelAndView veikali () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("veikals", new Veikals("Rimi"));
        modelAndView.setViewName("veikali");
        return modelAndView;
    }

    @RequestMapping("/produkti")
    public ModelAndView produkti () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("produkti");
        return modelAndView;
    }
    @RequestMapping("/akcijas")
    public ModelAndView akcijas () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("akcijas");
        return modelAndView;
    }
    @RequestMapping("/parmums")
    public ModelAndView parmums () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("parmums");
        return modelAndView;
    }
}
