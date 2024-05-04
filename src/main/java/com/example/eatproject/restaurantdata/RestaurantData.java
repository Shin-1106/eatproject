//음식점 정보를 DB에 저장하는 클래스
// 현재는 단순히 초기 데이터를 저장하기 위해 CommandLineRunner를 사용하여 DB에 초기 데이터를 저장
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
        // 행정구역별로 15개의 리스트 정보 제공

        //대구-----------------------------------------------------------------------------------------------------------
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

        //서울-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant21 = new RestaurantEntity();
        restaurant21.setFoodName("양식");
        restaurant21.setName("스테이키스트");
        restaurant21.setNumber("010-9697-9242");
        restaurant21.setAddress("서울 마포구 성미산로29길 14 1층");
        restaurantRepository.save(restaurant21);

        RestaurantEntity restaurant22 = new RestaurantEntity();
        restaurant22.setFoodName("양식");
        restaurant22.setName("도깨비굴");
        restaurant22.setNumber("0507-1348-8090");
        restaurant22.setAddress("서울 영등포구 의사당대로 127 지하1층 C-001호");
        restaurantRepository.save(restaurant22);

        RestaurantEntity restaurant23 = new RestaurantEntity();
        restaurant23.setFoodName("한식");
        restaurant23.setName("명동교자 본점");
        restaurant23.setNumber("0507-1366-5348");
        restaurant23.setAddress("서울 중구 명동10길 29");
        restaurantRepository.save(restaurant23);

        RestaurantEntity restaurant24 = new RestaurantEntity();
        restaurant24.setFoodName("한식");
        restaurant24.setName("광화문미진");
        restaurant24.setNumber("02-730-6198");
        restaurant24.setAddress("서울 종로구 종로 19");
        restaurantRepository.save(restaurant24);

        RestaurantEntity restaurant25 = new RestaurantEntity();
        restaurant25.setFoodName("한식");
        restaurant25.setName("춘천옥");
        restaurant25.setNumber("053-422-3333");
        restaurant25.setAddress("대구광역시 중구 동인동4가 4");
        restaurantRepository.save(restaurant25);

        RestaurantEntity restaurant26 = new RestaurantEntity();
        restaurant26.setFoodName("한식");
        restaurant26.setName("우래옥");
        restaurant26.setNumber("02-2265-0151");
        restaurant26.setAddress("서울 중구 창경궁로 62-29");
        restaurantRepository.save(restaurant26);

        RestaurantEntity restaurant27 = new RestaurantEntity();
        restaurant27.setFoodName("양식");
        restaurant27.setName("익선취향");
        restaurant27.setNumber("0507-1365-2866");
        restaurant27.setAddress("서울 종로구 수표로28길 17-32 1층");
        restaurantRepository.save(restaurant27);

        RestaurantEntity restaurant28 = new RestaurantEntity();
        restaurant28.setFoodName("일식");
        restaurant28.setName("와리바시");
        restaurant28.setNumber("053-422-3888");
        restaurant28.setAddress("대구광역시 중구 동인동3가 220-3");
        restaurantRepository.save(restaurant28);

        RestaurantEntity restaurant29 = new RestaurantEntity();
        restaurant29.setFoodName("양식");
        restaurant29.setName("쌤쌤쌤");
        restaurant29.setNumber("0507-1309-1103");
        restaurant29.setAddress("서울 용산구 한강대로50길 25 1층");
        restaurantRepository.save(restaurant29);

        RestaurantEntity restaurant30 = new RestaurantEntity();
        restaurant30.setFoodName("양식");
        restaurant30.setName("로니스도우");
        restaurant30.setNumber("010-****-6176");
        restaurant30.setAddress("대구광역시 중구 공평동 1-5");
        restaurantRepository.save(restaurant30);

        RestaurantEntity restaurant31 = new RestaurantEntity();
        restaurant31.setFoodName("한식,감자탕");
        restaurant31.setName("소문난성수감자탕");
        restaurant31.setNumber("02-465-6580");
        restaurant31.setAddress("서울 성동구 연무장길 45");
        restaurantRepository.save(restaurant31);

        RestaurantEntity restaurant32 = new RestaurantEntity();
        restaurant32.setFoodName("양식");
        restaurant32.setName("이석덕생면파스타");
        restaurant32.setNumber("0507-1491-0905");
        restaurant32.setAddress("서울 서대문구 명물길 16 2층 이석덕생면파스타 신촌점");
        restaurantRepository.save(restaurant32);

        RestaurantEntity restaurant33 = new RestaurantEntity();
        restaurant33.setFoodName("카페디저트");
        restaurant33.setName("런던베이글뮤지엄 안국점");
        restaurant33.setNumber("00");
        restaurant33.setAddress("서울 종로구 북촌로4길 20");
        restaurantRepository.save(restaurant33);

        RestaurantEntity restaurant34 = new RestaurantEntity();
        restaurant34.setFoodName("한식,국수");
        restaurant34.setName("진주집");
        restaurant34.setNumber("02-780-6108");
        restaurant34.setAddress("서울 영등포구 국제금융로6길 33 지하 1층");
        restaurantRepository.save(restaurant34);

        RestaurantEntity restaurant35 = new RestaurantEntity();
        restaurant35.setFoodName("카페디저트");
        restaurant35.setName("아베베베이커리 서울");
        restaurant35.setNumber("0507-1381-7206");
        restaurant35.setAddress("서울 종로구 청계천로 201 1, 2, 3층");
        restaurantRepository.save(restaurant35);

        //경기-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant36 = new RestaurantEntity();
        restaurant36.setFoodName("한식");
        restaurant36.setName("해방");
        restaurant36.setNumber("010-9181-6874");
        restaurant36.setAddress("경기 수원시 팔달구 인계로124번길 36 105호");
        restaurantRepository.save(restaurant36);

        RestaurantEntity restaurant37 = new RestaurantEntity();
        restaurant37.setFoodName("일식");
        restaurant37.setName("쇼쿠지 동탄호수공원점");
        restaurant37.setNumber("0507-1363-2315");
        restaurant37.setAddress("경기 화성시 동탄순환대로3길 38 1층 쇼쿠지 동탄호수공원점");
        restaurantRepository.save(restaurant37);

        RestaurantEntity restaurant38 = new RestaurantEntity();
        restaurant38.setFoodName("한식,고기");
        restaurant38.setName("돼지의집 성남점");
        restaurant38.setNumber("031-747-5596");
        restaurant38.setAddress("경기 성남시 수정구 시민로142번길 11-1 1층");
        restaurantRepository.save(restaurant38);

        RestaurantEntity restaurant39 = new RestaurantEntity();
        restaurant39.setFoodName("한식");
        restaurant39.setName("광화문미진");
        restaurant39.setNumber("02-730-6198");
        restaurant39.setAddress("서울 종로구 종로 19");
        restaurantRepository.save(restaurant39);

        RestaurantEntity restaurant40 = new RestaurantEntity();
        restaurant40.setFoodName("한식");
        restaurant40.setName("목향원");
        restaurant40.setNumber("031-527-2255");
        restaurant40.setAddress("경기 남양주시 덕릉로1071번길 34-11");
        restaurantRepository.save(restaurant40);

        RestaurantEntity restaurant41 = new RestaurantEntity();
        restaurant41.setFoodName("한식");
        restaurant41.setName("가림시골밥상");
        restaurant41.setNumber("031-943-1022");
        restaurant41.setAddress("경기 파주시 탄현면 새오리로 68");
        restaurantRepository.save(restaurant41);

        RestaurantEntity restaurant42 = new RestaurantEntity();
        restaurant42.setFoodName("한식");
        restaurant42.setName("목향원");
        restaurant42.setNumber("031-527-2255");
        restaurant42.setAddress("경기 남양주시 덕릉로1071번길 34-11");
        restaurantRepository.save(restaurant42);

        RestaurantEntity restaurant43 = new RestaurantEntity();
        restaurant43.setFoodName("양식,파스타");
        restaurant43.setName("에그궁");
        restaurant43.setNumber("0507-1494-8607");
        restaurant43.setAddress("경기 수원시 팔달구 화서문로17번길 6-4 1층 에그궁");
        restaurantRepository.save(restaurant43);

        RestaurantEntity restaurant44 = new RestaurantEntity();
        restaurant44.setFoodName("고기");
        restaurant44.setName("산에들에");
        restaurant44.setNumber("031-943-8592");
        restaurant44.setAddress("경기 파주시 탄현면 성동로 19-63 산에들에");
        restaurantRepository.save(restaurant44);

        RestaurantEntity restaurant45 = new RestaurantEntity();
        restaurant45.setFoodName("카페디저트");
        restaurant45.setName("카페 대너리스");
        restaurant45.setNumber("031-521-9700");
        restaurant45.setAddress("경기 남양주시 조안면 북한강로 914");
        restaurantRepository.save(restaurant45);

        RestaurantEntity restaurant46 = new RestaurantEntity();
        restaurant46.setFoodName("고기");
        restaurant46.setName("아르페지오");
        restaurant46.setNumber("0507-1316-5852");
        restaurant46.setAddress("경기 남양주시 와부읍 수레로661번길 142");
        restaurantRepository.save(restaurant46);

        RestaurantEntity restaurant47 = new RestaurantEntity();
        restaurant47.setFoodName("한식");
        restaurant47.setName("도도한밥상");
        restaurant47.setNumber("0507-1309-5513");
        restaurant47.setAddress("경기 용인시 처인구 지삼로 513 1층");
        restaurantRepository.save(restaurant47);

        RestaurantEntity restaurant48 = new RestaurantEntity();
        restaurant48.setFoodName("양식");
        restaurant48.setName("테이스팅뮤지엄 행궁동");
        restaurant48.setNumber("0507-1494-3000");
        restaurant48.setAddress("경기 수원시 팔달구 화서문로71번길 2-6 1층 단독 테이스팅뮤지엄");
        restaurantRepository.save(restaurant48);

        RestaurantEntity restaurant49 = new RestaurantEntity();
        restaurant49.setFoodName("한식,국밥");
        restaurant49.setName("유치회관");
        restaurant49.setNumber("031-234-6275");
        restaurant49.setAddress("경기 수원시 팔달구 효원로292번길 67");
        restaurantRepository.save(restaurant49);

        RestaurantEntity restaurant50 = new RestaurantEntity();
        restaurant50.setFoodName("카페디저트");
        restaurant50.setName("포레스트아웃팅스");
        restaurant50.setNumber("0507-1481-0500");
        restaurant50.setAddress("경기 고양시 일산동구 고양대로 1124 포레스트 아웃팅스");
        restaurantRepository.save(restaurant50);

        //강원-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant51 = new RestaurantEntity();
        restaurant51.setFoodName("한식");
        restaurant51.setName("뜰");
        restaurant51.setNumber("0507-1407-3408");
        restaurant51.setAddress("강원 철원군 갈말읍 동온동길 185 1층 1호");
        restaurantRepository.save(restaurant51);

        RestaurantEntity restaurant52 = new RestaurantEntity();
        restaurant52.setFoodName("한식,국수");
        restaurant52.setName("삼교리동치미막국수 강릉본점");
        restaurant52.setNumber("0507-1406-8830");
        restaurant52.setAddress("강원 강릉시 구정면 범일로 364");
        restaurantRepository.save(restaurant52);

        RestaurantEntity restaurant53 = new RestaurantEntity();
        restaurant53.setFoodName("고기");
        restaurant53.setName("택지골수제생갈비 강릉본점");
        restaurant53.setNumber("0507-1312-7832");
        restaurant53.setAddress("강원 강릉시 하슬라로232번길 1 택지골수제생갈비");
        restaurantRepository.save(restaurant53);

        RestaurantEntity restaurant54 = new RestaurantEntity();
        restaurant54.setFoodName("해물");
        restaurant54.setName("봉포머구리집");
        restaurant54.setNumber("0507-1404-2026");
        restaurant54.setAddress("강원 속초시 영랑해안길 223 봉포머구리집");
        restaurantRepository.save(restaurant54);

        RestaurantEntity restaurant55 = new RestaurantEntity();
        restaurant55.setFoodName("한식,두부");
        restaurant55.setName("강릉짬뽕순두부 동화가든 본점");
        restaurant55.setNumber("0507-1432-9885");
        restaurant55.setAddress("강원 강릉시 초당순두부길77번길 15 동화가든");
        restaurantRepository.save(restaurant55);

        RestaurantEntity restaurant56 = new RestaurantEntity();
        restaurant56.setFoodName("고기,닭갈비");
        restaurant56.setName("춘천통나무집닭갈비");
        restaurant56.setNumber("033-241-5999");
        restaurant56.setAddress("강원 춘천시 신북읍 신샘밭로 763");
        restaurantRepository.save(restaurant56);

        RestaurantEntity restaurant57 = new RestaurantEntity();
        restaurant57.setFoodName("카페디저트");
        restaurant57.setName("카페 툇마루");
        restaurant57.setNumber("0507-1349-7175");
        restaurant57.setAddress("강원 강릉시 난설헌로 232 카페 툇마루");
        restaurantRepository.save(restaurant57);

        RestaurantEntity restaurant58 = new RestaurantEntity();
        restaurant58.setFoodName("회,해물");
        restaurant58.setName("청초수물회 속초본점");
        restaurant58.setNumber("0507-1425-5051");
        restaurant58.setAddress("강원 속초시 엑스포로 12-36 청초수물회 속초본점");
        restaurantRepository.save(restaurant58);

        RestaurantEntity restaurant59 = new RestaurantEntity();
        restaurant59.setFoodName("회,해물");
        restaurant59.setName("경포대 울진대게횟집");
        restaurant59.setNumber("0507-1368-1614");
        restaurant59.setAddress("강원 강릉시 창해로 491");
        restaurantRepository.save(restaurant59);

        RestaurantEntity restaurant60 = new RestaurantEntity();
        restaurant60.setFoodName("회,해물");
        restaurant60.setName("해연가");
        restaurant60.setNumber("0507-1335-0549");
        restaurant60.setAddress("강원 강릉시 해안로 280 1호상가");
        restaurantRepository.save(restaurant60);

        RestaurantEntity restaurant61 = new RestaurantEntity();
        restaurant61.setFoodName("고기,닭갈비");
        restaurant61.setName("참나무숯불닭갈비 막국수");
        restaurant61.setNumber("0507-1332-0388");
        restaurant61.setAddress("강원 춘천시 신북읍 신샘밭로 715");
        restaurantRepository.save(restaurant61);

        RestaurantEntity restaurant62 = new RestaurantEntity();
        restaurant62.setFoodName("카페디저트");
        restaurant62.setName("만동제과");
        restaurant62.setNumber("0507-1317-6387");
        restaurant62.setAddress("강원 강릉시 금성로 6 1층 만동제과");
        restaurantRepository.save(restaurant62);

        RestaurantEntity restaurant63 = new RestaurantEntity();
        restaurant63.setFoodName("한식");
        restaurant63.setName("낙산물곰탕");
        restaurant63.setNumber("010-8797-9749");
        restaurant63.setAddress("강원 양양군 강현면 낙산사로 35");
        restaurantRepository.save(restaurant63);

        RestaurantEntity restaurant64 = new RestaurantEntity();
        restaurant64.setFoodName("해물,생선");
        restaurant64.setName("수빈이네찜");
        restaurant64.setNumber("0507-1334-5180");
        restaurant64.setAddress("강원 속초시 동해대로3930번길 6 1층 수빈이네찜 속초본점");
        restaurantRepository.save(restaurant64);

        RestaurantEntity restaurant65 = new RestaurantEntity();
        restaurant65.setFoodName("국수");
        restaurant65.setName("방림메밀막국수");
        restaurant65.setNumber("033-335-1150");
        restaurant65.setAddress("강원 평창군 대관령면 눈마을길 13");
        restaurantRepository.save(restaurant65);

        //충남-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant66 = new RestaurantEntity();
        restaurant66.setFoodName("한식");
        restaurant66.setName("오봉집 서산점");
        restaurant66.setNumber("0507-1397-8593");
        restaurant66.setAddress("충남 서산시 호수공원5로 7 1층");
        restaurantRepository.save(restaurant66);

        RestaurantEntity restaurant67 = new RestaurantEntity();
        restaurant67.setFoodName("카페디저트");
        restaurant67.setName("beanscloud");
        restaurant67.setNumber("0507-1367-6679");
        restaurant67.setAddress("충남 아산시 배방읍 배방로14번길 77-10 온하우스 1층 beanscloud");
        restaurantRepository.save(restaurant67);

        RestaurantEntity restaurant68 = new RestaurantEntity();
        restaurant68.setFoodName("고기");
        restaurant68.setName("신사우물갈비 불당본점");
        restaurant68.setNumber("041-567-5958");
        restaurant68.setAddress("충남 천안시 서북구 불당25로 182 에이블타워2 1층");
        restaurantRepository.save(restaurant68);

        RestaurantEntity restaurant69 = new RestaurantEntity();
        restaurant69.setFoodName("한식,국밥");
        restaurant69.setName("국본가 보령점");
        restaurant69.setNumber("0507-1449-0031");
        restaurant69.setAddress("충남 보령시 대해로 882");
        restaurantRepository.save(restaurant69);

        RestaurantEntity restaurant70 = new RestaurantEntity();
        restaurant70.setFoodName("해물,게");
        restaurant70.setName("안면도맛집 꽃지꽃게집");
        restaurant70.setNumber("0507-1382-1105");
        restaurant70.setAddress("충남 태안군 안면읍 안면대로 3020");
        restaurantRepository.save(restaurant70);

        RestaurantEntity restaurant71 = new RestaurantEntity();
        restaurant71.setFoodName("국수");
        restaurant71.setName("장원막국수");
        restaurant71.setNumber("041-835-6561");
        restaurant71.setAddress("충남 부여군 부여읍 나루터로62번길 20");
        restaurantRepository.save(restaurant71);

        RestaurantEntity restaurant72 = new RestaurantEntity();
        restaurant72.setFoodName("카페디저트");
        restaurant72.setName("뚜쥬루 빵돌가마마을");
        restaurant72.setNumber("041-578-0036");
        restaurant72.setAddress("충남 천안시 동남구 풍세로 706");
        restaurantRepository.save(restaurant72);

        RestaurantEntity restaurant73 = new RestaurantEntity();
        restaurant73.setFoodName("샤브샤브,고기");
        restaurant73.setName("고메샤브 당진본점");
        restaurant73.setNumber("041-357-3080");
        restaurant73.setAddress("충남 당진시 시청1로 33");
        restaurantRepository.save(restaurant73);

        RestaurantEntity restaurant74 = new RestaurantEntity();
        restaurant74.setFoodName("국수");
        restaurant74.setName("대림국수 천안불당점");
        restaurant74.setNumber("0507-1443-4555");
        restaurant74.setAddress("충남 천안시 서북구 불당25로 146 리치타워 1층 102호, 103호");
        restaurantRepository.save(restaurant74);

        RestaurantEntity restaurant75 = new RestaurantEntity();
        restaurant75.setFoodName("고기");
        restaurant75.setName("남영동양문 천안점");
        restaurant75.setNumber("041-415-0046");
        restaurant75.setAddress("충남 천안시 서북구 불당33길 45 1층 104호, 105호");
        restaurantRepository.save(restaurant75);

        RestaurantEntity restaurant76 = new RestaurantEntity();
        restaurant76.setFoodName("곱창,막창");
        restaurant76.setName("사위식당 불당점");
        restaurant76.setNumber("0507-1469-3930");
        restaurant76.setAddress("충남 천안시 서북구 불당26로 50 지웰시티푸르지오 상가 G동103,104");
        restaurantRepository.save(restaurant76);

        RestaurantEntity restaurant77 = new RestaurantEntity();
        restaurant77.setFoodName("카페디저트");
        restaurant77.setName("애월담");
        restaurant77.setNumber("0507-1333-1743");
        restaurant77.setAddress("충남 금산군 진산면 실학로 529 애월담");
        restaurantRepository.save(restaurant77);

        RestaurantEntity restaurant78 = new RestaurantEntity();
        restaurant78.setFoodName("한식");
        restaurant78.setName("전라도밥상 밥도둑");
        restaurant78.setNumber("041-673-1151");
        restaurant78.setAddress("충남 태안군 안면읍 해안관광로 954");
        restaurantRepository.save(restaurant78);

        RestaurantEntity restaurant79 = new RestaurantEntity();
        restaurant79.setFoodName("국수,만두");
        restaurant79.setName("공주쌍신집칼국수");
        restaurant79.setNumber("0507-1374-5459");
        restaurant79.setAddress("충남 공주시 쌍신길 109-2 공주쌍신집칼국수");
        restaurantRepository.save(restaurant79);

        RestaurantEntity restaurant80 = new RestaurantEntity();
        restaurant80.setFoodName("한식,찌개");
        restaurant80.setName("의정부부대찌개");
        restaurant80.setNumber("0507-1477-2219");
        restaurant80.setAddress("충남 공주시 국고개길 6-1 1층");
        restaurantRepository.save(restaurant80);

    }
}
