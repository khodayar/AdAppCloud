package com.khodayar.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khodayar.app.models.Advertisement;

@Controller
public class AdController {
    
    @Autowired
    private List<Advertisement> adds;
    
    @RequestMapping ("/")
    public String showHome(Model model){
        
        model.addAttribute("list",adds);

        return ("home");
    }
    
    
    @RequestMapping ("/add/{title}")
    public String showAdd(@PathVariable("title")String title, Model model){
        Long addId = (long) adds.size();
        adds.add(new Advertisement (title , addId));
        model.addAttribute("list",adds);
        return ("home");
    }

}
