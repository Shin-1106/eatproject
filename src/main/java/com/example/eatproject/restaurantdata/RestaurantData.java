//음식점 정보를 h2(DB)에 저장하는 클래스
package com.example.eatproject.restaurantdata;

import com.example.eatproject.entity.RestaurantEntity;
import com.example.eatproject.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestaurantData implements CommandLineRunner {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public void run(String... args) throws Exception {
        // 음식점 정보를 직접 저장
        RestaurantEntity restaurant1 = new RestaurantEntity();
        restaurant1.setFoodName("피자");
        restaurant1.setName("META PIZZA");
        restaurant1.setNumber("053-939-6767");
        restaurant1.setAddress("대구광역시 북구 대학로 103 지하1층");
        restaurantRepository.save(restaurant1);

        RestaurantEntity restaurant2 = new RestaurantEntity();
        restaurant2.setFoodName("치킨");
        restaurant2.setName("뉴욕통닭");
        restaurant2.setNumber("053-253-0070");
        restaurant2.setAddress("대구광역시 중구 종로 12");
        restaurantRepository.save(restaurant2);

        RestaurantEntity restaurant3 = new RestaurantEntity();
        restaurant3.setFoodName("치킨");
        restaurant3.setName("원주통닭");
        restaurant3.setNumber("053-424-5129");
        restaurant3.setAddress("대구광역시 중구 동성로6길 42-6");
        restaurantRepository.save(restaurant3);
        
        RestaurantEntity restaurant4 = new RestaurantEntity();
        restaurant4.setFoodName("한식");
        restaurant4.setName("장모님국밥");
        restaurant4.setNumber("053-425-9347");
        restaurant4.setAddress("대구광역시 중구 삼덕동2가 149-6");
        restaurantRepository.save(restaurant4);

        RestaurantEntity restaurant5 = new RestaurantEntity();
        restaurant5.setFoodName("한식");
        restaurant5.setName("춘천옥");
        restaurant5.setNumber("053-422-3333");
        restaurant5.setAddress("대구광역시 중구 동인동4가 4");
        restaurantRepository.save(restaurant5);

        RestaurantEntity restaurant6 = new RestaurantEntity();
        restaurant6.setFoodName("한식");
        restaurant6.setName("청해회수산");
        restaurant6.setNumber("053-422-6921");
        restaurant6.setAddress("대구광역시 중구 대봉동 17-10");
        restaurantRepository.save(restaurant6);

        RestaurantEntity restaurant7 = new RestaurantEntity();
        restaurant7.setFoodName("양식");
        restaurant7.setName("유랑");
        restaurant7.setNumber("123");
        restaurant7.setAddress("");
        restaurantRepository.save(restaurant7);

        RestaurantEntity restaurant8 = new RestaurantEntity();
        restaurant8.setFoodName("일식");
        restaurant8.setName("와리바시");
        restaurant8.setNumber("053-422-3888");
        restaurant8.setAddress("대구광역시 중구 동인동3가 220-3");
        restaurantRepository.save(restaurant8);

        RestaurantEntity restaurant9 = new RestaurantEntity();
        restaurant9.setFoodName("양식");
        restaurant9.setName("조밀");
        restaurant9.setNumber("070-8888-0505");
        restaurant9.setAddress("대구광역시 중구 봉산동 37-33");
        restaurantRepository.save(restaurant9);

        RestaurantEntity restaurant10 = new RestaurantEntity();
        restaurant10.setFoodName("양식");
        restaurant10.setName("로니스도우");
        restaurant10.setNumber("010-****-6176");
        restaurant10.setAddress("대구광역시 중구 공평동 1-5");
        restaurantRepository.save(restaurant10);

        RestaurantEntity restaurant11 = new RestaurantEntity();
        restaurant11.setFoodName("세계요리");
        restaurant11.setName("야자수지붕");
        restaurant11.setNumber("053-256-3723");
        restaurant11.setAddress("대구광역시 중구 동문동 4-9");
        restaurantRepository.save(restaurant11);

        RestaurantEntity restaurant12 = new RestaurantEntity();
        restaurant12.setFoodName("양식");
        restaurant12.setName("노세콘도(Nosecondo)");
        restaurant12.setNumber("010-****-6451");
        restaurant12.setAddress("대구광역시 중구 대안동 22");
        restaurantRepository.save(restaurant12);

        RestaurantEntity restaurant13 = new RestaurantEntity();
        restaurant13.setFoodName("카페디저트");
        restaurant13.setName("카페로건");
        restaurant13.setNumber("053-216-1674");
        restaurant13.setAddress("대구광역시 중구 동인동4가 176-1");
        restaurantRepository.save(restaurant13);

        RestaurantEntity restaurant14 = new RestaurantEntity();
        restaurant14.setFoodName("카페디저트");
        restaurant14.setName("리시트2");
        restaurant14.setNumber("010-****-5505");
        restaurant14.setAddress("대구광역시 중구 남성로 111");
        restaurantRepository.save(restaurant14);

        RestaurantEntity restaurant15 = new RestaurantEntity();
        restaurant15.setFoodName("한식");
        restaurant15.setName("대구광역시 중구 남산동 938-9");
        restaurant15.setNumber("053-568-9090");
        restaurant15.setAddress("대구광역시 중구 남산동 938-9");
        restaurantRepository.save(restaurant15);

        RestaurantEntity restaurant16 = new RestaurantEntity();
        restaurant16.setFoodName("디저트");
        restaurant16.setName("카이스샌드위치샵");
        restaurant16.setNumber("010-****-3774");
        restaurant16.setAddress("대구광역시 중구 봉산동 225-5");
        restaurantRepository.save(restaurant16);

        RestaurantEntity restaurant17 = new RestaurantEntity();
        restaurant17.setFoodName("햄버거");
        restaurant17.setName("오일리버거");
        restaurant17.setNumber("053-213-0512");
        restaurant17.setAddress("대구광역시 중구 공평동 1-1");
        restaurantRepository.save(restaurant17);

        RestaurantEntity restaurant18 = new RestaurantEntity();
        restaurant18.setFoodName("케이크");
        restaurant18.setName("팜테이블");
        restaurant18.setNumber("053- 256-7436");
        restaurant18.setAddress("대구광역시 중구 공평동 82-3");
        restaurantRepository.save(restaurant18);

        RestaurantEntity restaurant19 = new RestaurantEntity();
        restaurant19.setFoodName("한식");
        restaurant19.setName("동아식당");
        restaurant19.setNumber("010-****-1017");
        restaurant19.setAddress("대구광역시 중구 공평동 10-2");
        restaurantRepository.save(restaurant19);

        RestaurantEntity restaurant20 = new RestaurantEntity();
        restaurant20.setFoodName("한식");
        restaurant20.setName("동아식당");
        restaurant20.setNumber("010-****-1017");
        restaurant20.setAddress("대구광역시 중구 공평동 10-2");
        restaurantRepository.save(restaurant20);


        // 추가적인 음식점 정보 저장 가능
    }
}
