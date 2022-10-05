package com.abby.fruityLoops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.fruityLoops.models.Item;


@Controller
public class ItemController {
	
    @RequestMapping("/")
    public String index(Model model) {
        
        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Kiwi", 1.50));
        fruits.add(new Item("Mango", 2.00));
        fruits.add(new Item("Goji Berries", 4.00));
        fruits.add(new Item("Guava", .75));
        fruits.add(new Item("Plum", 1.00));
        fruits.add(new Item("Pomelo", 5.00));
        model.addAttribute("fruit", fruits);
        
        return "index.jsp";
    }
}