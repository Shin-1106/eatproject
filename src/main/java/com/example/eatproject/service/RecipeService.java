package com.example.eatproject.service;

import com.example.eatproject.entity.RecipeEntity;
import com.example.eatproject.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<RecipeEntity> searchRecipesByFoodNameContaining(String foodName) {
        return recipeRepository.findByFoodNameContaining(foodName);
    }

    public RecipeEntity getRecipeById(Long id) {
        return recipeRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Recipe not found"));
    }
}
