package com.techbook.lifeafter.guide.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techbook.lifeafter.guide.model.FoodRecipes;
import com.techbook.lifeafter.guide.repository.FoodRepository;

@Service
public class FoodService {

	@Autowired
	FoodRepository foodRepository;

	public List<FoodRecipes> getAllFoodRecipes() {
		List<FoodRecipes> foodRecipes = new ArrayList<FoodRecipes>();
		foodRepository.findAll().forEach(foodRecipe -> foodRecipes.add(foodRecipe));
		return foodRecipes;
	}
}
