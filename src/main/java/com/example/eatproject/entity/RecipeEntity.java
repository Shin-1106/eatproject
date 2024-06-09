// 데이터베이스에 저장될 음식점 정보를 나타내는 클래스
package com.example.eatproject.entity;

import jakarta.persistence.*;

@Table(name = "recipe_entity")
@Entity
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foodName;
    private String calories;
    private String recipe;
    private String ingredients;
    @Column(length = 1024)
    private String image;
    private int likeCount;

    public int getLikeCount() {return likeCount;}

    public void setLikeCount(int likeCount) {this.likeCount = likeCount;}

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
