// 클라이언트에 반환될 음식점 정보를 나타내는 클래스 json형식의 데이터로 반환 돼 클라이언트에게 응답
//엔티티와의 차이는 클라이언트에 반환될 때만 필요한 정보를 포함
package com.example.eatproject.dto;

public class RestaurantDto {

    private String name;
    private String number;
    private String address;

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
