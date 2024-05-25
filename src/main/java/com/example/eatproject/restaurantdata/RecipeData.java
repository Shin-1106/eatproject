//음식점 정보를 DB에 저장하는 클래스
// 현재는 단순히 초기 데이터를 저장하기 위해 CommandLineRunner를 사용하여 DB에 초기 데이터를 저장
package com.example.eatproject.restaurantdata;

import com.example.eatproject.entity.RecipeEntity;
import com.example.eatproject.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RecipeData implements CommandLineRunner {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public void run(String... args) throws Exception {

        RecipeEntity recipe1 = new RecipeEntity();
        recipe1.setFoodName("크림 스파게티");
        recipe1.setCalories("400");
        recipe1.setRecipe("파스타 면, 고기");
        recipe1.setIngredients("파스타 면, 고기, 토마토 소스");
        recipeRepository.save(recipe1);
    }
}
