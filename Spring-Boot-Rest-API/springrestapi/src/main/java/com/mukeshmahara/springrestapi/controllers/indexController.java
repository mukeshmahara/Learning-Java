package com.mukeshmahara.springrestapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class indexController {

    @RequestMapping("/")
    public ModelAndView home(){
        System.out.println("this is form index controller");
        ModelAndView m = new ModelAndView();

        return m;
    }
}
