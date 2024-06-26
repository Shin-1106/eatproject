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
        restaurant1.setInfo("맛있는 음식점입니다");
        restaurant1.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20160112_232%2F1452576336467GGpWU_PNG%2F176057566369881_0.png");
        restaurantRepository.save(restaurant1);

        RestaurantEntity restaurant2 = new RestaurantEntity();
        restaurant2.setFoodName("치킨");
        restaurant2.setName("뉴욕통닭");
        restaurant2.setNumber("053-253-0070");
        restaurant2.setAddress("대구광역시 중구 종로 12");
        restaurant2.setInfo("맛있는 음식점입니다");
        restaurant2.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200109_244%2F1578567428491vBFlr_JPEG%2Fb8UeYj8HEF_sZ5a0IXO_cd4O.jpeg.jpg");
        restaurantRepository.save(restaurant2);

        RestaurantEntity restaurant3 = new RestaurantEntity();
        restaurant3.setFoodName("치킨");
        restaurant3.setName("원주통닭");
        restaurant3.setNumber("053-424-5129");
        restaurant3.setAddress("대구광역시 중구 동성로6길 42-6");
        restaurant3.setInfo("맛있는 음식점입니다");
        restaurant3.setImage("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20160421_235%2Fdory051234_1461202648977o5Fry_JPEG%2F%25BF%25F8%25C1%25D6%25C5%25EB%25B4%25DF.jpg&type=sc960_832");
        restaurantRepository.save(restaurant3);

        RestaurantEntity restaurant4 = new RestaurantEntity();
        restaurant4.setFoodName("한식");
        restaurant4.setName("장모님국밥");
        restaurant4.setNumber("053-425-9347");
        restaurant4.setAddress("대구광역시 중구 삼덕동2가 149-6");
        restaurant4.setInfo("맛있는 음식점입니다");
        restaurant4.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200215_98%2F1581741397969EYvpK_JPEG%2F17kfPAYjNQYE4IBo7qiM4HY7.jpg");
        restaurantRepository.save(restaurant4);

        RestaurantEntity restaurant5 = new RestaurantEntity();
        restaurant5.setFoodName("한식");
        restaurant5.setName("춘천옥");
        restaurant5.setNumber("053-422-3333");
        restaurant5.setAddress("대구광역시 중구 동인동4가 4");
        restaurant5.setInfo("맛있는 음식점입니다");
        restaurant5.setImage("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA4MDRfNzMg%2FMDAxNjkxMTM1MjEyNDEx.1oFb5KsiXTvEXbfCO1AceM7b7hRZQMxSxeK7Y_fQUfYg.JW69gNqh7XSjiURpUCHPFltTqkx3qjJ7-a2Z_NGg-Hwg.JPEG.cyberokuk%2F%25C3%25E1%25C3%25B5%25BF%25C106.jpg");
        restaurantRepository.save(restaurant5);

        RestaurantEntity restaurant6 = new RestaurantEntity();
        restaurant6.setFoodName("한식");
        restaurant6.setName("청해회수산");
        restaurant6.setNumber("053-422-6921");
        restaurant6.setAddress("대구광역시 중구 대봉동 17-10");
        restaurant6.setInfo("맛있는 음식점입니다");
        restaurant6.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAzMTBfNjQg%2FMDAxNzEwMDcxMzQ0MzM5.qM5BL-W6Zl4mGVHydCSoHt-Iqgh03YrUicTm2gmRY8og.Iu1sXt0VXRV3bCDyIbi5anLp718gWAT-DrjiVk1V7Jwg.JPEG%2F1709556759814.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant6);

        RestaurantEntity restaurant7 = new RestaurantEntity();
        restaurant7.setFoodName("양식");
        restaurant7.setName("유랑");
        restaurant7.setNumber("0507-1347-0660");
        restaurant7.setAddress("대구광역시 삼덕동3가 284");
        restaurant7.setInfo("맛있는 음식점입니다");
        restaurant7.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240522_285%2F17163433134017DxIj_JPEG%2FBCF0E2C1-DD4E-4484-BDB2-7594ADA2D1D7.jpeg");
        restaurantRepository.save(restaurant7);

        RestaurantEntity restaurant8 = new RestaurantEntity();
        restaurant8.setFoodName("일식");
        restaurant8.setName("와리바시");
        restaurant8.setNumber("053-422-3888");
        restaurant8.setAddress("대구광역시 중구 동인동3가 220-3");
        restaurant8.setInfo("맛있는 음식점입니다");
        restaurant8.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231218_204%2F1702890912338s2XbL_JPEG%2F%25BF%25C0%25B5%25AD%25C5%25C1.jpg");
        restaurantRepository.save(restaurant8);

        RestaurantEntity restaurant9 = new RestaurantEntity();
        restaurant9.setFoodName("양식");
        restaurant9.setName("조밀");
        restaurant9.setNumber("070-8888-0505");
        restaurant9.setAddress("대구광역시 중구 봉산동 37-33");
        restaurant9.setInfo("맛있는 음식점입니다");
        restaurant9.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190426_98%2F1556242292144nohFf_JPEG%2FD4nnJ5z_yMJSx8HYB8AvphPw.jpg");
        restaurantRepository.save(restaurant9);

        RestaurantEntity restaurant10 = new RestaurantEntity();
        restaurant10.setFoodName("양식");
        restaurant10.setName("로니스도우");
        restaurant10.setNumber("010-6831-6176");
        restaurant10.setAddress("대구광역시 중구 공평동 1-5");
        restaurant10.setInfo("맛있는 음식점입니다");
        restaurant10.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211007_29%2F1633536372294wMC3C_JPEG%2FsseoBB8Iufg98hHnD_6kGbA-.jpg");
        restaurantRepository.save(restaurant10);

        RestaurantEntity restaurant11 = new RestaurantEntity();
        restaurant11.setFoodName("세계요리");
        restaurant11.setName("야자수지붕");
        restaurant11.setNumber("053-256-3723");
        restaurant11.setAddress("대구광역시 중구 동문동 4-9");
        restaurant11.setInfo("맛있는 음식점입니다");
        restaurant11.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231011_24%2F1697006264287nMLiX_JPEG%2FKakaoTalk_20231011_152554410.jpg");
        restaurantRepository.save(restaurant11);

        RestaurantEntity restaurant12 = new RestaurantEntity();
        restaurant12.setFoodName("양식");
        restaurant12.setName("노세콘도(Nosecondo)");
        restaurant12.setNumber("010-****-6451");
        restaurant12.setAddress("대구광역시 중구 대안동 22");
        restaurant12.setInfo("맛있는 음식점입니다");
        restaurant12.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240126_172%2F1706252804645FNItq_JPEG%2F%25BA%25FC%25B9%25D9.jpg");
        restaurantRepository.save(restaurant12);

        RestaurantEntity restaurant13 = new RestaurantEntity();
        restaurant13.setFoodName("카페디저트");
        restaurant13.setName("카페로건");
        restaurant13.setNumber("053-216-1674");
        restaurant13.setAddress("대구광역시 중구 동인동4가 176-1");
        restaurant13.setInfo("맛있는 음식점입니다");
        restaurant13.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA0MzBfNDcg%2FMDAxNzE0NDYwODQxMTU3.rSVoW2Oek4YL5MnRBfUnqVTtBlURJpK_sPo1I_Zi85sg.p-sgehzd4zg5eSu_BxSYrPtSxIp6HcIQ6CZRCYYnPLAg.JPEG%2F20240426_085140.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant13);

        RestaurantEntity restaurant14 = new RestaurantEntity();
        restaurant14.setFoodName("카페디저트");
        restaurant14.setName("리시트");
        restaurant14.setNumber("010-****-5505");
        restaurant14.setAddress("대구광역시 중구 남성로 111");
        restaurant14.setInfo("맛있는 음식점입니다");
        restaurant14.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240220_128%2F1708397367803qWTDt_JPEG%2FKakaoTalk_Photo_2021-08-24-18-17-33-30.jpeg");
        restaurantRepository.save(restaurant14);

        RestaurantEntity restaurant15 = new RestaurantEntity();
        restaurant15.setFoodName("한식");
        restaurant15.setName("남산면");
        restaurant15.setNumber("053-568-9090");
        restaurant15.setAddress("대구광역시 중구 남산동 938-9");
        restaurant15.setInfo("맛있는 음식점입니다");
        restaurant15.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAyMDFfMTQ2%2FMDAxNzA2NzU5NjA4Nzcx.qRCwbnkRvHWSyMjgm0iHvKUvqJtc3OuZcnG2vnxukPgg.yv_GMuWfWwp1tNOUrnb16Akg8UQaNEQNUs4pn_oDe_0g.JPEG%2F20240130_172335.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant15);

        RestaurantEntity restaurant16 = new RestaurantEntity();
        restaurant16.setFoodName("디저트");
        restaurant16.setName("카이스샌드위치샵");
        restaurant16.setNumber("010-****-3774");
        restaurant16.setAddress("대구광역시 중구 봉산동 225-5");
        restaurant16.setInfo("맛있는 음식점입니다");
        restaurant16.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240310_201%2F1710070460952kdozk_JPEG%2FEA4C694F-B7DE-4898-BD70-DD750AD1F7B0.jpeg");
        restaurantRepository.save(restaurant16);

        RestaurantEntity restaurant17 = new RestaurantEntity();
        restaurant17.setFoodName("햄버거");
        restaurant17.setName("오일리버거");
        restaurant17.setNumber("053-213-0512");
        restaurant17.setAddress("대구광역시 중구 공평동 1-1");
        restaurant17.setInfo("맛있는 음식점입니다");
        restaurant17.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20230425_217%2F1682403491910T8e3C_JPEG%2F%25BF%25C3%25B9%25F6%25B0%25C5_%25BA%25B9%25BB%25E7.jpg");
        restaurantRepository.save(restaurant17);

        RestaurantEntity restaurant18 = new RestaurantEntity();
        restaurant18.setFoodName("케이크");
        restaurant18.setName("팜테이블");
        restaurant18.setNumber("053- 256-7436");
        restaurant18.setAddress("대구광역시 중구 공평동 82-3");
        restaurant18.setInfo("맛있는 음식점입니다");
        restaurant18.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190429_10%2F1556518674129591gf_JPEG%2FdpNKUgmj7GlGRs3NBleZQHzP.jpeg.jpg");
        restaurantRepository.save(restaurant18);

        RestaurantEntity restaurant19 = new RestaurantEntity();
        restaurant19.setFoodName("한식");
        restaurant19.setName("동아식당");
        restaurant19.setNumber("010-1244-1017");
        restaurant19.setAddress("대구광역시 중구 공평동 10-2");
        restaurant19.setInfo("맛있는 음식점입니다");
        restaurant19.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230917_273%2F1694920542338xJueE_PNG%2F%25BD%25BA%25C5%25A9%25B8%25B0%25BC%25A6_2023-09-17_%25BF%25C0%25C8%25C4_12.13.39.png");
        restaurantRepository.save(restaurant19);

        RestaurantEntity restaurant20 = new RestaurantEntity();
        restaurant20.setFoodName("한식,고기,육류");
        restaurant20.setName("육심돈");
        restaurant20.setNumber("0507-1359-2670");
        restaurant20.setAddress("대구광역시 남구 중앙대로32길 12 육심돈");
        restaurant20.setInfo("맛있는 음식점입니다");
        restaurant20.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240312_190%2F17101951290184ul86_JPEG%2F13D7FB4E-973F-4713-BCD7-E0F240F1F3DA.jpeg");
        restaurantRepository.save(restaurant20);

        //서울-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant21 = new RestaurantEntity();
        restaurant21.setFoodName("양식");
        restaurant21.setName("스테이키스트");
        restaurant21.setNumber("010-9697-9242");
        restaurant21.setAddress("서울 마포구 성미산로29길 14 1층");
        restaurant21.setInfo("맛있는 음식점입니다");
        restaurant21.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230706_93%2F1688601939672et3Ex_JPEG%2FScreenshot_20230612_210102_CatchTable.jpg");
        restaurantRepository.save(restaurant21);

        RestaurantEntity restaurant22 = new RestaurantEntity();
        restaurant22.setFoodName("양식");
        restaurant22.setName("도깨비굴");
        restaurant22.setNumber("0507-1348-8090");
        restaurant22.setAddress("서울 영등포구 의사당대로 127 지하1층 C-001호");
        restaurant22.setInfo("맛있는 음식점입니다");
        restaurant22.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240508_123%2F1715147085418u8DWd_JPEG%2FKakaoTalk_20240508_131040338.jpg");
        restaurantRepository.save(restaurant22);

        RestaurantEntity restaurant23 = new RestaurantEntity();
        restaurant23.setFoodName("한식");
        restaurant23.setName("명동교자 본점");
        restaurant23.setNumber("0507-1366-5348");
        restaurant23.setAddress("서울 중구 명동10길 29");
        restaurant23.setInfo("맛있는 음식점입니다");
        restaurant23.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20181013_227%2F1539396528420UECHH_JPEG%2FhW6fzasUvHvuw87tK52i5wGP.jpg");
        restaurantRepository.save(restaurant23);

        RestaurantEntity restaurant24 = new RestaurantEntity();
        restaurant24.setFoodName("한식");
        restaurant24.setName("광화문미진");
        restaurant24.setNumber("02-730-6198");
        restaurant24.setAddress("서울 종로구 종로 19");
        restaurant24.setInfo("맛있는 음식점입니다");
        restaurant24.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20151104_73%2F14466228923573jxU4_JPEG%2F167054567150405_2.jpg");
        restaurantRepository.save(restaurant24);

        RestaurantEntity restaurant25 = new RestaurantEntity();
        restaurant25.setFoodName("한식");
        restaurant25.setName("춘천옥");
        restaurant25.setNumber("053-422-3333");
        restaurant25.setAddress("대구광역시 중구 동인동4가 4");
        restaurant25.setInfo("맛있는 음식점입니다");
        restaurant25.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210907_250%2F16309798548214lEmM_JPEG%2F3lgPRXuyh1TwjtMIqGelqtLc.jfif.jpg");
        restaurantRepository.save(restaurant25);

        RestaurantEntity restaurant26 = new RestaurantEntity();
        restaurant26.setFoodName("한식");
        restaurant26.setName("우래옥");
        restaurant26.setNumber("02-2265-0151");
        restaurant26.setAddress("서울 중구 창경궁로 62-29");
        restaurant26.setInfo("맛있는 음식점입니다");
        restaurant26.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMTQ3%2FMDAxNzE3ODI4MTE2NTU4.IB0Z7F6FWDANoU6DX-gdTpk5NgGJ-yoG5-J_GYwslKcg.FhftT6DoYuFhA6HPctESGFTjVchFevUG58hZGMMVvYkg.JPEG%2F20240608_090944.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant26);

        RestaurantEntity restaurant27 = new RestaurantEntity();
        restaurant27.setFoodName("양식");
        restaurant27.setName("익선취향");
        restaurant27.setNumber("0507-1365-2866");
        restaurant27.setAddress("서울 종로구 수표로28길 17-32 1층");
        restaurant27.setInfo("맛있는 음식점입니다");
        restaurant27.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211228_157%2F1640697999237gLg6p_JPEG%2F20211129_113353.jpg");
        restaurantRepository.save(restaurant27);

        RestaurantEntity restaurant28 = new RestaurantEntity();
        restaurant28.setFoodName("한식,고기,육류");
        restaurant28.setName("도산뚝배기");
        restaurant28.setNumber("0507-1358-0950");
        restaurant28.setAddress("서울 강남구 도산대로54길 18 1층");
        restaurant28.setInfo("맛있는 음식점입니다");
        restaurant28.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220209_35%2F1644372215885tnEfY_JPEG%2FKakaoTalk_20220209_104023784_06.jpg");
        restaurantRepository.save(restaurant28);

        RestaurantEntity restaurant29 = new RestaurantEntity();
        restaurant29.setFoodName("양식");
        restaurant29.setName("쌤쌤쌤");
        restaurant29.setNumber("0507-1309-1103");
        restaurant29.setAddress("서울 용산구 한강대로50길 25 1층");
        restaurant29.setInfo("맛있는 음식점입니다");
        restaurant29.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211129_199%2F1638168131509jKtwa_JPEG%2F01E7A023-0BC2-41B5-8870-A7CF642C1E03.jpeg");
        restaurantRepository.save(restaurant29);

        RestaurantEntity restaurant30 = new RestaurantEntity();
        restaurant30.setFoodName("일식,돈가스");
        restaurant30.setName("고베규카츠 서울 강남점");
        restaurant30.setNumber("0507-1443-4620");
        restaurant30.setAddress("서울 강남구 강남대로102길 29 예촌빌딩");
        restaurant30.setInfo("맛있는 음식점입니다");
        restaurant30.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230329_68%2F1680084687137vl5A5_JPEG%2FKakaoTalk_20230329_174932601_02.jpg");
        restaurantRepository.save(restaurant30);

        RestaurantEntity restaurant31 = new RestaurantEntity();
        restaurant31.setFoodName("한식,감자탕");
        restaurant31.setName("소문난성수감자탕");
        restaurant31.setNumber("02-465-6580");
        restaurant31.setAddress("서울 성동구 연무장길 45");
        restaurant31.setInfo("맛있는 음식점입니다");
        restaurant31.setImage("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA2MDdfMTI0%2FMDAxNzE3NzYwMzEwOTIz.FXYTBieqkbd7Gzq0VFEe6e8TwZCNDArzqmV3abF1MNog.bqcS9RWbqoZkei3i8KvK7DTHV70TerrCE8_GEWQ2DNEg.JPEG%2FKakaoTalk_20240607_202646922_01.jpg");
        restaurantRepository.save(restaurant31);

        RestaurantEntity restaurant32 = new RestaurantEntity();
        restaurant32.setFoodName("양식");
        restaurant32.setName("이석덕생면파스타");
        restaurant32.setNumber("0507-1491-0905");
        restaurant32.setAddress("서울 서대문구 명물길 16 2층 이석덕생면파스타 신촌점");
        restaurant32.setInfo("맛있는 음식점입니다");
        restaurant32.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDJfMTMw%2FMDAxNzE3MzIxNTU4MzU3.qQ0VPtN9D_k4eK0fXH9NOsqAyNppBujVD_DHpmW86KYg.8YDOTBlMsTmZLOM97buo5QbxxOt1IjgcKSlJDpKJbh0g.JPEG%2FA8ADB90B-B833-4321-A099-BC7EB134B3AB.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant32);

        RestaurantEntity restaurant33 = new RestaurantEntity();
        restaurant33.setFoodName("카페디저트");
        restaurant33.setName("런던베이글뮤지엄 안국점");
        restaurant33.setNumber("00");
        restaurant33.setAddress("서울 종로구 북촌로4길 20");
        restaurant33.setInfo("맛있는 음식점입니다");
        restaurant33.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220704_18%2F1656921852880AkpTP_JPEG%2F0E7A7634.jpg");
        restaurantRepository.save(restaurant33);

        RestaurantEntity restaurant34 = new RestaurantEntity();
        restaurant34.setFoodName("한식,국수");
        restaurant34.setName("진주집");
        restaurant34.setNumber("02-780-6108");
        restaurant34.setAddress("서울 영등포구 국제금융로6길 33 지하 1층");
        restaurant34.setInfo("맛있는 음식점입니다");
        restaurant34.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20150817_105%2F1439805626093qwrM1_JPEG%2F166767593044276_0.jpg");
        restaurantRepository.save(restaurant34);

        RestaurantEntity restaurant35 = new RestaurantEntity();
        restaurant35.setFoodName("카페디저트");
        restaurant35.setName("아베베베이커리 서울");
        restaurant35.setNumber("0507-1381-7206");
        restaurant35.setAddress("서울 종로구 청계천로 201 1, 2, 3층");
        restaurant35.setInfo("맛있는 음식점입니다");
        restaurant35.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230609_125%2F1686270000125shD76_JPEG%2FKakaoTalk_20230608_112858657_01.jpg");
        restaurantRepository.save(restaurant35);

        //경기-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant36 = new RestaurantEntity();
        restaurant36.setFoodName("한식");
        restaurant36.setName("해방");
        restaurant36.setNumber("010-9181-6874");
        restaurant36.setAddress("경기 수원시 팔달구 인계로124번길 36 105호");
        restaurant36.setInfo("맛있는 음식점입니다");
        restaurant36.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240429_122%2F1714386547714MNtU7_JPEG%2FKakaoTalk_20240429_192828658.jpg");
        restaurantRepository.save(restaurant36);

        RestaurantEntity restaurant37 = new RestaurantEntity();
        restaurant37.setFoodName("일식");
        restaurant37.setName("쇼쿠지 동탄호수공원점");
        restaurant37.setNumber("0507-1363-2315");
        restaurant37.setAddress("경기 화성시 동탄순환대로3길 38 1층 쇼쿠지 동탄호수공원점");
        restaurant37.setInfo("맛있는 음식점입니다");
        restaurant37.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231020_29%2F1697779838843Kc93V_PNG%2F1.png");
        restaurantRepository.save(restaurant37);

        RestaurantEntity restaurant38 = new RestaurantEntity();
        restaurant38.setFoodName("한식,고기");
        restaurant38.setName("돼지의집 성남점");
        restaurant38.setNumber("031-747-5596");
        restaurant38.setAddress("경기 성남시 수정구 시민로142번길 11-1 1층");
        restaurant38.setInfo("맛있는 음식점입니다");
        restaurant38.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231202_142%2F1701485640456KOHuG_JPEG%2FKakaoTalk_20231130_122551804.jpg");
        restaurantRepository.save(restaurant38);

        RestaurantEntity restaurant39 = new RestaurantEntity();
        restaurant39.setFoodName("양식,파스타");
        restaurant39.setName("에그궁 행궁동본점");
        restaurant39.setNumber("0507-1494-8607");
        restaurant39.setAddress("경기 수원시 팔달구 화서문로17번길 6-4 1층 에그궁");
        restaurant39.setInfo("맛있는 음식점입니다");
        restaurant39.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240412_47%2F1712884343596Hh5fr_JPEG%2FScreenshot_20240411_100046_NAVER.jpg");
        restaurantRepository.save(restaurant39);

        RestaurantEntity restaurant40 = new RestaurantEntity();
        restaurant40.setFoodName("한식");
        restaurant40.setName("목향원");
        restaurant40.setNumber("031-527-2255");
        restaurant40.setAddress("경기 남양주시 덕릉로1071번길 34-11");
        restaurant40.setInfo("맛있는 음식점입니다");
        restaurant40.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20151209_141%2F1449631979574hDmwA_JPEG%2F167159526276263_12.jpg");
        restaurantRepository.save(restaurant40);

        RestaurantEntity restaurant41 = new RestaurantEntity();
        restaurant41.setFoodName("한식");
        restaurant41.setName("가림시골밥상");
        restaurant41.setNumber("031-943-1022");
        restaurant41.setAddress("경기 파주시 탄현면 새오리로 68");
        restaurant41.setInfo("맛있는 음식점입니다");
        restaurant41.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220805_283%2F1659667283778flSGl_JPEG%2FKakaoTalk_20220805_103004552_09.jpg");
        restaurantRepository.save(restaurant41);

        RestaurantEntity restaurant42 = new RestaurantEntity();
        restaurant42.setFoodName("한식");
        restaurant42.setName("옥된장 서현점");
        restaurant42.setNumber("0507-1348-7522");
        restaurant42.setAddress("경기 성남시 분당구 황새울로335번길 5 1층 106호");
        restaurant42.setInfo("맛있는 음식점입니다");
        restaurant42.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240126_136%2F1706232562065XC2wj_JPEG%2FIMG_2748.jpg");
        restaurantRepository.save(restaurant42);

        RestaurantEntity restaurant43 = new RestaurantEntity();
        restaurant43.setFoodName("한식,찌개,전골");
        restaurant43.setName("김네집");
        restaurant43.setNumber("031-666-3648");
        restaurant43.setAddress("경기 평택시 중앙시장로25번길 15 김네집");
        restaurant43.setInfo("맛있는 음식점입니다");
        restaurant43.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211230_249%2F1640795510066xBvqc_JPEG%2F20190315_191953.jpg");
        restaurantRepository.save(restaurant43);

        RestaurantEntity restaurant44 = new RestaurantEntity();
        restaurant44.setFoodName("고기");
        restaurant44.setName("산에들에");
        restaurant44.setNumber("031-943-8592");
        restaurant44.setAddress("경기 파주시 탄현면 성동로 19-63 산에들에");
        restaurant44.setInfo("맛있는 음식점입니다");
        restaurant44.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA2MDZfOTgg%2FMDAxNjg2MDU4MjM5OTUy.kgWAHbdzWzskPsErCNvCVTEfOSfXKkjHsbIKuuNSAxwg.eW9C5X8rSPpSNEyX0gnTTDccrM2YMYANA7WXylO_3_wg.JPEG%2F20230605_162041.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant44);

        RestaurantEntity restaurant45 = new RestaurantEntity();
        restaurant45.setFoodName("카페디저트");
        restaurant45.setName("카페 대너리스");
        restaurant45.setNumber("031-521-9700");
        restaurant45.setAddress("경기 남양주시 조안면 북한강로 914");
        restaurant45.setInfo("맛있는 음식점입니다");
        restaurant45.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMjYg%2FMDAxNzE3ODI0NjYxMjcz.7WEWUQBer8U7oG9IQa4p1EN-VMweqvnuDzIiicnOIfMg.ZJkd1z-m8-kO2Jj-BWDHQRRuwyqwYWETqcs6cOZiGW8g.JPEG%2F20240608_142225.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant45);

        RestaurantEntity restaurant46 = new RestaurantEntity();
        restaurant46.setFoodName("고기");
        restaurant46.setName("아르페지오");
        restaurant46.setNumber("0507-1316-5852");
        restaurant46.setAddress("경기 남양주시 와부읍 수레로661번길 142");
        restaurant46.setInfo("맛있는 음식점입니다");
        restaurant46.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231222_192%2F1703235163825hvzdf_JPEG%2F02.jpg");
        restaurantRepository.save(restaurant46);

        RestaurantEntity restaurant47 = new RestaurantEntity();
        restaurant47.setFoodName("한식");
        restaurant47.setName("도도한밥상");
        restaurant47.setNumber("0507-1309-5513");
        restaurant47.setAddress("경기 용인시 처인구 지삼로 513 1층");
        restaurant47.setInfo("맛있는 음식점입니다");
        restaurant47.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20231226_263%2F1703573502731bafqV_JPEG%2FRfBf4GWJOZjAAbOZcdWKC4d8.jpg");
        restaurantRepository.save(restaurant47);

        RestaurantEntity restaurant48 = new RestaurantEntity();
        restaurant48.setFoodName("양식");
        restaurant48.setName("테이스팅뮤지엄 행궁동");
        restaurant48.setNumber("0507-1494-3000");
        restaurant48.setAddress("경기 수원시 팔달구 화서문로71번길 2-6 1층 단독 테이스팅뮤지엄");
        restaurant48.setInfo("맛있는 음식점입니다");
        restaurantRepository.save(restaurant48);

        RestaurantEntity restaurant49 = new RestaurantEntity();
        restaurant49.setFoodName("한식,국밥");
        restaurant49.setName("유치회관");
        restaurant49.setNumber("031-234-6275");
        restaurant49.setAddress("경기 수원시 팔달구 효원로292번길 67");
        restaurant49.setInfo("맛있는 음식점입니다");
        restaurant49.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMTkz%2FMDAxNzE3ODMzNzIwNzEw.GKOK-sBrtVat8TCYf2tHEEFEgOKDhi9pPlR1E_L5If0g.Dls6eKtxqC4pOsoqLxpnrAzfBCmf1HkdpG6ZWdOujVkg.JPEG%2F678A3E0B-E8A4-4962-ABA5-608E0D960519.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant49);

        RestaurantEntity restaurant50 = new RestaurantEntity();
        restaurant50.setFoodName("카페디저트");
        restaurant50.setName("포레스트아웃팅스");
        restaurant50.setNumber("0507-1481-0500");
        restaurant50.setAddress("경기 고양시 일산동구 고양대로 1124 포레스트 아웃팅스");
        restaurant50.setInfo("맛있는 음식점입니다");
        restaurant50.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240507_187%2F1715067489776AlEhS_JPEG%2F1000038464.jpg");
        restaurantRepository.save(restaurant50);

        //강원-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant51 = new RestaurantEntity();
        restaurant51.setFoodName("한식");
        restaurant51.setName("뜰");
        restaurant51.setNumber("0507-1407-3408");
        restaurant51.setAddress("강원 철원군 갈말읍 동온동길 185 1층 1호");
        restaurant51.setInfo("맛있는 음식점입니다");
        restaurant51.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230817_166%2F16922458530492C8O1_JPEG%2F1692245578561.jpg");
        restaurantRepository.save(restaurant51);

        RestaurantEntity restaurant52 = new RestaurantEntity();
        restaurant52.setFoodName("한식,국수");
        restaurant52.setName("삼교리동치미막국수 강릉본점");
        restaurant52.setNumber("0507-1406-8830");
        restaurant52.setAddress("강원 강릉시 구정면 범일로 364");
        restaurant52.setInfo("맛있는 음식점입니다");
        restaurant52.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220516_245%2F1652689309540gUzb0_JPEG%2FKakaoTalk_20220516_162151720_05.jpg");
        restaurantRepository.save(restaurant52);

        RestaurantEntity restaurant53 = new RestaurantEntity();
        restaurant53.setFoodName("고기");
        restaurant53.setName("택지골수제생갈비 강릉본점");
        restaurant53.setNumber("0507-1312-7832");
        restaurant53.setAddress("강원 강릉시 하슬라로232번길 1 택지골수제생갈비");
        restaurant53.setInfo("맛있는 음식점입니다");
        restaurant53.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA1MjJfODQg%2FMDAxNzE2MzUwNTE3Nzc2.GBz1mC0vpv3hNQHn9ifbGncbzsbJGYXDt6Qf-T5bCGkg.DO9Aqi9Rq9INycAnWgYUmTsg7Z3yLKhgMGCKopDm_skg.JPEG%2F05F8E4E9-8F2B-4243-ACED-EA946EE8BDE0.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant53);

        RestaurantEntity restaurant54 = new RestaurantEntity();
        restaurant54.setFoodName("해물");
        restaurant54.setName("봉포머구리집");
        restaurant54.setNumber("0507-1404-2026");
        restaurant54.setAddress("강원 속초시 영랑해안길 223 봉포머구리집");
        restaurant54.setInfo("맛있는 음식점입니다");
        restaurant54.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221104_1%2F1667536809301FTqse_JPEG%2FKakaoTalk_20221103_235012619_06.jpg");
        restaurantRepository.save(restaurant54);

        RestaurantEntity restaurant55 = new RestaurantEntity();
        restaurant55.setFoodName("한식,두부");
        restaurant55.setName("강릉짬뽕순두부 동화가든 본점");
        restaurant55.setNumber("0507-1432-9885");
        restaurant55.setAddress("강원 강릉시 초당순두부길77번길 15 동화가든");
        restaurant55.setInfo("맛있는 음식점입니다");
        restaurant55.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221111_229%2F1668161743734VSWVC_PNG%2F%25C4%25B8%25C3%25B3.PNG");
        restaurantRepository.save(restaurant55);

        RestaurantEntity restaurant56 = new RestaurantEntity();
        restaurant56.setFoodName("고기,닭갈비");
        restaurant56.setName("춘천통나무집닭갈비");
        restaurant56.setNumber("033-241-5999");
        restaurant56.setAddress("강원 춘천시 신북읍 신샘밭로 763");
        restaurant56.setInfo("맛있는 음식점입니다");
        restaurant56.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMzgg%2FMDAxNzE3ODQwNDc5MDM5.U1ePLfyALxE4wzIHd58Ug2d6AXgONwgZ_Y4xjIWQ0Zcg.6NtkjY0eX0fT4GW2NVfqNuosK5eWlAD9Wgvf9s0zznEg.JPEG%2F36615A6D-CF97-43FF-99B4-29E176E04B27.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant56);

        RestaurantEntity restaurant57 = new RestaurantEntity();
        restaurant57.setFoodName("카페디저트");
        restaurant57.setName("카페 툇마루");
        restaurant57.setNumber("0507-1349-7175");
        restaurant57.setAddress("강원 강릉시 난설헌로 232 카페 툇마루");
        restaurant57.setInfo("맛있는 음식점입니다");
        restaurant57.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220205_57%2F1644070044200kHGFY_JPEG%2FScreenshot_20220205-230525_NAVER.jpg");
        restaurantRepository.save(restaurant57);

        RestaurantEntity restaurant58 = new RestaurantEntity();
        restaurant58.setFoodName("회,해물");
        restaurant58.setName("청초수물회 속초본점");
        restaurant58.setNumber("0507-1425-5051");
        restaurant58.setAddress("강원 속초시 엑스포로 12-36 청초수물회 속초본점");
        restaurant58.setInfo("맛있는 음식점입니다");
        restaurant58.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230601_10%2F1685611578393J3OLt_JPEG%2FKakaoTalk_20211105_200147570.jpg");
        restaurantRepository.save(restaurant58);

        RestaurantEntity restaurant59 = new RestaurantEntity();
        restaurant59.setFoodName("회,해물");
        restaurant59.setName("경포대 울진대게횟집");
        restaurant59.setNumber("0507-1368-1614");
        restaurant59.setAddress("강원 강릉시 창해로 491");
        restaurant59.setInfo("맛있는 음식점입니다");
        restaurant59.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20181011_277%2F15392496571907essO_JPEG%2F5F43uZnhx-j4uyJXGTQwTD4O.JPG.jpg");
        restaurantRepository.save(restaurant59);

        RestaurantEntity restaurant60 = new RestaurantEntity();
        restaurant60.setFoodName("회,해물");
        restaurant60.setName("해연가");
        restaurant60.setNumber("0507-1335-0549");
        restaurant60.setAddress("강원 강릉시 해안로 280 1호상가");
        restaurant60.setInfo("맛있는 음식점입니다");
        restaurant60.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221223_163%2F1671766757943AaRhq_JPEG%2F%25C7%25D8%25BF%25AC%25B0%25A13.jpg");
        restaurantRepository.save(restaurant60);

        RestaurantEntity restaurant61 = new RestaurantEntity();
        restaurant61.setFoodName("고기,닭갈비");
        restaurant61.setName("참나무숯불닭갈비 막국수");
        restaurant61.setNumber("0507-1332-0388");
        restaurant61.setAddress("강원 춘천시 신북읍 신샘밭로 715");
        restaurant61.setInfo("맛있는 음식점입니다");
        restaurant61.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20150925_212%2F1443161976607zzVMj_JPEG%2F166875554953731_2.jpg");
        restaurantRepository.save(restaurant61);

        RestaurantEntity restaurant62 = new RestaurantEntity();
        restaurant62.setFoodName("카페디저트");
        restaurant62.setName("만동제과");
        restaurant62.setNumber("0507-1317-6387");
        restaurant62.setAddress("강원 강릉시 금성로 6 1층 만동제과");
        restaurant62.setInfo("맛있는 음식점입니다");
        restaurant62.setImage("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA1MThfODMg%2FMDAxNzE2MDI3MTgxNTY5.hOrFezm18-gWdbkqimpGQPRmuoE105DCWgiSB4NTwlMg.0_Os5lGp9AEozaWvbZQ5S1bV5--pvzWxoSFv012PDKMg.JPEG%2FP20240516_133159469_426CE693-3B9E-4316-B448-593C0D406DD5.jpg");
        restaurantRepository.save(restaurant62);

        RestaurantEntity restaurant63 = new RestaurantEntity();
        restaurant63.setFoodName("한식");
        restaurant63.setName("낙산물곰탕");
        restaurant63.setNumber("010-8797-9749");
        restaurant63.setAddress("강원 양양군 강현면 낙산사로 35");
        restaurant63.setInfo("맛있는 음식점입니다");
        restaurant63.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240122_181%2F1705901840708o2Omi_JPEG%2F2G3A0320.jpg");
        restaurantRepository.save(restaurant63);

        RestaurantEntity restaurant64 = new RestaurantEntity();
        restaurant64.setFoodName("해물,생선");
        restaurant64.setName("수빈이네찜");
        restaurant64.setNumber("0507-1334-5180");
        restaurant64.setAddress("강원 속초시 동해대로3930번길 6 1층 수빈이네찜 속초본점");
        restaurant64.setInfo("맛있는 음식점입니다");
        restaurant64.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDZfMjA5%2FMDAxNzE3NjY2OTcxNDMx.TWVnt0_GSRpCA-_JzvQyEUEKDM26SNEEbqL4aX1oqSQg.Q5msGYZmMgdmsRB2G4qq4GNqCLuprODQeQdsUdci-kcg.JPEG%2F0C610DCA-6613-4198-BEAD-C0D7F5D1DB71.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant64);

        RestaurantEntity restaurant65 = new RestaurantEntity();
        restaurant65.setFoodName("국수");
        restaurant65.setName("방림메밀막국수");
        restaurant65.setNumber("033-335-1150");
        restaurant65.setAddress("강원 평창군 대관령면 눈마을길 13");
        restaurant65.setInfo("맛있는 음식점입니다");
        restaurant65.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDZfMTY1%2FMDAxNzE3NjQyNjU5MjU4.R8NdmGwuZd0y9toQuHRL9_tFVlq2-O-vFb4j8wUqVBIg.0wUzxilsm0v6f-_DgXNNPZfTfAA_bDElgzjc6LUeotQg.JPEG%2F081C746D-1F59-44A1-B90B-EC3FC35F4E6C.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant65);

        //충남-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant66 = new RestaurantEntity();
        restaurant66.setFoodName("한식");
        restaurant66.setName("오봉집 서산점");
        restaurant66.setNumber("0507-1397-8593");
        restaurant66.setAddress("충남 서산시 호수공원5로 7 1층");
        restaurant66.setInfo("맛있는 음식점입니다");
        restaurant66.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240318_39%2F1710732896834oQMJx_JPEG%2FKakaoTalk_20240318_122540504_09.jpg");
        restaurantRepository.save(restaurant66);

        RestaurantEntity restaurant67 = new RestaurantEntity();
        restaurant67.setFoodName("카페디저트");
        restaurant67.setName("beanscloud");
        restaurant67.setNumber("0507-1367-6679");
        restaurant67.setAddress("충남 아산시 배방읍 배방로14번길 77-10 온하우스 1층 beanscloud");
        restaurant67.setInfo("맛있는 음식점입니다");
        restaurant67.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDZfMTE1%2FMDAxNzE3NjUyODk4ODk4.FZyAfNxFqFn7smYcrS8hL06VPO0sqjsdw55_KfNnRcog.NaTVvLyr_Q0qub73fAj_FFeluYVatOXrTX8CPAEXU4kg.JPEG%2F34545098-FA8B-493C-AF88-A51F851E6C4A.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant67);

        RestaurantEntity restaurant68 = new RestaurantEntity();
        restaurant68.setFoodName("고기");
        restaurant68.setName("신사우물갈비 불당본점");
        restaurant68.setNumber("041-567-5958");
        restaurant68.setAddress("충남 천안시 서북구 불당25로 182 에이블타워2 1층");
        restaurant68.setInfo("맛있는 음식점입니다");
        restaurant68.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240502_236%2F17146401062927lc6n_JPEG%2F1714623337574.jpg");
        restaurantRepository.save(restaurant68);

        RestaurantEntity restaurant69 = new RestaurantEntity();
        restaurant69.setFoodName("한식,국밥");
        restaurant69.setName("국본가 보령점");
        restaurant69.setNumber("0507-1449-0031");
        restaurant69.setAddress("충남 보령시 대해로 882");
        restaurant69.setInfo("맛있는 음식점입니다");
        restaurant69.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMTkg%2FMDAxNzE3ODE4NDcwNDY0.t9sDaB7DkMbPUQQYVfE49bNGFo6LJnfZm2bEl3NQN_0g.3UhoWJc_7hgYa5JsY-5LlD4RJJC-g-gKsjtwI4a8olIg.JPEG%2F20240608_123400.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant69);

        RestaurantEntity restaurant70 = new RestaurantEntity();
        restaurant70.setFoodName("해물,게");
        restaurant70.setName("안면도맛집 꽃지꽃게집");
        restaurant70.setNumber("0507-1382-1105");
        restaurant70.setAddress("충남 태안군 안면읍 안면대로 3020");
        restaurant70.setInfo("맛있는 음식점입니다");
        restaurant70.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMjQy%2FMDAxNzE3ODQyNTI3NDQ0.J02X6onoWu48_7S9QM4xRHG1NySlSGJ4MKhzoNONAwAg.9kr_WFJsGDzbFCUTjgk63rV94jkL5hKwmejqJpMi-_wg.JPEG%2F20240608_182324.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant70);

        RestaurantEntity restaurant71 = new RestaurantEntity();
        restaurant71.setFoodName("국수");
        restaurant71.setName("장원막국수");
        restaurant71.setNumber("041-835-6561");
        restaurant71.setAddress("충남 부여군 부여읍 나루터로62번길 20");
        restaurant71.setInfo("맛있는 음식점입니다");
        restaurant71.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDNfOTUg%2FMDAxNzE3Mzg1NTcwODg1.RHVXbE8T27btqoehDSm-yLSfnsjcwmjkGni5wExEBTwg.nnajcovQ-CI6W1RRQkxItMWFWBzGnSZvs67HxWfdYVUg.JPEG%2F3AD28970-0D32-4EBB-A9F9-5E79FF567A23.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant71);

        RestaurantEntity restaurant72 = new RestaurantEntity();
        restaurant72.setFoodName("카페디저트");
        restaurant72.setName("뚜쥬루 빵돌가마마을");
        restaurant72.setNumber("041-578-0036");
        restaurant72.setAddress("충남 천안시 동남구 풍세로 706");
        restaurant72.setInfo("맛있는 음식점입니다");
        restaurant72.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210625_220%2F1624584285993bxEhy_JPEG%2F5I_fwHJgEW7kPdcoKGFCX_Yv.jpg");
        restaurantRepository.save(restaurant72);

        RestaurantEntity restaurant73 = new RestaurantEntity();
        restaurant73.setFoodName("샤브샤브,고기");
        restaurant73.setName("고메샤브 당진본점");
        restaurant73.setNumber("041-357-3080");
        restaurant73.setAddress("충남 당진시 시청1로 33");
        restaurant73.setInfo("맛있는 음식점입니다");
        restaurant73.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240507_4%2F17150498033960pbzu_JPEG%2F9._%25C6%25F2%25C0%25CF%25C1%25A1%25BD%25C9_%25BC%25D2%25B0%25ED%25B1%25E2_%25BB%25FE%25BA%25EA_2%25C0%25CE_%25C1%25D6%25B9%25AE_%25281%2529.JPG");
        restaurantRepository.save(restaurant73);

        RestaurantEntity restaurant74 = new RestaurantEntity();
        restaurant74.setFoodName("국수");
        restaurant74.setName("대림국수 천안불당점");
        restaurant74.setNumber("0507-1443-4555");
        restaurant74.setAddress("충남 천안시 서북구 불당25로 146 리치타워 1층 102호, 103호");
        restaurant74.setInfo("맛있는 음식점입니다");
        restaurant74.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221226_122%2F1672042302992zft0e_JPEG%2FKakaoTalk_20220915_190025314.jpg");
        restaurantRepository.save(restaurant74);

        RestaurantEntity restaurant75 = new RestaurantEntity();
        restaurant75.setFoodName("고기");
        restaurant75.setName("남영동양문 천안점");
        restaurant75.setNumber("041-415-0046");
        restaurant75.setAddress("충남 천안시 서북구 불당33길 45 1층 104호, 105호");
        restaurant75.setInfo("맛있는 음식점입니다");
        restaurant75.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230421_270%2F1682061634218J2ICW_PNG%2F%25BB%25FD%25BC%25D2%25B0%25A5%25BA%25F1.png");
        restaurantRepository.save(restaurant75);

        RestaurantEntity restaurant76 = new RestaurantEntity();
        restaurant76.setFoodName("곱창,막창");
        restaurant76.setName("사위식당 불당점");
        restaurant76.setNumber("0507-1469-3930");
        restaurant76.setAddress("충남 천안시 서북구 불당26로 50 지웰시티푸르지오 상가 G동103,104");
        restaurant76.setInfo("맛있는 음식점입니다");
        restaurant76.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220612_284%2F1655032864372Q12CX_JPEG%2F8C875906-6773-484C-8506-4EA34D620EB7.jpeg");
        restaurantRepository.save(restaurant76);

        RestaurantEntity restaurant77 = new RestaurantEntity();
        restaurant77.setFoodName("카페디저트");
        restaurant77.setName("애월담");
        restaurant77.setNumber("0507-1333-1743");
        restaurant77.setAddress("충남 금산군 진산면 실학로 529 애월담");
        restaurant77.setInfo("맛있는 음식점입니다");
        restaurant77.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20240428_279%2F1714234659730FOR4F_JPEG%2F%25B4%25D9%25BF%25EE%25B7%25CE%25B5%25E5_%25281%2529.jpg");
        restaurantRepository.save(restaurant77);

        RestaurantEntity restaurant78 = new RestaurantEntity();
        restaurant78.setFoodName("일식,돈가스");
        restaurant78.setName("이자와 천안 신부동점");
        restaurant78.setNumber("041-563-0693");
        restaurant78.setAddress("충남 천안시 동남구 먹거리10길 18-1");
        restaurant78.setInfo("맛있는 음식점입니다");
        restaurant78.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240227_32%2F1709016752357unihH_JPEG%2F3.jpg");
        restaurantRepository.save(restaurant78);

        RestaurantEntity restaurant79 = new RestaurantEntity();
        restaurant79.setFoodName("국수,만두");
        restaurant79.setName("공주쌍신집칼국수");
        restaurant79.setNumber("0507-1374-5459");
        restaurant79.setAddress("충남 공주시 쌍신길 109-2 공주쌍신집칼국수");
        restaurant79.setInfo("맛있는 음식점입니다");
        restaurant79.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230519_218%2F16844849837631iW1u_JPEG%2FKakaoTalk_20230519_120236159_12.jpg");
        restaurantRepository.save(restaurant79);

        RestaurantEntity restaurant80 = new RestaurantEntity();
        restaurant80.setFoodName("한식,찌개");
        restaurant80.setName("의정부부대찌개");
        restaurant80.setNumber("0507-1477-2219");
        restaurant80.setAddress("충남 공주시 국고개길 6-1 1층");
        restaurant80.setInfo("맛있는 음식점입니다");
        restaurant80.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230628_203%2F16879472315263ihz3_JPEG%2F20220705_113430.jpg");
        restaurantRepository.save(restaurant80);

        //충북-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant81 = new RestaurantEntity();
        restaurant81.setFoodName("한식");
        restaurant81.setName("백향담");
        restaurant81.setNumber("070-4242-7545");
        restaurant81.setAddress("충북 단양군 단양읍 수변로 79 2층");
        restaurant81.setInfo("맛있는 음식점입니다");
        restaurant81.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220421_209%2F1650533262818hQnPA_JPEG%2FKakaoTalk_20220421_154817821.jpg");
        restaurantRepository.save(restaurant81);

        RestaurantEntity restaurant82 = new RestaurantEntity();
        restaurant82.setFoodName("한식");
        restaurant82.setName("뜰이있는집");
        restaurant82.setNumber("0507-1420-8585");
        restaurant82.setAddress("충북 제천시 하소천길 176 뜰이있는집");
        restaurant82.setInfo("맛있는 음식점입니다");
        restaurant82.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220303_285%2F1646303562367tWOeu_JPEG%2F%25C3%25B9%25C6%25E4%25C0%25CC%25C1%25F6%25B8%25DE%25C0%25CE.jpg");
        restaurantRepository.save(restaurant82);

        RestaurantEntity restaurant83 = new RestaurantEntity();
        restaurant83.setFoodName("카페디저트");
        restaurant83.setName("카페산");
        restaurant83.setNumber("0507-1353-0868");
        restaurant83.setAddress("충북 단양군 가곡면 두산길 196-86");
        restaurant83.setInfo("맛있는 음식점입니다");
        restaurantRepository.save(restaurant83);

        RestaurantEntity restaurant84 = new RestaurantEntity();
        restaurant84.setFoodName("고기");
        restaurant84.setName("마늘석갈비막국수");
        restaurant84.setNumber("0507-1412-7575");
        restaurant84.setAddress("충북 단양군 단양읍 단양로 510");
        restaurant84.setInfo("맛있는 음식점입니다");
        restaurantRepository.save(restaurant84);

        RestaurantEntity restaurant85 = new RestaurantEntity();
        restaurant85.setFoodName("고기");
        restaurant85.setName("가연한우 정육식당");
        restaurant85.setNumber("043-715-7793");
        restaurant85.setAddress("충북 청주시 청원구 공항로141번길 29 1층");
        restaurant85.setInfo("맛있는 음식점입니다");
        restaurantRepository.save(restaurant85);

        RestaurantEntity restaurant86 = new RestaurantEntity();
        restaurant86.setFoodName("해물,해물찜");
        restaurant86.setName("대구왕뽈때기");
        restaurant86.setNumber("043-214-4300");
        restaurant86.setAddress("충북 청주시 청원구 오창읍 중심상업로 52-5");
        restaurant86.setInfo("맛있는 음식점입니다");
        restaurantRepository.save(restaurant86);

        RestaurantEntity restaurant87 = new RestaurantEntity();
        restaurant87.setFoodName("고기,찌개,전골");
        restaurant87.setName("황할머니갈비집");
        restaurant87.setNumber("043-222-9292");
        restaurant87.setAddress("충북 청주시 상당구 남사로140번길 30 청주 맛집 황할머니갈비집");
        restaurant87.setInfo("맛있는 음식점입니다");
        restaurantRepository.save(restaurant87);

        RestaurantEntity restaurant88 = new RestaurantEntity();
        restaurant88.setFoodName("고기");
        restaurant88.setName("창심관 지웰시티점");
        restaurant88.setNumber("0507-1418-6568");
        restaurant88.setAddress("충북 청주시 흥덕구 진재로 108");
        restaurant88.setInfo("맛있는 음식점입니다");
        restaurant88.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230623_100%2F1687495307957Yj5we_JPEG%2FKakaoTalk_20230519_204637313_26.jpg");
        restaurantRepository.save(restaurant88);

        RestaurantEntity restaurant89 = new RestaurantEntity();
        restaurant89.setFoodName("중식");
        restaurant89.setName("금용");
        restaurant89.setNumber("0507-1408-0765");
        restaurant89.setAddress("충북 청주시 청원구 내덕로 33 1층");
        restaurant89.setInfo("맛있는 음식점입니다");
        restaurant89.setImage("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDAyMTFfMTA4%2FMDAxNzA3NjI5NDkyMTY1.Xj4_aub89GYSnQmqFCWGh6583x_ODSqO7tn1LnUpK9Yg.gvekNQzTB2y7_KoZ-2pA30usmHR7SjsWSdpwj9MX43cg.JPEG.zmfkddl3%2FL1051408.jpg");
        restaurantRepository.save(restaurant89);

        RestaurantEntity restaurant90 = new RestaurantEntity();
        restaurant90.setFoodName("백숙,삼계탕,한식");
        restaurant90.setName("숲속장수촌");
        restaurant90.setNumber("0507-1446-2526");
        restaurant90.setAddress("충북 충주시 쇠저울1길 36");
        restaurant90.setInfo("맛있는 음식점입니다");
        restaurant90.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240219_207%2F1708344008308uo4Q3_JPEG%2F20240219_171143_001.jpg");
        restaurantRepository.save(restaurant90);

        RestaurantEntity restaurant92 = new RestaurantEntity();
        restaurant92.setFoodName("한식,국수");
        restaurant92.setName("중앙탑막국수");
        restaurant92.setNumber("043-846-5508");
        restaurant92.setAddress("충북 충주시 중앙탑면 중앙탑길 109");
        restaurant92.setInfo("맛있는 음식점입니다");
        restaurant92.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfNzUg%2FMDAxNzE3ODQzODg1ODU3.kiG6iNX3rmL0f5UGY9BQt0ApHTmFBlF6b6wiT738xDkg.mq0TyZExTzFpMp5QeYZvUBQP7dzZ5NXD802LNgkpIOwg.JPEG%2F20240608_194801.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant92);

        RestaurantEntity restaurant93 = new RestaurantEntity();
        restaurant93.setFoodName("카페디저트");
        restaurant93.setName("엔트라포레");
        restaurant93.setNumber("0507-1353-7449");
        restaurant93.setAddress("충북 청주시 상당구 남일면 가좌신송로 190-53 엔트라포레");
        restaurant93.setInfo("맛있는 음식점입니다");
        restaurant93.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210504_149%2F1620130875447pNWwl_JPEG%2FwgL-xBOO_oIe-sg8VK9eI-Ua.jpg");
        restaurantRepository.save(restaurant93);

        RestaurantEntity restaurant94 = new RestaurantEntity();
        restaurant94.setFoodName("고기");
        restaurant94.setName("창심관 율량점");
        restaurant94.setNumber("0507-1371-3267");
        restaurant94.setAddress("충북 청주시 청원구 1순환로 118 101호");
        restaurant94.setInfo("맛있는 음식점입니다");
        restaurant94.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240110_10%2F17048970705408Lw5O_JPEG%2FGJS07505.jpg");
        restaurantRepository.save(restaurant94);

        RestaurantEntity restaurant95 = new RestaurantEntity();
        restaurant95.setFoodName("일식");
        restaurant95.setName("아키아키");
        restaurant95.setNumber("0507-1437-2113");
        restaurant95.setAddress("충북 청주시 흥덕구 1순환로 528");
        restaurant95.setInfo("맛있는 음식점입니다");
        restaurant95.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240527_285%2F1716740355407fumYl_JPEG%2F%25B4%25EB%25B0%25D4%25C4%25DA%25BD%25BA.jpg");
        restaurantRepository.save(restaurant95);

        RestaurantEntity restaurant96 = new RestaurantEntity();
        restaurant96.setFoodName("한식");
        restaurant96.setName("대교식당");
        restaurant96.setNumber("0507-1363-4008");
        restaurant96.setAddress("충북 단양군 단양읍 중앙2로 9 대교식당");
        restaurant96.setInfo("맛있는 음식점입니다");
        restaurant96.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240113_118%2F1705123620610NrgDM_JPEG%2F1000002524.jpg");
        restaurantRepository.save(restaurant96);

        //전북-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant97 = new RestaurantEntity();
        restaurant97.setFoodName("치킨");
        restaurant97.setName("BHC치킨 군산지곡점");
        restaurant97.setNumber("0507-1432-0562");
        restaurant97.setAddress("전북 군산시 계산로 87-6");
        restaurant97.setInfo("맛있는 음식점입니다");
        restaurant97.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230728_163%2F1690527462657oaYaF_PNG%2F%25C4%25A1%25C6%25FE%25B4%25E7_%25B3%25D7%25C0%25CC%25B9%25F6_%25B0%25F8%25C5%25EB%25BA%25CE%25B0%25A1%25C1%25A4%25BA%25B8_%25C0%25CC%25B9%25CC%25C1%25F6.png");
        restaurantRepository.save(restaurant97);

        RestaurantEntity restaurant98 = new RestaurantEntity();
        restaurant98.setFoodName("중식");
        restaurant98.setName("지린성");
        restaurant98.setNumber("0507-1369-2905");
        restaurant98.setAddress("전북 군산시 미원로 87");
        restaurant98.setInfo("맛있는 음식점입니다");
        restaurant98.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20151124_152%2F1448349102073flCj4_JPEG%2F167074564160677_2.jpg");
        restaurantRepository.save(restaurant98);

        RestaurantEntity restaurant99 = new RestaurantEntity();
        restaurant99.setFoodName("한식");
        restaurant99.setName("한일옥");
        restaurant99.setNumber("063-446-5502");
        restaurant99.setAddress("전북 군산시 구영3길 63");
        restaurant99.setInfo("맛있는 음식점입니다");
        restaurant99.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190116_132%2F1547622603538wFPrq_JPEG%2FrR0sTSIYHGjMT6dAGhUXFp1_.jpg");
        restaurantRepository.save(restaurant99);

        RestaurantEntity restaurant100 = new RestaurantEntity();
        restaurant100.setFoodName("순대,국밥");
        restaurant100.setName("조점례남문피순대");
        restaurant100.setNumber("1551-5066");
        restaurant100.setAddress("전북 전주시 완산구 풍남문2길 39 조점례 남문피순대");
        restaurant100.setInfo("맛있는 음식점입니다");
        restaurant100.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20151113_181%2F1447396115038AdKWP_JPEG%2F167063555853660_1.jpg");
        restaurantRepository.save(restaurant100);

        RestaurantEntity restaurant101 = new RestaurantEntity();
        restaurant101.setFoodName("고기");
        restaurant101.setName("자매갈비전골");
        restaurant101.setNumber("0507-1420-7953");
        restaurant101.setAddress("전북 전주시 완산구 기린대로 121 본관");
        restaurant101.setInfo("맛있는 음식점입니다");
        restaurant101.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211205_17%2F1638686787286yT0HB_JPEG%2FScreenshot_20211205-153810_Instagram.jpg");
        restaurantRepository.save(restaurant101);

        RestaurantEntity restaurant102 = new RestaurantEntity();
        restaurant102.setFoodName("해물,해물찜");
        restaurant102.setName("한소끔");
        restaurant102.setNumber("0507-1438-8181");
        restaurant102.setAddress("전북 군산시 백토로 284-8");
        restaurant102.setInfo("맛있는 음식점입니다");
        restaurant102.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230704_208%2F1688435505569ef7MJ_JPEG%2F003.jpg");
        restaurantRepository.save(restaurant102);

        RestaurantEntity restaurant103 = new RestaurantEntity();
        restaurant103.setFoodName("한식");
        restaurant103.setName("전라도음식이야기");
        restaurant103.setNumber("063-244-4477");
        restaurant103.setAddress("전북 전주시 덕진구 아중6길 14-6 전라도음식이야기");
        restaurant103.setInfo("맛있는 음식점입니다");
        restaurant103.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20151113_249%2F1447396175393uuYBg_JPEG%2F167063555953475_1.jpg");
        restaurantRepository.save(restaurant103);

        RestaurantEntity restaurant104 = new RestaurantEntity();
        restaurant104.setFoodName("중식");
        restaurant104.setName("복성루");
        restaurant104.setNumber("063-445-8412");
        restaurant104.setAddress("전북 군산시 월명로 382 복성루");
        restaurant104.setInfo("맛있는 음식점입니다");
        restaurant104.setImage("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzEyMjVfMjM4%2FMDAxNzAzNDk0ODMzODA0.REp-hsUcNJlJ5kgLd6u6Q33W25MktDDV2GvIcp38SP4g.zVyHfEcjRw6uDZfyvBAZk_wMTSM3qUABha86tp3YSgsg.JPEG.altnrtkfkd20%2FKakaoTalk_20231225_175318523_08.jpg");
        restaurantRepository.save(restaurant104);

        RestaurantEntity restaurant105 = new RestaurantEntity();
        restaurant105.setFoodName("양식,파스타");
        restaurant105.setName("쉐프테라스");
        restaurant105.setNumber("0507-1474-1073");
        restaurant105.setAddress("전북 군산시 수송로 135 1층, 2층 쉐프테라스");
        restaurant105.setInfo("맛있는 음식점입니다");
        restaurant105.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221205_198%2F1670217940754nsqku_JPEG%2F%25B8%25DE%25C0%25CE%2528%25C7%25C1%25B8%25AE%25B9%25CC%25BE%25F6_%25B5%25EE%25BD%25C9%25BD%25BA%25C5%25D7%25C0%25CC%25C5%25A9%2529_%25285%2529.jpg");
        restaurantRepository.save(restaurant105);

        RestaurantEntity restaurant106 = new RestaurantEntity();
        restaurant106.setFoodName("국밥");
        restaurant106.setName("현대옥 전주본점");
        restaurant106.setNumber("063-228-0020");
        restaurant106.setAddress("전북 전주시 완산구 화산천변2길 7-4");
        restaurant106.setInfo("맛있는 음식점입니다");
        restaurant106.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMTU4%2FMDAxNzE3ODE4MTYwNDg5.8YFnd-jGliNBKH25YEcyFyAunmDWf5VSOBdyoLeKtsAg.-gT8t9fbhTkVffC51d7Ecva07O8Er75ZbyviOgKcIl4g.JPEG%2F20240608_113845.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant106);

        RestaurantEntity restaurant107 = new RestaurantEntity();
        restaurant107.setFoodName("한식");
        restaurant107.setName("기와");
        restaurant107.setNumber("063-231-0702");
        restaurant107.setAddress("전북 전주시 완산구 어진길 15");
        restaurant107.setInfo("맛있는 음식점입니다");
        restaurant107.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231207_88%2F17018804592347DUYk_JPEG%2FIMG_4369.jpeg");
        restaurantRepository.save(restaurant107);

        RestaurantEntity restaurant108 = new RestaurantEntity();
        restaurant108.setFoodName("카페디저트");
        restaurant108.setName("슬지제빵소");
        restaurant108.setNumber("1899-9504");
        restaurant108.setAddress("전북 부안군 진서면 청자로 1076 슬지제빵소");
        restaurant108.setInfo("맛있는 음식점입니다");
        restaurant108.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210723_265%2F1626967243930iVOH1_JPEG%2FszYQFeSVC7TvYrgXU3yF_U_n.jpeg.jpg");
        restaurantRepository.save(restaurant108);

        RestaurantEntity restaurant109 = new RestaurantEntity();
        restaurant109.setFoodName("한식");
        restaurant109.setName("달궁식당");
        restaurant109.setNumber("063-625-8971");
        restaurant109.setAddress("전북 남원시 산내면 지리산로 311 달궁산장가든");
        restaurant109.setInfo("맛있는 음식점입니다");
        restaurant109.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220815_3%2F1660545901099RXTRu_JPEG%2FP20220810_173906368_2C652790-1C7A-4361-BF7C-DF25F5CD03BC.jpg");
        restaurantRepository.save(restaurant109);

        RestaurantEntity restaurant110 = new RestaurantEntity();
        restaurant110.setFoodName("중식");
        restaurant110.setName("왕산중화요리 군산");
        restaurant110.setNumber("063-467-1318");
        restaurant110.setAddress("전북 군산시 대학로 209 왕산중화요리");
        restaurant110.setInfo("맛있는 음식점입니다");
        restaurant110.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20151124_96%2F1448349067041OSFDU_JPEG%2F167074564125371_0.jpg");
        restaurantRepository.save(restaurant110);

        RestaurantEntity restaurant111 = new RestaurantEntity();
        restaurant111.setFoodName("일식");
        restaurant111.setName("가츠연");
        restaurant111.setNumber("0507-1309-2277");
        restaurant111.setAddress("전북 전주시 완산구 홍산북로 46-21 성준빌딩 2층 가츠연");
        restaurant111.setInfo("맛있는 음식점입니다");
        restaurant111.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20231105_119%2F1699125245131HP5uU_JPEG%2FIMG_5261.jpeg");
        restaurantRepository.save(restaurant111);

        //전남-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant112 = new RestaurantEntity();
        restaurant112.setFoodName("해물,해물찜");
        restaurant112.setName("진미아구전문");
        restaurant112.setNumber("0507-1349-8953");
        restaurant112.setAddress("전남 나주시 금성길 65-2");
        restaurant112.setInfo("맛있는 음식점입니다");
        restaurant112.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMTUz%2FMDAxNzE3ODE4MTg3MjIx.OY5nSSxpxGLmACokZYiOeL5g4YeQMUVs0hEN9p1g3ykg.Ge6jGXnwDVuR92bnlWJRzkUQAFquOAkvHlQv0lcBu_4g.JPEG%2FD7570690-6A0C-4415-9035-2FFB05DDB1AE.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant112);

        RestaurantEntity restaurant113 = new RestaurantEntity();
        restaurant113.setFoodName("한식");
        restaurant113.setName("명동게장");
        restaurant113.setNumber("0507-1353-0593");
        restaurant113.setAddress("전남 여수시 봉산남4길 23-26");
        restaurant113.setInfo("맛있는 음식점입니다");
        restaurant113.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230116_92%2F1673877197690jAWbY_JPEG%2F%25B8%25ED%25B5%25BF%25B0%25D4%25C0%25E57681.jpg");
        restaurantRepository.save(restaurant113);

        RestaurantEntity restaurant114 = new RestaurantEntity();
        restaurant114.setFoodName("한식");
        restaurant114.setName("도원경");
        restaurant114.setNumber("0507-1399-5571");
        restaurant114.setAddress("전남 순천시 순천만길 309 1층 도원경");
        restaurant114.setInfo("맛있는 음식점입니다");
        restaurant114.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220729_228%2F1659024651382TuUz7_JPEG%2F487A8866-20C3-4BAB-98E7-B5FAEFA57692.jpeg");
        restaurantRepository.save(restaurant114);

        RestaurantEntity restaurant115 = new RestaurantEntity();
        restaurant115.setFoodName("한식");
        restaurant115.setName("순천만정문식당");
        restaurant115.setNumber("0507-1423-1802");
        restaurant115.setAddress("전남 순천시 순천만길 492");
        restaurant115.setInfo("맛있는 음식점입니다");
        restaurant115.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA1MDRfMjA3%2FMDAxNzE0ODEzMjUyNDEx.ZnX8Rs2bs2bMpfnNZmpgt1HETS2nHr2UnWJ2RxjVBdgg.b8uF3pH51ySEMn3-aItlDEWiI_Yzo-izQqU0ADlZq9cg.JPEG%2F20240504_131258.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant115);

        RestaurantEntity restaurant116 = new RestaurantEntity();
        restaurant116.setFoodName("고기");
        restaurant116.setName("쌍교숯불갈비 담양 본점");
        restaurant116.setNumber("0507-1316-0012");
        restaurant116.setAddress("전남 담양군 봉산면 송강정로 212");
        restaurant116.setInfo("맛있는 음식점입니다");
        restaurant116.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220426_157%2F1650959094604fSs2c_JPEG%2F%25C5%25A9%25B1%25E2%25BA%25AF%25C8%25AF%25C5%25A9%25B1%25E2%25BA%25AF%25C8%25AF00-3.jpg");
        restaurantRepository.save(restaurant116);

        RestaurantEntity restaurant117 = new RestaurantEntity();
        restaurant117.setFoodName("한식");
        restaurant117.setName("여수게장 낭만별식");
        restaurant117.setNumber("010-4672-9227");
        restaurant117.setAddress("전남 여수시 돌산읍 진두해안길 72 2층 203호");
        restaurant117.setInfo("맛있는 음식점입니다");
        restaurant117.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230607_2%2F1686134573931Aqwlx_JPEG%2FIMG_2233.jpg");
        restaurantRepository.save(restaurant117);

        RestaurantEntity restaurant118 = new RestaurantEntity();
        restaurant118.setFoodName("한식,해물,생선");
        restaurant118.setName("여수밥상 갈치야");
        restaurant118.setNumber("061-644-9636");
        restaurant118.setAddress("전남 여수시 돌산읍 향일암로 378");
        restaurant118.setInfo("맛있는 음식점입니다");
        restaurant118.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20240220_284%2F1708419208995V23Se_JPEG%2F1708418158874.jpg");
        restaurantRepository.save(restaurant118);

        RestaurantEntity restaurant119 = new RestaurantEntity();
        restaurant119.setFoodName("카페디저트");
        restaurant119.setName("코롬방제과점");
        restaurant119.setNumber("061-244-0885");
        restaurant119.setAddress("전남 목포시 영산로75번길 7");
        restaurant119.setInfo("맛있는 음식점입니다");
        restaurant119.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDdfMjQ2%2FMDAxNzE3NzYwMDQ4MTYz.SLkptvcnGaW9lYWNKxurzszyFDVl1szwuwPpxZEsixYg._vmve330fm_BjbXJSOFmvC76ObKxmM6g2uawWIIGYdcg.JPEG%2F20240607_114028.jpg.jpg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant119);

        RestaurantEntity restaurant120 = new RestaurantEntity();
        restaurant120.setFoodName("카페디저트");
        restaurant120.setName("모이핀 오션점");
        restaurant120.setNumber("0507-1477-6003");
        restaurant120.setAddress("전남 여수시 돌산읍 무술목길 50 모이핀");
        restaurant120.setInfo("맛있는 음식점입니다");
        restaurant120.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240501_158%2F1714536129313euiea_JPEG%2FKakaoTalk_20240501_123243085.jpg");
        restaurantRepository.save(restaurant120);

        RestaurantEntity restaurant121 = new RestaurantEntity();
        restaurant121.setFoodName("일식,스시,초밥");
        restaurant121.setName("상무초밥 여수낭만포차거리점");
        restaurant121.setNumber("061-662-7339");
        restaurant121.setAddress("전남 여수시 이순신광장로 196 1층");
        restaurant121.setInfo("맛있는 음식점입니다");
        restaurant121.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240509_49%2F1715235142529qGujP_JPEG%2FKakaoTalk_20240417_181003108_29.jpg");
        restaurantRepository.save(restaurant121);

        RestaurantEntity restaurant122 = new RestaurantEntity();
        restaurant122.setFoodName("한식");
        restaurant122.setName("순이네밥상");
        restaurant122.setNumber("061-662-4883");
        restaurant122.setAddress("전남 여수시 통제영5길 5 1층 순이네밥상");
        restaurant122.setInfo("맛있는 음식점입니다");
        restaurant122.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211125_287%2F16378040731690s32l_JPEG%2FKakaoTalk_20211124_165102307_09.jpg");
        restaurantRepository.save(restaurant122);

        RestaurantEntity restaurant123 = new RestaurantEntity();
        restaurant123.setFoodName("한식");
        restaurant123.setName("초록식당");
        restaurant123.setNumber("0507-1324-5287");
        restaurant123.setAddress("전남 함평군 함평읍 중앙길 96-7");
        restaurant123.setInfo("맛있는 음식점입니다");
        restaurant123.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220322_80%2F1647915390924vRlkX_JPEG%2F20210923_163214.jpg");
        restaurantRepository.save(restaurant123);

        RestaurantEntity restaurant124 = new RestaurantEntity();
        restaurant124.setFoodName("한식");
        restaurant124.setName("꽃돌게장1번가");
        restaurant124.setNumber("061-644-0003");
        restaurant124.setAddress("전남 여수시 봉산2로 36");
        restaurant124.setInfo("맛있는 음식점입니다");
        restaurant124.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240117_280%2F1705482343103B7ulV_JPEG%2F20240117_01.jpg");
        restaurantRepository.save(restaurant124);

        RestaurantEntity restaurant125 = new RestaurantEntity();
        restaurant125.setFoodName("국밥,해장국");
        restaurant125.setName("유정해장국");
        restaurant125.setNumber("0507-1368-3606");
        restaurant125.setAddress("전남 여수시 통제영5길 8-1");
        restaurant125.setInfo("맛있는 음식점입니다");
        restaurant125.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221025_214%2F1666679846761o8eqB_JPEG%2FIMG_8690.JPG");
        restaurantRepository.save(restaurant125);

        RestaurantEntity restaurant126 = new RestaurantEntity();
        restaurant126.setFoodName("한식");
        restaurant126.setName("고서회관");
        restaurant126.setNumber("0507-1339-1489");
        restaurant126.setAddress("전남 담양군 고서면 원등1길 16-7 고서회관");
        restaurant126.setInfo("맛있는 음식점입니다");
        restaurant126.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230107_85%2F1673094866620Acpgb_JPEG%2F1673094706610.jpg");
        restaurantRepository.save(restaurant126);

        //경북-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant127 = new RestaurantEntity();
        restaurant127.setFoodName("한식");
        restaurant127.setName("경주우렁각시");
        restaurant127.setNumber("0507-1382-7875");
        restaurant127.setAddress("경북 경주시 보불로 198 경주우렁각시");
        restaurant127.setInfo("맛있는 음식점입니다");
        restaurant127.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240304_70%2F1709541257996IYyuF_JPEG%2FKakaoTalk_20240304_171921735.jpg");
        restaurantRepository.save(restaurant127);

        RestaurantEntity restaurant128 = new RestaurantEntity();
        restaurant128.setFoodName("생선,회");
        restaurant128.setName("묵돌이");
        restaurant128.setNumber("0507-1405-1962");
        restaurant128.setAddress("경북 포항시 북구 해안로 107 1층");
        restaurant128.setInfo("맛있는 음식점입니다");
        restaurant128.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230714_120%2F1689340257040s4ETX_JPEG%2FKakaoTalk_20230714_220702751_01.jpg");
        restaurantRepository.save(restaurant128);

        RestaurantEntity restaurant129 = new RestaurantEntity();
        restaurant129.setFoodName("한식");
        restaurant129.setName("향화정");
        restaurant129.setNumber("0507-1359-8765");
        restaurant129.setAddress("경북 경주시 사정로57번길 17");
        restaurant129.setInfo("맛있는 음식점입니다");
        restaurant129.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240111_143%2F170493219929532jfG_JPEG%2FKakaoTalk_20211121_171247491_03.jpg");
        restaurantRepository.save(restaurant129);

        RestaurantEntity restaurant130 = new RestaurantEntity();
        restaurant130.setFoodName("일식");
        restaurant130.setName("료미");
        restaurant130.setNumber("0507-1440-5061");
        restaurant130.setAddress("경북 경주시 포석로 1058-1 료미");
        restaurant130.setInfo("맛있는 음식점입니다");
        restaurant130.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230208_254%2F1675848962230v2i2q_JPEG%2FKakaoTalk_20230208_175205879_03.jpg");
        restaurantRepository.save(restaurant130);

        RestaurantEntity restaurant131 = new RestaurantEntity();
        restaurant131.setFoodName("일식,돈가스");
        restaurant131.setName("료코");
        restaurant131.setNumber("0507-1409-7477");
        restaurant131.setAddress("경북 경주시 첨성로99번길 24 료코");
        restaurant131.setInfo("맛있는 음식점입니다");
        restaurant131.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230602_232%2F1685679686752hj5Jm_JPEG%2FKakaoTalk_20230525_191035863.jpg");
        restaurantRepository.save(restaurant131);

        RestaurantEntity restaurant132 = new RestaurantEntity();
        restaurant132.setFoodName("한식");
        restaurant132.setName("최고집사랑하면");
        restaurant132.setNumber("0507-1381-0352");
        restaurant132.setAddress("경북 경주시 보불로 194-3");
        restaurant132.setInfo("맛있는 음식점입니다");
        restaurant132.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220302_64%2F16461980592599E3XL_JPEG%2FKakaoTalk_20220302_104854841_08.jpg");
        restaurantRepository.save(restaurant132);

        RestaurantEntity restaurant133 = new RestaurantEntity();
        restaurant133.setFoodName("고기");
        restaurant133.setName("영양숯불갈비");
        restaurant133.setNumber("054-771-2627");
        restaurant133.setAddress("경북 경주시 봉황로 79");
        restaurant133.setInfo("맛있는 음식점입니다");
        restaurant133.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20171208_239%2F1512717585755oozEV_JPEG%2Fs6a_0h5W0j7zwv1odWGi7dCH.jpg");
        restaurantRepository.save(restaurant133);

        RestaurantEntity restaurant134 = new RestaurantEntity();
        restaurant134.setFoodName("한식");
        restaurant134.setName("늘봄");
        restaurant134.setNumber("054-744-3715");
        restaurant134.setAddress("경북 경주시 보불로 107 늘봄");
        restaurant134.setInfo("맛있는 음식점입니다");
        restaurant134.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190531_280%2F1559296172436PJNNi_JPEG%2FDNSgU2jPGSU6itRvrJ4SYk-c.JPG.jpg");
        restaurantRepository.save(restaurant134);

        RestaurantEntity restaurant135 = new RestaurantEntity();
        restaurant135.setFoodName("양식,파스타");
        restaurant135.setName("시즈닝");
        restaurant135.setNumber("0507-1483-7477");
        restaurant135.setAddress("경북 경주시 첨성로99번길 25-2");
        restaurant135.setInfo("맛있는 음식점입니다");
        restaurant135.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220427_32%2F1651046117877ER7LO_JPEG%2FD3612D4F-96F0-4A54-B78E-DF57961B4590.jpeg");
        restaurantRepository.save(restaurant135);

        RestaurantEntity restaurant136 = new RestaurantEntity();
        restaurant136.setFoodName("카페디저트");
        restaurant136.setName("어마무시 본점");
        restaurant136.setNumber("0507-1355-6930");
        restaurant136.setAddress("경북 경주시 양정로 41-12 어마무시카페");
        restaurant136.setInfo("맛있는 음식점입니다");
        restaurant136.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230719_168%2F16897426561719MvBj_JPEG%2FA789983B-DA11-486E-91B1-F30714ADB3E2.jpeg");
        restaurantRepository.save(restaurant136);

        RestaurantEntity restaurant137 = new RestaurantEntity();
        restaurant137.setFoodName("생선,회,해물");
        restaurant137.setName("환여횟집");
        restaurant137.setNumber("054-251-8847");
        restaurant137.setAddress("경북 포항시 북구 해안로 189-1");
        restaurant137.setInfo("맛있는 음식점입니다");
        restaurant137.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDhfMTIy%2FMDAxNzE3ODMxMjg3NTQ3.tIzSdMRLV8Hr_MBe9QWJDsn3fGKRgHXTPGMlVxXcGXYg.CROrwuaas-ASnQTDlQJJXXipvRupnIiCQqfm6RPtkpUg.JPEG%2F10EAEE03-90C2-4C9A-8B3E-55CE1F9DF172.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant137);

        RestaurantEntity restaurant138 = new RestaurantEntity();
        restaurant138.setFoodName("한식");
        restaurant138.setName("소옥");
        restaurant138.setNumber("0507-1390-3545");
        restaurant138.setAddress("경북 경주시 포석로1050번길 29 1층");
        restaurant138.setInfo("맛있는 음식점입니다");
        restaurant138.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221017_125%2F1666003201312SnPdB_JPEG%2FE92F2B0A-DCBF-4125-B0DE-6401CBE98A69.jpeg");
        restaurantRepository.save(restaurant138);

        RestaurantEntity restaurant139 = new RestaurantEntity();
        restaurant139.setFoodName("샤브샤브,고기");
        restaurant139.setName("샤브20 본점");
        restaurant139.setNumber("0507-1430-0139");
        restaurant139.setAddress("경북 포항시 북구 법원로 7 1층 샤브20");
        restaurant139.setInfo("맛있는 음식점입니다");
        restaurant139.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210620_222%2F1624166506667kQ3bi_JPEG%2FhxGlJ-xY0fTKByoo2LJTI8bb.jpeg.jpg");
        restaurantRepository.save(restaurant139);

        RestaurantEntity restaurant140 = new RestaurantEntity();
        restaurant140.setFoodName("한식,두부");
        restaurant140.setName("기와골맷돌순두부");
        restaurant140.setNumber("054-773-2692");
        restaurant140.setAddress("경북 경주시 숲머리길 142");
        restaurant140.setInfo("맛있는 음식점입니다");
        restaurant140.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200805_233%2F1596612657950f4NX5_JPEG%2Fq-51-5D51IPOmlMhp41QYJ6G.jpg");
        restaurantRepository.save(restaurant140);

        RestaurantEntity restaurant141 = new RestaurantEntity();
        restaurant141.setFoodName("고기");
        restaurant141.setName("포갈집");
        restaurant141.setNumber("0507-1319-6519");
        restaurant141.setAddress("경북 포항시 북구 삼호로 213-1 포갈집");
        restaurant141.setInfo("맛있는 음식점입니다");
        restaurant141.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230210_27%2F1676011051217epH8J_JPEG%2FIMG_20190803_104214_685.jpg");
        restaurantRepository.save(restaurant141);

        //경남-----------------------------------------------------------------------------------------------------------
        RestaurantEntity restaurant142 = new RestaurantEntity();
        restaurant142.setFoodName("생선,회");
        restaurant142.setName("김선장참치 오마카세");
        restaurant142.setNumber("010-4886-2154");
        restaurant142.setAddress("경남 사천시 벌리2길 77 1층");
        restaurant142.setInfo("맛있는 음식점입니다");
        restaurant142.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240515_21%2F1715731600564qGBGp_JPEG%2F2222222.jpg");
        restaurantRepository.save(restaurant142);

        RestaurantEntity restaurant143 = new RestaurantEntity();
        restaurant143.setFoodName("해물,해물찜");
        restaurant143.setName("부산알찜 양산점");
        restaurant143.setNumber("0507-1362-4265");
        restaurant143.setAddress("경남 양산시 물금읍 화합10길 7 부산알찜 양산점");
        restaurant143.setInfo("맛있는 음식점입니다");
        restaurant143.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220620_34%2F1655724957391bGqBI_JPEG%2FIMG_4483.jpg");
        restaurantRepository.save(restaurant143);

        RestaurantEntity restaurant144 = new RestaurantEntity();
        restaurant144.setFoodName("한식,냉면");
        restaurant144.setName("하연옥");
        restaurant144.setNumber("055-746-0525");
        restaurant144.setAddress("경남 진주시 진주대로 1317-20");
        restaurant144.setInfo("맛있는 음식점입니다");
        restaurant144.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230629_4%2F1688049731255uO2vo_JPEG%2F3U1A4765.JPG");
        restaurantRepository.save(restaurant144);

        RestaurantEntity restaurant145 = new RestaurantEntity();
        restaurant145.setFoodName("해물,생선");
        restaurant145.setName("대풍관");
        restaurant145.setNumber("0507-1325-4446");
        restaurant145.setAddress("경남 통영시 해송정2길 29");
        restaurant145.setInfo("맛있는 음식점입니다");
        restaurant145.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210402_158%2F1617356851861Yq5Aj_JPEG%2FMR_9gsLtYJJSCulGvmTX25IG.JPG.jpg");
        restaurantRepository.save(restaurant145);

        RestaurantEntity restaurant146 = new RestaurantEntity();
        restaurant146.setFoodName("해물,해물탕");
        restaurant146.setName("어촌싱싱해물탕");
        restaurant146.setNumber("055-646-1982");
        restaurant146.setAddress("경남 통영시 도천동 1008");
        restaurant146.setInfo("맛있는 음식점입니다");
        restaurant146.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220704_97%2F16569148257628SQSf_JPEG%2F20220702_144315.jpg");
        restaurantRepository.save(restaurant146);

        RestaurantEntity restaurant147 = new RestaurantEntity();
        restaurant147.setFoodName("한식");
        restaurant147.setName("통영가");
        restaurant147.setNumber("0507-1426-0189");
        restaurant147.setAddress("경남 통영시 동충1길 12-5");
        restaurant147.setInfo("맛있는 음식점입니다");
        restaurant147.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230713_172%2F1689231948429NKPEn_JPEG%2FKakaoTalk_20230712_175043791_01.jpg");
        restaurantRepository.save(restaurant147);

        RestaurantEntity restaurant148 = new RestaurantEntity();
        restaurant148.setFoodName("양식");
        restaurant148.setName("부어스트라덴");
        restaurant148.setNumber("055-867-6550");
        restaurant148.setAddress("경남 남해군 삼동면 독일로 33 2동");
        restaurant148.setInfo("맛있는 음식점입니다");
        restaurant148.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220810_66%2F1660133713505KTfYT_JPEG%2FIMG1532.JPG");
        restaurantRepository.save(restaurant148);

        RestaurantEntity restaurant149 = new RestaurantEntity();
        restaurant149.setFoodName("한식");
        restaurant149.setName("대박난맛집 거제 학동점");
        restaurant149.setNumber("0507-1438-0121");
        restaurant149.setAddress("경남 거제시 동부면 거제대로 910");
        restaurant149.setInfo("맛있는 음식점입니다");
        restaurant149.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230602_222%2F1685669014238r0FXq_JPEG%2FDSZ_5476.JPG");
        restaurantRepository.save(restaurant149);

        RestaurantEntity restaurant150 = new RestaurantEntity();
        restaurant150.setFoodName("국수");
        restaurant150.setName("배말칼국수김밥 본점");
        restaurant150.setNumber("0507-1417-6067");
        restaurant150.setAddress("경남 거제시 장승포로 2");
        restaurant150.setInfo("맛있는 음식점입니다");
        restaurant150.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210818_128%2F1629287466609O7lQP_JPEG%2FED-CoLcOYTWDZk7TBCAECTZA.jpg");
        restaurantRepository.save(restaurant150);

        RestaurantEntity restaurant151 = new RestaurantEntity();
        restaurant151.setFoodName("중식");
        restaurant151.setName("심가네해물짬뽕");
        restaurant151.setNumber("0507-1352-8215");
        restaurant151.setAddress("경남 통영시 새터길 74-4 심가네해물짬뽕");
        restaurant151.setInfo("맛있는 음식점입니다");
        restaurant151.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230628_58%2F1687918452842Dd3Ba_JPEG%2FDSZ_1990.JPG");
        restaurantRepository.save(restaurant151);

        RestaurantEntity restaurant152 = new RestaurantEntity();
        restaurant152.setFoodName("한식");
        restaurant152.setName("대월 통영죽림본점");
        restaurant152.setNumber("0507-1352-7738");
        restaurant152.setAddress("경남 통영시 광도면 죽림5로 25-6");
        restaurant152.setInfo("맛있는 음식점입니다");
        restaurant152.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200723_95%2F1595491069284zrbDF_JPEG%2FkHZy4CVZEEAInUTJ2qcKnsxn.JPG.jpg");
        restaurantRepository.save(restaurant152);

        RestaurantEntity restaurant153 = new RestaurantEntity();
        restaurant153.setFoodName("한식");
        restaurant153.setName("천황식당");
        restaurant153.setNumber("055-741-2646");
        restaurant153.setAddress("경남 진주시 촉석로207번길 3");
        restaurant153.setInfo("맛있는 음식점입니다");
        restaurant153.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MDNfODQg%2FMDAxNzE3NDA1MDg5NjU3.DqtJgcqZ3YnYO5YUc9pwWygxNT0aIHeYuU7NLpp9Hk0g.GOt-mgWvdTrpHcgID3bq8kNehAn4qHrT9PIG6-2Xpjog.JPEG%2F1697062E-4F58-40B1-96B5-FB5B565F005B.jpeg%3Ftype%3Dw1500_60_sharpen");
        restaurantRepository.save(restaurant153);

        RestaurantEntity restaurant154 = new RestaurantEntity();
        restaurant154.setFoodName("한식");
        restaurant154.setName("남해향촌");
        restaurant154.setNumber("0507-1388-7807");
        restaurant154.setAddress("경남 남해군 삼동면 동부대로 1278");
        restaurant154.setInfo("맛있는 음식점입니다");
        restaurant154.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220721_57%2F16583820582762PFqt_JPEG%2FKakaoTalk_20220721_144017361_01.jpg");
        restaurantRepository.save(restaurant154);

        RestaurantEntity restaurant155 = new RestaurantEntity();
        restaurant155.setFoodName("고기");
        restaurant155.setName("금산골 진주혁신도시 본점");
        restaurant155.setNumber("0507-1404-6201");
        restaurant155.setAddress("경남 진주시 충의로 20-22 2층 금산골 진주혁신도시 본점");
        restaurant155.setInfo("맛있는 음식점입니다");
        restaurant155.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231218_22%2F1702909090967Cf9bS_JPEG%2F%25B0%25F6%25C3%25A2%25B1%25B8%25C0%25CC%252B%25B0%25F6%25C3%25A2%25C0%25FC%25B0%25F1_5%25BF%25F915%25C0%25CF_%25287%2529.jpg");
        restaurantRepository.save(restaurant155);

        RestaurantEntity restaurant156 = new RestaurantEntity();
        restaurant156.setFoodName("냉면");
        restaurant156.setName("하면옥");
        restaurant156.setNumber("0507-1415-1242");
        restaurant156.setAddress("경남 거제시 연초면 연하해안로 320");
        restaurant156.setInfo("맛있는 음식점입니다");
        restaurant156.setImage("https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230405_10%2F1680664269715BYChf_JPEG%2F1478758354749.jpg");
        restaurantRepository.save(restaurant156);
    }
}
