package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.Models.ShopModel;
import com.example.servingwebcontent.repo.ShopModelRepo;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainControllers {

    @GetMapping("/")
    public String home (Model model) {
        model.addAttribute("title"," Привет");
        return "home";
    }

//    public String basket (Model model) {
//        return "basket";
//  }
    @GetMapping("/AddP")
    public String AddP (Model model) {

        return "/AddP";

    }
    @PostMapping ("/AddP")
    public  String ShopPostAddP (@RequestParam String title , @RequestParam String full_text ,@RequestParam String Characteristic, Model model){
ShopModel post = new ShopModel(title,full_text,Characteristic );
         ShopModelRepo.save(post);
    return  "redirect:/blog";

    }
    @GetMapping("/shop/{id}")
    public String ShopDetails  ( @PathVariable(value = "id")  long id , Model model) {
        return "ShopAdd";
    }
}