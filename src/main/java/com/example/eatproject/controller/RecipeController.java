// 클라이언트의 요청을 처리
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

    //레시피 리스트용 엔드포인트, 음식명으로 검색요청 매핑
    @GetMapping("/recipes/search/byFoodName")
    public List<RecipeListDto> searchRecipesByName(@RequestParam String foodName) {
        List<RecipeEntity> recipeEntities = recipeService.searchRecipesByFoodNameContaining(foodName);
        return recipeEntities.stream()
                .map(this::convertToListDto)
                .collect(Collectors.toList());
    }

    //레시피 세부 페이지 엔드포인트, ID로 검색요청 매핑
    @GetMapping("/recipes/details/{id}")
    public RecipeDetailsDto getRecipeDetails(@PathVariable Long id) {
        RecipeEntity recipeEntity = recipeService.getRecipeById(id);
        return convertToDetailsDto(recipeEntity);
    }

    private RecipeListDto convertToListDto(RecipeEntity recipeEntity) {
        RecipeListDto recipeListDto = new RecipeListDto();
        recipeListDto.setId(recipeEntity.getId());
        recipeListDto.setFoodName(recipeEntity.getFoodName());
        recipeListDto.setImage(recipeEntity.getImage());
        return recipeListDto;
    }

    private RecipeDetailsDto convertToDetailsDto(RecipeEntity recipeEntity) {
        RecipeDetailsDto recipeDetailsDto = new RecipeDetailsDto();
        recipeDetailsDto.setId(recipeEntity.getId());
        recipeDetailsDto.setFoodName(recipeEntity.getFoodName());
        recipeDetailsDto.setCalories(recipeEntity.getCalories());
        recipeDetailsDto.setRecipe(recipeEntity.getRecipe());
        recipeDetailsDto.setIngredients(recipeEntity.getIngredients());
        recipeDetailsDto.setImage(recipeEntity.getImage());
        return recipeDetailsDto;
    }
}
