// JPA를 이용하여 식당 정보를 데이터베이스에서 관리하는데 사용되는 리포지토리
package com.example.eatproject.repository;

import com.example.eatproject.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeEntity, Long> {

    List<RecipeEntity> findByFoodNameContaining(String foodName);

    List<RecipeEntity> findTop10ByOrderByLikeCountDesc();
}



/* sql 로그 확인 명령어
 spring.jpa.show-sql=true
 spring.jpa.properties.hibernate.format_sql=true
 */