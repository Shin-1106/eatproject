// JPA를 이용하여 식당 정보를 데이터베이스에서 관리하는데 사용되는 리포지토리
package com.example.eatproject.repository;

import com.example.eatproject.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Long> {

    List<RecipeEntity> findByFoodNameContaining(String foodName);
}
