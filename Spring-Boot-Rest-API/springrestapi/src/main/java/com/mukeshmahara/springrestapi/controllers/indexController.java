package com.mukeshmahara.springrestapi.controllers;

import com.mukeshmahara.springrestapi.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {

    @RequestMapping("/")
    public String home(){

        return "index.html";
    }
}
