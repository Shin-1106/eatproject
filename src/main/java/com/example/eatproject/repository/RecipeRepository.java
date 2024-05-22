package com.example.eatproject.repository;

import com.example.eatproject.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Long> {

    List<RecipeEntity> findByFoodNameContaining(String foodName);
}
