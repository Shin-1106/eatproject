package com.example.eatproject.controller;

import com.example.eatproject.dto.RecipeDetailsDto;
import com.example.eatproject.dto.RecipeListDto;
import com.example.eatproject.entity.RecipeEntity;
import com.example.eatproject.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipes/search/byFoodName")
    public List<RecipeListDto> searchRecipesByName(@RequestParam String foodName) {
        List<RecipeEntity> recipeEntities = recipeService.searchRecipesByFoodNameContaining(foodName);
        return recipeEntities.stream()
                .map(this::convertToListDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/recipes/details/{id}")
    public RecipeDetailsDto getRecipeDetails(@PathVariable Long id) {
        RecipeEntity recipeEntity = recipeService.getRecipeById(id);
        return convertToDetailsDto(recipeEntity);
    }

    private RecipeListDto convertToListDto(RecipeEntity recipeEntity) {
        RecipeListDto recipeListDto = new RecipeListDto();
        recipeListDto.setFoodName(recipeEntity.getFoodName());
        return recipeListDto;
    }

    private RecipeDetailsDto convertToDetailsDto(RecipeEntity recipeEntity) {
        RecipeDetailsDto recipeDetailsDto = new RecipeDetailsDto();
        recipeDetailsDto.setFoodName(recipeEntity.getFoodName());
        recipeDetailsDto.setCalories(recipeEntity.getCalories());
        recipeDetailsDto.setRecipe(recipeEntity.getRecipe());
        recipeDetailsDto.setIngredients(recipeEntity.getIngredients());
        return recipeDetailsDto;
    }
}
