// 비즈니스 로직을 처리하고, 데이터베이스와의 상호작용을 담당
// 클라이언트가 요청한 음식명에 해당하는 식당 정보 검색 후 처리
package com.example.eatproject.service;

import com.example.eatproject.entity.RecipeEntity;
import com.example.eatproject.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void incrementLikeCount(Long id) {
        RecipeEntity recipe = recipeRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Recipe not found"));
        recipe.setLikeCount(recipe.getLikeCount() + 1);
        recipeRepository.save(recipe);
    }

    public List<RecipeEntity> getTop10RecipesByLikeCount(){
        return recipeRepository.findTop10ByOrderByLikeCountDesc();
    }
}
