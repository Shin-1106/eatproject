// 클라이언트에 반환될 음식점 정보를 나타내는 클래스 json형식의 데이터로 반환 돼 클라이언트에게 응답
//엔티티와의 차이는 클라이언트에 반환될 때만 필요한 정보를 포함
package com.example.eatproject.dto;

public class RecipeDetailsDto {

    private Long id;
    private String foodName;
    private String calories;
    private String recipe;
    private String ingredients;
    private String image;

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

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
