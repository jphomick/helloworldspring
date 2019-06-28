package com.joseph.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "Testing the new variable.");
        return "index";
    }
    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login,
                               Model model){
        model.addAttribute("loginval", login);
        return "confirm";
    }
}
