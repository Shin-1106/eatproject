# 음식점 정보 제공 API
1. 프론트엔드에서 GET 요청 시 음식점 정보API를 제공

2. 음식점 리스트 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 검색어(String)로 검색하면 요청에 대한 응답
- http://localhost:8080/restaurants/search/byFoodName?foodName=(음식명) 음식명으로 요청하는URL
- http://localhost:8080/restaurants/search/byAddress?address=(지역명) 지역명으로 요청하는URL
- Response body에 포함되는 데이터는 식당명, 간단한 식당 소개, 식당이미지(아직 미구현)
- RestaurantData 클래스에 대한민국 행정구역별로 15개의 정보리스트를 구현 후 제공
   
3. 음식점 세부 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 리스트를 누르고 라우팅 되는 페이지에 세부 정보를 응답
- http://localhost:8080/restaurants/details/{id}
- 지정 된 ID값으로 매핑하여 데이터를 응답
- Response body에 포함되는 데이터는 식당명, 식당 전화번호, 식당주소

# 레시피(음식 정보) 제공 API
1. 프론트엔드에서 GET 요청 시 레시피 정보API를 제공

2. 레시피 리스트 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 음식명(String)으로 검색하면 요청에 대한 응답
- http://localhost:8080/recipes/search/byFoodName?foodName=(음식명) 음식명으로 요청하는URL
- Response body에 포함되는 데이터는 음식명, 음식이미지(아직 미구현)
- RecipeData 클래스에 음식정보와 레시피를 구현 후 제공

3. 레시피 세부 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 리스트를 누르고 라우팅 되는 페이지에 세부 정보를 응답
- http://localhost:8080/recipes/details/{id}
- 지정 된 ID값으로 매핑하여 데이터를 응답
- Response body에 포함되는 데이터는 음식명, 칼로리, 레시피, 기본재료
  
# 배포
- 현재 AWS EC2서버에 스프링 어플리케이션 배포 후 구동 완료
- Public IP상에서 데이터 성공적으로 출력 됨, 프론트와 연결중에 있음 > 프론트와 통신 완료



// 개선필요 사항
- 더 많은, 전국 음식점 정보를 받아오기 위해서 네이버, 카카오 api나 동적 웹 크롤링 프로그램을 이용하는 방법 등을 고려하여 개선중에 있음
- MySQL(DB)를 구축한 후 데이터를 DB와 연동 필요, 연동 후 POST 매핑을 통해 추천 수, 랭킹 기능 구현해야 함
   
// 개발환경
- 자바(17) 스프링부트(3.2.4ver), Maven(4.0.0ver)
- 추가 라이브러리 Swagger, Lombok(1.18.32ver), H2, JPA
- 배포 AWS EC2 
