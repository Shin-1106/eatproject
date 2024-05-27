package com.example.eatproject.dto;

public class RecipeListDto {

    private Long id;
    private String foodName;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
