// 데이터베이스에 저장될 음식점 정보를 나타내는 클래스
package com.example.eatproject.entity;

import jakarta.persistence.*;

@Table(name = "restaurant_entity")
@Entity
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foodName;
    private String name;
    private String number;
    private String address;
    private String info;
    @Column(length = 1024)
    private String image;

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public String getInfo() { return info; }

    public void setInfo(String info) { this.info = info; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


