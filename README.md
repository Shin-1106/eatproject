1. 프론트엔드에서 GET 요청 시 음식점 정보API를 제공
   
2. 클라이언트가 검색어를 통해 검색하면, 크롤링 한 정보를 리스트로 제공
- http://localhost:8080/restaurants/search/byFoodName?foodName=(음식명) 음식명으로 요청하는URL
- http://localhost:8080/restaurants/search/byAddress?address=(지역명) 지역명으로 요청하는URL
- 현재 Response body에는 식당명, 식당 전화번호, 식당주소를 포함하여 응답
- RestaurantData 클래스에 대한민국 행정구역별로 15개의 정보리스트를 구현 후 제공

// 개선필요 사항
- 전국 음식점 정보를 받아오기 위해서 네이버, 카카오 api나 동적 웹 크롤링 프로그램을 이용하는 방법 등을 고려하여 개선중에 있음
   
// 개발환경
- 자바(17) 스프링부트(3.2.4ver), Maven(4.0.0ver)
- 추가 라이브러리 Swagger, Lombok(1.18.32ver), H2, JPA
