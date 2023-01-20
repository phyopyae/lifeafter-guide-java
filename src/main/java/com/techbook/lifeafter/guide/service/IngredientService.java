package com.techbook.lifeafter.guide.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techbook.lifeafter.guide.model.Ingredients;
import com.techbook.lifeafter.guide.repository.IngredientRepository;

@Service
public class IngredientService {

	@Autowired
	IngredientRepository ingredientRepository;

	public List<Ingredients> getAllIngredients() {
		List<Ingredients> ingredients = new ArrayList<Ingredients>();
		ingredientRepository.findAll().forEach(ingredient -> ingredients.add(ingredient));
		return ingredients;
	}
	
	public List<Ingredients> getIngredientsByType(String type) {
		List<Ingredients> ingredients = new ArrayList<Ingredients>();
		ingredientRepository.findByType(type).forEach(ingredient -> ingredients.add(ingredient));
		return ingredients;
	}
	
	public List<String> getAllType() {
		List<String> types = new ArrayList<String>();
		ingredientRepository.getAllType().forEach(type -> types.add(type));
		return types;
	}
}
