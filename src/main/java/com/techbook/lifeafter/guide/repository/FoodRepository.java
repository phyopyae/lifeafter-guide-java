package com.techbook.lifeafter.guide.repository;

import org.springframework.data.repository.CrudRepository;

import com.techbook.lifeafter.guide.model.FoodRecipes;

public interface FoodRepository extends CrudRepository<FoodRecipes, Integer> {

}
