package com.techbook.lifeafter.guide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.techbook.lifeafter.guide.service.FoodService;

@Controller
public class FoodController {

	@Autowired
	FoodService foodService;

	@GetMapping("/foodRecipes")
	private String getAllFoodRecipes(Model model) {
		model.addAttribute("allFoodRecipes", foodService.getAllFoodRecipes());
		return "food_recipes";
	}
}
