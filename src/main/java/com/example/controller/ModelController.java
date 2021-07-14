package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {

    @GetMapping("/helloModel")
    public String hello(Model model) {
        model.addAttribute("massege","hellllo");
        return "hello";
    }

}
