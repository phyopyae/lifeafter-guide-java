package com.techbook.lifeafter.guide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.techbook.lifeafter.guide.service.IngredientService;

@Controller
public class IngredientsController {

	@Autowired
	IngredientService ingredientService;

	@GetMapping("/ingredients")
	private String getAllIngredientTypes(Model model) {
		model.addAttribute("allIngredientTypes", ingredientService.getAllType());
		return "index";
	}
}
