// 클라이언트의 요청을 처리
package com.example.eatproject.controller;

import com.example.eatproject.dto.RecipeDetailsDto;
import com.example.eatproject.dto.RecipeListDto;
import com.example.eatproject.dto.RecipeRankingDto;
import com.example.eatproject.entity.RecipeEntity;
import com.example.eatproject.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    //레시피 세부 페이지에서 추천수 증가 엔드포인트, ID 매핑하여 카운트
    @PostMapping("/recipes/{id}/like")
    public void likeRecipe(@PathVariable Long id){
        recipeService.incrementLikeCount(id);
    }

    // 레시피 랭킹 제공 엔드포인트
    @GetMapping("/recipes/ranking")
    public ResponseEntity<List<RecipeRankingDto>> getRecipeRanking(){
        List<RecipeEntity> ranking = recipeService.getTop10RecipesByLikeCount();
        List<RecipeRankingDto> rankingDto = ranking.stream()
                .map(this::convertToRankingDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(rankingDto);
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
        recipeDetailsDto.setLikeCount(recipeEntity.getLikeCount());
        return recipeDetailsDto;
    }

    private RecipeRankingDto convertToRankingDto(RecipeEntity recipeEntity) {
        RecipeRankingDto rankingDto = new RecipeRankingDto();
        rankingDto.setId(recipeEntity.getId());
        rankingDto.setFoodName(recipeEntity.getFoodName());
        rankingDto.setImage(recipeEntity.getImage());
        return rankingDto;
    }
}
