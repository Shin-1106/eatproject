# 음식점 정보 제공 API
1. 프론트엔드에서 GET 요청 시 음식점 정보API를 제공

2. 음식점 리스트 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 검색어(String)로 검색하면 요청에 대한 응답
- http://localhost:8080/restaurants/search/byFoodName?foodName=(음식명) 음식명으로 요청하는URL
- http://localhost:8080/restaurants/search/byAddress?address=(지역명) 지역명으로 요청하는URL
- Response body에 포함되는 데이터는 ID, 식당명, 간단한 식당 소개, 식당이미지
- RestaurantData 클래스에 대한민국 행정구역별로 15개의 정보리스트를 구현 후 제공
   
3. 음식점 세부 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 리스트를 누르고 라우팅 되는 페이지에 세부 정보를 응답
- http://localhost:8080/restaurants/details/{id}
- 지정 된 ID값으로 매핑하여 데이터를 응답
- Response body에 포함되는 데이터는 ID, 식당명, 식당 전화번호, 식당주소, 식당이미지

# 레시피(음식 정보) 제공 API
1. 프론트엔드에서 GET 요청 시 레시피 정보API를 제공

2. 레시피 리스트 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 음식명(String)으로 검색하면 요청에 대한 응답
- http://localhost:8080/recipes/search/byFoodName?foodName=(음식명) 음식명으로 요청하는URL
- Response body에 포함되는 데이터는 ID, 음식명, 음식이미지
- RecipeData 클래스에 음식정보와 레시피를 구현 후 제공

3. 레시피 세부 페이지에 정보를 제공하는 엔드포인트, 클라이언트가 리스트를 누르고 라우팅 되는 페이지에 세부 정보를 응답
- http://localhost:8080/recipes/details/{id}
- 지정 된 ID값으로 매핑하여 데이터를 응답
- Response body에 포함되는 데이터는 ID, 음식명, 칼로리, 레시피, 기본재료, 음식이미지, 추천수(likeCount)

# 레시피 세부 페이지 추천수 POST API
1. 프론트엔드에서 POST 요청 시 추천수 증가
- http://localhost:8080/recipes/{id}/like
- 레시피 세부페이지에서 추천수 증가 버튼을 클릭할 경우 POST 요청에 대해 DB의 ID값과 매핑하여 해당 객체에 대한 추천수(likeCount)를 1 증가

# 레시피 랭킹(TOP10) 제공 API
1. GET 요청에 대해 DB상에서 추천수(likeCount)가 높은 상위10개의 객체를 응답
- http://localhost:8080/recipes/ranking
- Response Body에는 ID, 음식명, 음식이미지가 포함

# H2(DB)
- EC2 서버상에 DB파일을 전송하고 H2를 임베디드 모드로 설정 후 이용중
- JDBC URL을 EC2 서버의 DB파일이 저장 된 경로로 지정해주고 접속

# 배포
- 현재 AWS EC2서버에 스프링 어플리케이션 배포 후 구동 완료
- 프론트와 통신 및 연동 완료, 데이터 정상적으로 전송 및 출력 확인

// 개선필요 사항
- 더 많은, 전국 음식점 정보를 받아오기 위해서 네이버, 카카오 api나 동적 웹 크롤링 프로그램을 이용하는 방법 등을 고려하여 개선중에 있음
   
// 개발환경
- 자바(17) 스프링부트(3.2.4ver), Maven(4.0.0ver)
- 추가 라이브러리 Swagger, Lombok(1.18.32ver), H2, JPA
- 배포 AWS EC2 
