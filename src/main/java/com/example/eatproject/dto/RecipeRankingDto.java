package com.example.eatproject.dto;

public class RecipeRankingDto {
    private Long id;
    private String foodName;
    private String image;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getFoodName() {return foodName;}

    public void setFoodName(String foodName) {this.foodName = foodName;}

    public String getImage() {return image;}

    public void setImage(String image) {this.image = image;}
}
