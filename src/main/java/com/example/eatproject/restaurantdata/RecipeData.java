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
        recipe1.setRecipe("1.재료 손질 2.면 삶음 3.스파게티 요리");
        recipe1.setIngredients("파스타 면, 고기, 토마토 소스, 베이컨, 양파, 버섯, 다진마늘, 우유, 생크림");
        recipe1.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/11/19/7e815793fae78fdb36b2b65b31e6dfa61.jpg");
        recipeRepository.save(recipe1);

        RecipeEntity recipe2 = new RecipeEntity();
        recipe2.setFoodName("스팸 김치볶음밥");
        recipe2.setCalories("400");
        recipe2.setRecipe("1.파, 김치, 스팸을 잘라서 재료를 준비 2.파기름을 내준다 3.볶아먹는다");
        recipe2.setIngredients("김치, 스팸, 대파, 계란, 간장, 고춧가루, 통깨");
        recipe2.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2022/02/08/8288bc11431681ee92d68d252fe7dd8f1.jpg");
        recipeRepository.save(recipe2);

        RecipeEntity recipe3 = new RecipeEntity();
        recipe3.setFoodName("간장찜닭");
        recipe3.setCalories("400");
        recipe3.setRecipe("1.재료 손질 2.닭 삶기 3.찜닭 조리");
        recipe3.setIngredients("닭, 감자, 양파, 당근, 간장, 설탕, 맛술, 다진마늘, 참기름, 물");
        recipe3.setImage("");
        recipeRepository.save(recipe3);

        RecipeEntity recipe4 = new RecipeEntity();
        recipe4.setFoodName("간장계란밥");
        recipe4.setCalories("400");
        recipe4.setRecipe("1.계란 조리 2.간장, 참기름 넣기 3.볶기");
        recipe4.setIngredients("파스타 면, 고기, 토마토 소스");
        recipe4.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/09/06/115b2b934fd77085518877677d1266fa1.jpg");
        recipeRepository.save(recipe4);

        RecipeEntity recipe5 = new RecipeEntity();
        recipe5.setFoodName("치킨마요덮밥");
        recipe5.setCalories("400");
        recipe5.setRecipe("1.재료 손질 2.요리");
        recipe5.setIngredients("닭가슴살, 양파, 달걀, 밥, 다진마늘, 청주, 소금, 후추, 간장, 올리고당, 맛술, 마요네즈, 쪽파");
        recipe5.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/09/01/0a4c6436795e8547f2ae0c66b1066f551.png");
        recipeRepository.save(recipe5);
    }
}
