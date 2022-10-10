package com.zzame.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "zzame");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNextTime(Model model){
        model.addAttribute("nickname", "zzame");
        return "goodbye";
    }
}
