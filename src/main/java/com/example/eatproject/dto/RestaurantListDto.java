package com.example.eatproject.dto;

public class RestaurantListDto {

    private Long id;
    private String name;
    private String info;
    private String image;

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
