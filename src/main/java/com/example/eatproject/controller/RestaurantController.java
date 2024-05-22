// 클라이언트의 요청을 처리
package com.example.eatproject.controller;

import com.example.eatproject.dto.RestaurantDetailsDto;
import com.example.eatproject.dto.RestaurantListDto;
import com.example.eatproject.entity.RestaurantEntity;
import com.example.eatproject.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService eatService;

    //음식점 리스트용 엔드포인트, 음식명으로 검색요청 매핑
    @GetMapping("/restaurants/search/byFoodName")
    public List<RestaurantListDto> searchRestaurantsByFoodName(@RequestParam String foodName) {
        List<RestaurantEntity> restaurantEntities = eatService.searchRestaurantsByFoodNameContaining(foodName);
        return restaurantEntities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    //음식점 리스트용 엔드포인트, 식당주소로 검색요청 매핑
    @GetMapping("/restaurants/search/byAddress")
    public List<RestaurantListDto> searchRestaurantsByAddress(@RequestParam String address) {
        List<RestaurantEntity> restaurantEntities = eatService.searchRestaurantsByAddressContaining(address);
        return restaurantEntities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    //음식점 세부 페이지 엔드포인트, ID로 검색요청 매핑
    @GetMapping("/restaurants/details/{id}")
    public RestaurantDetailsDto getRestaurantDetails(@PathVariable Long id) {
        RestaurantEntity restaurantEntity = eatService.getRestaurantById(id);
        return convertToDetailsDto(restaurantEntity);
    }

    private RestaurantListDto convertToDto(RestaurantEntity restaurantEntity) {
        RestaurantListDto restaurantListDto = new RestaurantListDto();
        restaurantListDto.setName(restaurantEntity.getName());
        restaurantListDto.setInfo(restaurantEntity.getInfo());

        return restaurantListDto;
    }

    private RestaurantDetailsDto convertToDetailsDto (RestaurantEntity restaurantEntity){
        RestaurantDetailsDto restaurantDetailsDto = new RestaurantDetailsDto();
        restaurantDetailsDto.setName(restaurantEntity.getName());
        restaurantDetailsDto.setNumber(restaurantEntity.getNumber());
        restaurantDetailsDto.setAddress(restaurantEntity.getAddress());
        return restaurantDetailsDto;
    }
}

