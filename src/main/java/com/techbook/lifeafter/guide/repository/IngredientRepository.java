package com.techbook.lifeafter.guide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.techbook.lifeafter.guide.model.Ingredients;

public interface IngredientRepository extends CrudRepository<Ingredients, Integer> {

	List<Ingredients> findByType(String type);
	
	@Query("SELECT DISTINCT type FROM Ingredients")
	List<String> getAllType();
}
