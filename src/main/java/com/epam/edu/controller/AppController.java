package com.epam.edu.controller;

import com.epam.edu.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    private Cat cat;

    // localhost (ip 127.0.0.1)
    // http://localhost:8080/
    // Front-Controller
    @RequestMapping("/")
    public String getHelloPage(Model model) {
        model.addAttribute("info", cat.getName());
        return "hello";
    }

    @Autowired
    @Value("Barsik")
    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
