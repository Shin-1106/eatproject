// JPA를 이용하여 식당 정보를 데이터베이스에서 관리하는데 사용되는 리포지토리
package com.example.eatproject.repository;

import com.example.eatproject.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

    // 검색 기능 추가
    List<RestaurantEntity> findByFoodNameContaining(String foodName);

    List<RestaurantEntity> findByAddressContaining(String address);
}



