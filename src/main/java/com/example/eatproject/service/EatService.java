// 비즈니스 로직을 처리하고, 데이터베이스와의 상호작용을 담당
// 클라이언트가 요청한 음식명에 해당하는 식당 정보 검색 후 처리
package com.example.eatproject.service;

import com.example.eatproject.entity.RestaurantEntity;
import com.example.eatproject.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EatService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    //Containing 매서드로 요청 문자열을 포함하면, 해당 문자열을 모두 응답
    //음식명으로 검색
    public List<RestaurantEntity> searchRestaurantsByFoodNameContaining(String foodName) {
        return restaurantRepository.findByFoodNameContaining(foodName);
    }
    //식당주소로 검색
    public List<RestaurantEntity> searchRestaurantsByAddressContaining(String address) {
        return restaurantRepository.findByAddressContaining(address);
    }
}


