// 클라이언트의 요청을 처리
package com.example.eatproject.controller;

import com.example.eatproject.dto.RestaurantDto;
import com.example.eatproject.entity.RestaurantEntity;
import com.example.eatproject.service.EatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RestaurantController {

    @Autowired
    private EatService eatService;

    //음식명으로 검색요청 매핑
    @GetMapping("/restaurants/search/byFoodName")
    public List<RestaurantDto> searchRestaurantsByFoodName(@RequestParam String foodName) {
        List<RestaurantEntity> restaurantEntities = eatService.searchRestaurantsByFoodNameContaining(foodName);
        return restaurantEntities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    //식당주소로 검색요청 매핑
    @GetMapping("/restaurants/search/byAddress")
    public List<RestaurantDto> searchRestaurantsByAddress(@RequestParam String address) {
        List<RestaurantEntity> restaurantEntities = eatService.searchRestaurantsByAddressContaining(address);
        return restaurantEntities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private RestaurantDto convertToDto(RestaurantEntity restaurantEntity) {
        RestaurantDto restaurantDto = new RestaurantDto();
        restaurantDto.setName(restaurantEntity.getName());
        restaurantDto.setNumber(restaurantEntity.getNumber());
        restaurantDto.setAddress(restaurantEntity.getAddress());

        return restaurantDto;
    }
}
