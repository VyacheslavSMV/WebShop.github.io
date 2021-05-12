package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.Models.ShopModel;
import com.example.servingwebcontent.repo.ShopModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
    public class ShopController {
@Autowired
private ShopModelRepo ShopModelRepo ;



    @GetMapping("/shop")
    public String ShopWindow (Model model) {
        Iterable<ShopModel> shops = ShopModelRepo.findAll();
        model.addAttribute("shops", shops);
        return "ShopWindow";
    }

}