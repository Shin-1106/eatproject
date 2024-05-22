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
