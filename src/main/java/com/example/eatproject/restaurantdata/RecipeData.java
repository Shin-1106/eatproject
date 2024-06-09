//음식점 정보를 DB에 저장하는 클래스
// 현재는 단순히 초기 데이터를 저장하기 위해 CommandLineRunner를 사용하여 DB에 초기 데이터를 저장
package com.example.eatproject.restaurantdata;

import com.example.eatproject.entity.RecipeEntity;
import com.example.eatproject.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RecipeData implements CommandLineRunner {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public void run(String... args) throws Exception {

        RecipeEntity recipe1 = new RecipeEntity();
        recipe1.setFoodName("크림 스파게티");
        recipe1.setCalories("400");
        recipe1.setRecipe("1.재료 손질 2.면 삶음 3.스파게티 요리");
        recipe1.setIngredients("파스타 면, 고기, 토마토 소스, 베이컨, 양파, 버섯, 다진마늘, 우유, 생크림");
        recipe1.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/11/19/7e815793fae78fdb36b2b65b31e6dfa61.jpg");
        recipeRepository.save(recipe1);

        RecipeEntity recipe2 = new RecipeEntity();
        recipe2.setFoodName("스팸 김치볶음밥");
        recipe2.setCalories("400");
        recipe2.setRecipe("1.파, 김치, 스팸을 잘라서 재료를 준비 2.파기름을 내준다 3.볶아먹는다");
        recipe2.setIngredients("김치, 스팸, 대파, 계란, 간장, 고춧가루, 통깨");
        recipe2.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2022/02/08/8288bc11431681ee92d68d252fe7dd8f1.jpg");
        recipeRepository.save(recipe2);

        RecipeEntity recipe3 = new RecipeEntity();
        recipe3.setFoodName("간장찜닭");
        recipe3.setCalories("400");
        recipe3.setRecipe("1.재료 손질 2.닭 삶기 3.찜닭 조리");
        recipe3.setIngredients("닭, 감자, 양파, 당근, 간장, 설탕, 맛술, 다진마늘, 참기름, 물");
        recipe3.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/08/04/72d73bfa3ee001008922aa11c60977931.jpg");
        recipeRepository.save(recipe3);

        RecipeEntity recipe4 = new RecipeEntity();
        recipe4.setFoodName("간장계란밥");
        recipe4.setCalories("400");
        recipe4.setRecipe("1.계란 조리 2.간장, 참기름 넣기 3.볶기");
        recipe4.setIngredients("파스타 면, 고기, 토마토 소스");
        recipe4.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/09/06/115b2b934fd77085518877677d1266fa1.jpg");
        recipeRepository.save(recipe4);

        RecipeEntity recipe5 = new RecipeEntity();
        recipe5.setFoodName("치킨마요덮밥");
        recipe5.setCalories("400");
        recipe5.setRecipe("1.재료 손질 2.요리");
        recipe5.setIngredients("닭가슴살, 양파, 달걀, 밥, 다진마늘, 청주, 소금, 후추, 간장, 올리고당, 맛술, 마요네즈, 쪽파");
        recipe5.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/09/01/0a4c6436795e8547f2ae0c66b1066f551.png");
        recipeRepository.save(recipe5);

        RecipeEntity recipe6 = new RecipeEntity();
        recipe6.setFoodName("고추장 참치볶음밥");
        recipe6.setCalories("400");
        recipe6.setRecipe("1. 후라이팬에 기름을 두르고 계란후라이를 만든다. 2. 같은 팬에 마늘과 파를 넣고 볶아 파기름을 낸다. 3. 참치와 간장을 넣고 볶는다. 4. 고추장을 넣고 잘 섞는다. 5. 찬밥을 넣고 비벼준다. 6. 참기름을 넣고 한 번 더 볶는다. 7. 김가루와 깨를 뿌린다.");
        recipe6.setIngredients("달걀, 다진파, 다진마늘, 참치캔, 간장, 고추장, 참기름, 찬밥, 김가루, 깨");
        recipe6.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/02/14/d57a00198311cae85f1db8ed7580e0a51.jpg");
        recipeRepository.save(recipe6);


        RecipeEntity recipe7 = new RecipeEntity();
        recipe7.setFoodName("불고기 덮밥");
        recipe7.setCalories("600");
        recipe7.setRecipe("1. 소불고기에 양념장을 버무려 팬에 볶는다. 2. 양파를 채 썰고 쪽파를 한입 크기로 자른다. 3. 계란물을 풀어준다. 4. 청고추와 홍고추를 가늘게 채 썬다. 5. 팽이버섯을 먹기 좋은 크기로 자른다. 6. 채소들을 각각 볶아 불고기에 섞고, 계란물을 밥에 올려 통깨를 뿌린다.");
        recipe7.setIngredients("소불고기, 양파, 청고추, 홍고추, 팽이버섯, 계란, 쪽파, 마늘기름, 통깨, 맛간장, 생강청, 다진마늘, 다진대파, 흰후추, 참기름, 쌀밥");
        recipe7.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2022/11/22/c80d18251b6b1c291c17b085d7beddc71.png");
        recipeRepository.save(recipe7);


        RecipeEntity recipe8 = new RecipeEntity();
        recipe8.setFoodName("참치마요 덮밥");
        recipe8.setCalories("450");
        recipe8.setRecipe("1. 양파를 채 썰고 다진 양파 1T도 준비합니다. 2. 다진 양파, 마요네즈, 참치를 섞어 참치마요를 만듭니다. 3. 팬에 간장, 올리고당, 맛술을 넣고 끓이다가 양파를 넣어 볶습니다. 4. 달걀 스크램블을 만듭니다. 5. 밥 위에 스크램블, 양파, 참치마요, 파, 마요네즈, 김가루를 올려 완성합니다.");
        recipe8.setIngredients("밥, 달걀, 참치캔, 마요네즈, 다진양파, 양파, 맛술, 간장, 올리고당, 쪽파, 김가루");
        recipe8.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/11/09/577f07d2a67736a0df97f8f5c95d26f01.jpg");
        recipeRepository.save(recipe8);


        RecipeEntity recipe9 = new RecipeEntity();
        recipe9.setFoodName("제육덮밥");
        recipe9.setCalories("600");
        recipe9.setRecipe("1. 돼지고기를 양념에 재운다. 2. 팬에 파기름을 내고 돼지고기를 볶는다. 3. 양파와 물을 넣고 끓인다. 4. 물이 졸아들 때까지 볶는다. 5. 대파를 넣고 한 번 더 볶는다. 6. 반숙 계란후라이를 올린다. 7. 참기름과 참깨를 뿌려 완성한다.");
        recipe9.setIngredients("돼지고기, 양파, 대파, 고춧가루, 고추장, 간장, 설탕, 굴소스, 미림, 다진마늘, 후추, 계란, 참기름");
        recipe9.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/01/16/49e882e489e60509c6ce39aaff44bced1.jpg");
        recipeRepository.save(recipe9);


        RecipeEntity recipe10 = new RecipeEntity();
        recipe10.setFoodName("달걀볶음밥");
        recipe10.setCalories("400");
        recipe10.setRecipe("1. 재료 준비: 새송이버섯, 애호박, 당근, 대파를 썬다. 2. 밥과 달걀을 섞어둔다. 3. 팬에 파기름을 낸다. 4. 당근, 애호박, 새송이버섯을 볶는다. 5. 달걀밥을 넣고 볶는다. 6. 간장, 소금, 후추, 참기름으로 간을 맞춘다.");
        recipe10.setIngredients("밥, 달걀, 새송이버섯, 애호박, 당근, 대파, 간장, 소금, 후추, 참기름");
        recipe10.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/07/03/03f3b5163a4d944bcb1b6a1468e482e41.jpg");
        recipeRepository.save(recipe10);


        RecipeEntity recipe11 = new RecipeEntity();
        recipe11.setFoodName("버섯 리조또");
        recipe11.setCalories("500");
        recipe11.setRecipe("1. 쌀을 씻어 불린다. 2. 버섯과 양파를 잘게 썬다. 3. 팬에 버터와 올리브오일을 두르고 양파를 볶는다. 4. 버섯을 넣고 볶는다. 5. 불린 쌀을 넣고 투명해질 때까지 볶는다. 6. 육수를 조금씩 부어가며 쌀이 익을 때까지 저어준다. 7. 우유를 넣고 섞는다. 8. 파마산 치즈가루를 넣고 섞는다. 9. 소금과 후추로 간을 맞춘다.");
        recipe11.setIngredients("쌀, 표고버섯, 새송이버섯, 양파, 버터, 올리브오일, 멸치다시마새우육수, 우유, 파마산치즈가루, 소금, 후춧가루");
        recipe11.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/03/22/4c3eee4dc4e2628b1fd3dae255c32fe31.jpg");
        recipeRepository.save(recipe11);


        RecipeEntity recipe12 = new RecipeEntity();
        recipe12.setFoodName("닭고기 오므라이스");
        recipe12.setCalories("550");
        recipe12.setRecipe("1. 대파, 양파, 당근을 잘게 다진다. 2. 닭고기는 큼직하게 썰어 소금, 후추로 밑간한다. 3. 달걀을 풀어 체에 걸러준 뒤, 소금과 후추, 우유를 넣고 섞는다. 4. 팬에 기름을 두르고 대파, 양파, 당근, 닭고기를 볶는다. 5. 밥, 굴소스, 케첩을 넣어 볶아준다. 6. 팬에 달걀물을 부어 반숙으로 익힌 뒤, 볶음밥을 덮어 모양을 잡는다.");
        recipe12.setIngredients("닭가슴살, 밥, 대파, 당근, 양파, 달걀, 케첩, 굴소스, 우유, 소금, 후추, 식용유");
        recipe12.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2022/07/25/1efe85d4a277ea4e1ad7ca2a57786eb91.jpg");
        recipeRepository.save(recipe12);


        RecipeEntity recipe13 = new RecipeEntity();
        recipe13.setFoodName("소고기 야채 볶음밥");
        recipe13.setCalories("500");
        recipe13.setRecipe("1. 소고기에 미향을 넣고 섞어준다. 2. 야채를 다지듯 썰어준다. 3. 팬에 식용유를 두르고 고기와 야채를 볶는다. 4. 밥과 마늘콩소스, 양념장을 넣고 볶아준다.");
        recipe13.setIngredients("소고기, 밥, 당근, 양파, 새송이버섯, 애호박, 간장, 식초, 설탕, 고추가루, 통깨, 마늘콩소스");
        recipe13.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2020/10/23/bcdfc2d06983274f8dfb662f3a6b26df1.jpg");
        recipeRepository.save(recipe13);


        RecipeEntity recipe14 = new RecipeEntity();
        recipe14.setFoodName("마가린밥");
        recipe14.setCalories("350");
        recipe14.setRecipe("1. 금방 지은 따뜻한 밥에 마가린을 한 숟가락 올린다. 2. 계란 노른자를 밥 위에 올린다. 3. 통깨와 참기름을 뿌린다. 4. 간장을 취향에 맞게 넣어 비벼서 먹는다.");
        recipe14.setIngredients("밥, 마가린, 계란, 통깨, 참기름, 간장");
        recipe14.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/08/12/fb526c3eae82c5b866db44c98a21e2ba1.jpg");
        recipeRepository.save(recipe14);


        RecipeEntity recipe15 = new RecipeEntity();
        recipe15.setFoodName("베이컨 김치볶음밥");
        recipe15.setCalories("500");
        recipe15.setRecipe("1. 김치, 대파, 베이컨을 잘게 썬다. 2. 팬에 식용유를 두르고 대파를 볶아 파기름을 만든다. 3. 베이컨을 넣고 노릇하게 볶는다. 4. 간장을 팬 가장자리에 둘러 넣고 김치를 넣어 함께 볶는다. 5. 고춧가루를 넣고 김치가 익을 때까지 볶는다. 6. 밥을 넣고 잘 비벼준다. 7. 계란을 풀어 밥 주변에 부어 익히고 피자치즈를 올려 완성한다.");
        recipe15.setIngredients("베이컨, 김치, 대파, 간장, 고춧가루, 밥, 달걀, 피자치즈");
        recipe15.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/04/25/495640f390be8edbe6c8a92b2c3238891.jpg");
        recipeRepository.save(recipe15);


        RecipeEntity recipe16 = new RecipeEntity();
        recipe16.setFoodName("후라이드 치킨");
        recipe16.setCalories("600");
        recipe16.setRecipe("1. 닭을 깨끗이 씻어 우유에 후추와 소금을 넣고 30분 재운다. 2. 튀김가루를 준비하여 닭에 고루 묻힌다. 3. 팬에 기름을 두르고 닭을 8분간 튀긴다. 4. 기름을 빼고 두 번째 튀김도 8분간 튀긴다.");
        recipe16.setIngredients("닭, 우유, 소금, 후추, 튀김가루, 식용유");
        recipe16.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/09/06/1d11461183e39e0a816857234bae24d41.jpg");
        recipeRepository.save(recipe16);


        RecipeEntity recipe17 = new RecipeEntity();
        recipe17.setFoodName("양념치킨");
        recipe17.setCalories("650");
        recipe17.setRecipe("1. 냄비에 고춧가루, 설탕, 간장, 물, 물엿, 케첩, 다진 마늘, 고추장을 넣고 끓인다. 2. 보글보글 끓으면 불을 끄고 식힌 후 병에 보관한다. 3. 닭을 튀긴 후 양념 소스를 발라준다.");
        recipe17.setIngredients("고춧가루, 설탕, 간장, 물, 물엿, 케첩, 다진 마늘, 고추장, 닭고기");
        recipe17.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/01/30/2693168c7a4abca9ea418d1dc466eb4c1.jpg");
        recipeRepository.save(recipe17);


        RecipeEntity recipe18 = new RecipeEntity();
        recipe18.setFoodName("교촌 간장 양념치킨");
        recipe18.setCalories("550");
        recipe18.setRecipe("1. 닭 날개를 씻어 물기를 제거합니다. 2. 닭 날개에 전분가루를 묻힙니다. 3. 식용유를 두르고 닭 날개를 튀깁니다. 4. 팬에 간장과 꿀을 넣어 양념을 조립니다. 5. 닭 날개를 양념에 넣어 골고루 묻혀줍니다.");
        recipe18.setIngredients("닭 날개, 전분가루, 식용유, 진간장, 꿀");
        recipe18.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/11/05/c4d779d37826aca82a44df01b3d4131c1.jpg");
        recipeRepository.save(recipe18);


        RecipeEntity recipe19 = new RecipeEntity();
        recipe19.setFoodName("파닭");
        recipe19.setCalories("500");
        recipe19.setRecipe("1. 닭다리살에 소금, 청주, 후추를 뿌려 밑간한 후 물기를 제거한다. 2. 전분을 골고루 입혀 10분 정도 두었다가 예열된 기름에 바삭하게 튀긴다. 3. 대파를 채썰고 소스 재료를 섞어 튀긴 닭 위에 대파와 홍고추를 올린 후 간장 소스를 뿌려 완성한다.");
        recipe19.setIngredients("닭다리살, 전분, 튀김용기름, 대파, 소금, 후추, 청주, 진간장, 레몬즙, 식초, 설탕, 청고추, 홍고추");
        recipe19.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/06/08/dc6dcd24506cc034c6b20a66bd4aea5f.jpg");
        recipeRepository.save(recipe19);


        RecipeEntity recipe20 = new RecipeEntity();
        recipe20.setFoodName("에어프라이어 치킨");
        recipe20.setCalories("450");
        recipe20.setRecipe("1. 닭 다리와 날개를 씻어 물기를 제거한다. 2. 넓은 볼에 다진 마늘, 카레 가루, 맛술, 올리브오일, 허브솔트를 넣고 닭을 양념하여 1시간 동안 재운다. 3. 에어프라이어에 양념한 닭을 넣고 200도에서 15분간 굽는다. 4. 뒤집어 200도에서 다시 15분간 구워 완성한다.");
        recipe20.setIngredients("닭 다리, 닭 날개, 다진 마늘, 카레 가루, 맛술, 올리브오일, 허브솔트");
        recipe20.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/05/05/d08544b2a4326e5c0c670d0d39f02eef1.jpg");
        recipeRepository.save(recipe20);


        RecipeEntity recipe21 = new RecipeEntity();
        recipe21.setFoodName("고추바사삭 치킨");
        recipe21.setCalories("450");
        recipe21.setRecipe("1. 닭봉과 닭날개에 허브솔트를 뿌려 재운다. 2. 비닐봉지에 튀김가루, 빵가루, 카레가루, 고춧가루, 파슬리, 다진 청양고추를 넣고 섞는다. 3. 양념한 닭을 비닐봉지에 넣고 흔들어 섞는다. 4. 오븐에서 185도로 20분 굽고 뒤집어 20분 더 굽는다.");
        recipe21.setIngredients("닭봉, 닭날개, 튀김가루, 빵가루, 카레가루, 고춧가루, 파슬리, 다진 청양고추, 허브솔트");
        recipe21.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/06/06/12cbab5b9dbb7d4efaea5bc38b0a75a61.jpg");
        recipeRepository.save(recipe21);


        RecipeEntity recipe22 = new RecipeEntity();
        recipe22.setFoodName("사천 오렌지 마멀레이드 치킨");
        recipe22.setCalories("500");
        recipe22.setRecipe("1. 에어프라이어에 치킨윙을 160도로 굽는다. 2. 쪽파, 쥐똥고추, 다진 생강을 볶는다. 3. 구운 치킨윙을 넣고 볶은 후 후추를 뿌린다. 4. 오렌지 마멀레이드 소스를 넣고 졸인다. 5. 걸쭉한 소스로 치킨윙을 코팅한다.");
        recipe22.setIngredients("치킨윙, 쪽파, 쥐똥고추, 다진 생강, 오렌지 마멀레이드, 후추, 황설탕, 미림, 양파 가루, 마늘 가루, 사과식초, 소금, 굴소스, 물");
        recipe22.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/11/11/4c23c4f03e80ed4cd99c4cb8700647331.jpg");
        recipeRepository.save(recipe22);


        RecipeEntity recipe23 = new RecipeEntity();
        recipe23.setFoodName("파마산 치킨");
        recipe23.setCalories("500");
        recipe23.setRecipe("1. 닭가슴살을 반으로 저며 준다. 2. 비닐팩으로 덮은 후 팬으로 쳐서 펴준다. 3. 소금과 후추를 앞뒤로 뿌려준다. 4. 닭가슴살에 체다 치즈를 넣고 덮어준다. 5. 밀가루, 달걀, 빵가루, 파마산 치즈가루를 순서대로 발라준다. 6. 기름에 7분가량 튀겨준다. 7. 칠리소스를 곁들여 먹는다.");
        recipe23.setIngredients("닭가슴살, 소금, 후추, 체다 치즈, 밀가루, 달걀, 빵가루, 파마산 치즈가루, 칠리소스");
        recipe23.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/07/31/66445c61ed1b8510264a71e469f202bd1.png");
        recipeRepository.save(recipe23);


        RecipeEntity recipe24 = new RecipeEntity();
        recipe24.setFoodName("캐슈넛 발사믹치킨");
        recipe24.setCalories("550");
        recipe24.setRecipe("1. 닭다리를 소금, 후추, 향신즙으로 2시간 밑간한 후 전자레인지에서 10분 익힌다. 2. 익힌 닭다리에 녹말가루를 묻히고 약한 불에서 노릇하게 구운 후, 진간장, 발사믹 식초, 조청, 설탕, 핫소스, 청주, 후춧가루로 만든 소스에 버무린다. 3. 캐슈넛 다진 것을 넣고 걸쭉하게 만든 후, 소스가 골고루 스며들도록 한다.");
        recipe24.setIngredients("닭다리, 캐슈넛, 녹말가루, 향신즙, 소금, 후춧가루, 진간장, 발사믹 식초, 청주, 식용유, 조청, 설탕, 다진 마늘, 핫소스");
        recipe24.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/06/08/148c5099554d740fc75d2a860af7b751.jpg");
        recipeRepository.save(recipe24);


        RecipeEntity recipe25 = new RecipeEntity();
        recipe25.setFoodName("매콤고소 투움바 치킨");
        recipe25.setCalories("600");
        recipe25.setRecipe("1. 닭다리살을 먹기 좋은 크기로 손질하고 소금, 후추로 밑간한다. 2. 치킨가루와 물을 섞어 반죽을 만든 후 닭다리살에 반죽옷을 입힌다. 3. 170도로 예열된 기름에 떡을 튀긴다. 4. 180도로 예열된 기름에 닭을 두 번 튀긴다. 5. 냄비에 투움바 소스를 넣고 약불로 끓인다. 6. 소스에 튀긴 닭과 떡을 넣어 버무린다.");
        recipe25.setIngredients("닭다리살, 소금, 후추, 치킨가루, 떡, 크림 스파게티 소스, 체다치즈, 다진마늘, 핫소스, 페퍼론치노, 스리라차 소스");
        recipe25.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2021/08/23/54dccd360f2b28a7b1b9be4eb61022f91.jpg");
        recipeRepository.save(recipe25);


        RecipeEntity recipe26 = new RecipeEntity();
        recipe26.setFoodName("자메이카 저크치킨");
        recipe26.setCalories("700");
        recipe26.setRecipe("1. 모든 향신료를 분쇄기나 믹서에 넣고 곱게 간다. 2. 분쇄한 향신료에 수분재료를 넣고 잘 섞는다. 3. 닭을 깨끗이 씻어 손질한다. 4. 닭에 소스를 부어 주물러 준다. 5. 팬에 식용유를 두르고 닭을 굽는다. 6. 물을 부어 끓인 후 에어프라이어에 넣고 굽는다.");
        recipe26.setIngredients("닭고기, 건고추, 주니퍼베리, 후추, 큐민가루, 펜넬, 계피가루, 월계수잎, 파프리카가루, 정향, 레몬껍질, 소금, 올리고당, 머스타드, 레몬, 식용유, 물");
        recipe26.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/04/28/fa1ba965d3ec14dafa97067c692130941.jpg");
        recipeRepository.save(recipe26);


        RecipeEntity recipe27 = new RecipeEntity();
        recipe27.setFoodName("고구마치킨강정");
        recipe27.setCalories("500");
        recipe27.setRecipe("1. 고구마는 껍질을 벗겨 먹기 좋은 크기로 썬다. 2. 닭안심도 고구마와 비슷한 크기로 썬다. 3. 닭안심에 소금과 후추로 밑간하고 녹말가루를 입힌다. 4. 고구마도 같은 방법으로 녹말가루를 입힌다. 5. 팬에 식용유를 두르고 고구마를 노릇노릇하게 튀긴다. 6. 닭고기도 튀긴다. 7. 팬에 물, 다진 마늘, 케첩, 올리고당, 설탕, 간장, 미림을 넣고 끓여 소스를 만든다. 8. 튀긴 고구마와 닭고기를 소스에 버무린다.");
        recipe27.setIngredients("닭안심, 고구마, 녹말가루, 식용유, 케첩, 미림, 간장, 올리고당, 설탕, 다진 마늘, 물, 소금, 후추");
        recipe27.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/01/20/cebce50323c3d5316185de52efe0f8dc1.jpg");
        recipeRepository.save(recipe27);


        RecipeEntity recipe28 = new RecipeEntity();
        recipe28.setFoodName("닭가슴살 치킨(콜팝)");
        recipe28.setCalories("350");
        recipe28.setRecipe("1. 닭가슴살을 깍둑썰기 하고, 카레가루, 파슬리, 소금, 후추로 밑간하여 10분간 냉장고에서 숙성시킨다. 2. 닭가슴살에 계란 흰자, 밀가루, 전분을 넣어 반죽한다. 3. 팬에 기름을 두르고 닭가슴살을 노릇하게 튀긴다. 4. 고추장, 간장, 설탕, 다진 마늘, 올리고당, 간 양파를 넣고 끓여 양념 소스를 만든다. 5. 튀긴 닭가슴살에 양념 소스를 발라 콜팝 스타일로 완성한다.");
        recipe28.setIngredients("닭가슴살, 카레가루, 파슬리, 소금, 후추, 계란 흰자, 밀가루, 전분, 고추장, 간장, 설탕, 다진 마늘, 올리고당, 간 양파");
        recipe28.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/03/19/3aa7396afd663770899aa6af6c02c7a81.jpg");
        recipeRepository.save(recipe28);


        RecipeEntity recipe29 = new RecipeEntity();
        recipe29.setFoodName("닭가슴살 닭갈비");
        recipe29.setCalories("400");
        recipe29.setRecipe("1. 닭가슴살을 해동하고 두툼하게 채 썬다. 2. 대파, 당근, 양파, 양배추를 손질하여 썬다. 3. 닭가슴살을 양념장(다진 마늘, 고추장, 설탕, 간장, 고춧가루, 맛술, 후춧가루)에 버무린다. 4. 팬에 기름을 두르고 대파를 볶다가 준비한 야채와 닭가슴살을 넣고 볶는다. 5. 양념장에 물을 추가해 볶는다. 6. 닭가슴살이 익으면 완성.");
        recipe29.setIngredients("닭가슴살, 대파, 당근, 양파, 양배추, 다진 마늘, 고추장, 설탕, 간장, 고춧가루, 맛술, 후춧가루");
        recipe29.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/01/31/7d3c93bd5464755bfba99b84fddf69481.jpg");
        recipeRepository.save(recipe29);


        RecipeEntity recipe30 = new RecipeEntity();
        recipe30.setFoodName("닭불고기");
        recipe30.setCalories("450");
        recipe30.setRecipe("1. 닭 가슴살을 먹기 좋은 크기로 자른다. 2. 양념장(고추장, 고춧가루, 다진 마늘, 설탕, 맛술, 참기름, 매실액, 후춧가루)에 닭고기를 넣고 30분간 재운다. 3. 팬에 기름을 두르고 감자, 양파, 양배추를 볶다가 재운 닭고기를 넣어 함께 볶는다. 4. 감자가 익으면 완성.");
        recipe30.setIngredients("닭 가슴살, 감자, 양파, 양배추, 고추장, 고춧가루, 다진 마늘, 설탕, 맛술, 참기름, 매실액, 후춧가루");
        recipe30.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/03/18/29456bd485da03aa5a4b75cf3ec792f81.jpg");
        recipeRepository.save(recipe30);


        RecipeEntity recipe31 = new RecipeEntity();
        recipe31.setFoodName("크림 파스타");
        recipe31.setCalories("600");
        recipe31.setRecipe("1. 베이컨과 양파를 썰어 팬에 볶는다. 2. 생크림과 우유를 넣고 끓인다. 3. 파스타 면을 삶아 소스에 넣고 섞는다. 4. 파마산 치즈와 고추가루를 뿌려 완성한다.");
        recipe31.setIngredients("파스타 면, 베이컨, 양파, 생크림, 우유, 파마산 치즈, 고추가루");
        recipe31.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/06/26/b96fd7dfa05a0614bffe4f3dca4266101.jpg");
        recipeRepository.save(recipe31);


        RecipeEntity recipe32 = new RecipeEntity();
        recipe32.setFoodName("토마토 해산물 파스타");
        recipe32.setCalories("500");
        recipe32.setRecipe("1. 해산물을 손질하고 마늘을 다진다. 2. 팬에 올리브오일을 두르고 마늘을 볶는다. 3. 해산물과 토마토 소스를 넣고 끓인다. 4. 삶은 파스타 면을 넣고 섞는다. 5. 파슬리를 뿌려 완성한다.");
        recipe32.setIngredients("파스타 면, 새우, 오징어, 토마토 소스, 마늘, 올리브오일, 파슬리");
        recipe32.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/10/19/91bf0371b947f660c407daac3d5bd7c81.jpg");
        recipeRepository.save(recipe32);


        RecipeEntity recipe33 = new RecipeEntity();
        recipe33.setFoodName("고추장 크림 파스타");
        recipe33.setCalories("550");
        recipe33.setRecipe("1. 양파와 표고버섯을 채썬다. 2. 냉동 새우를 해동하여 꼬리를 제거한다. 3. 물에 소금을 넣고 파스타 면을 삶는다. 4. 팬에 기름을 두르고 다진 마늘을 볶는다. 5. 양파와 새우를 넣고 맛술을 넣어 볶는다. 6. 표고버섯을 넣고 볶다가 우유와 고추장을 넣어 끓인다. 7. 삶은 면을 넣고 섞는다. 8. 청양고추를 썰어 마무리한다.");
        recipe33.setIngredients("파스타 면, 양파, 표고버섯, 청양고추, 새우, 다진 마늘, 우유, 고추장, 소금, 후추, 맛술");
        recipe33.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/10/11/ba81a02a0c27a2de8f7d52bca423631a1.jpg");
        recipeRepository.save(recipe33);


        RecipeEntity recipe34 = new RecipeEntity();
        recipe34.setFoodName("알리오 올리오");
        recipe34.setCalories("450");
        recipe34.setRecipe("1. 마늘을 얇게 썰고 올리브오일에 볶는다. 2. 페퍼론치노를 넣고 볶는다. 3. 삶은 파스타 면을 넣고 섞는다. 4. 소금과 후추로 간을 맞춘다. 5. 파슬리를 뿌려 완성한다.");
        recipe34.setIngredients("파스타 면, 마늘, 올리브오일, 페퍼론치노, 소금, 후추, 파슬리");
        recipe34.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/11/08/97036ac88ce129511c859b6005f86aef1.jpg");
        recipeRepository.save(recipe34);


        RecipeEntity recipe35 = new RecipeEntity();
        recipe35.setFoodName("크림 새우 파스타");
        recipe35.setCalories("600");
        recipe35.setRecipe("1. 새우를 손질하고 마늘을 다진다. 2. 팬에 올리브오일을 두르고 마늘을 볶는다. 3. 생크림과 우유를 넣고 끓인다. 4. 삶은 파스타 면과 새우를 넣고 섞는다. 5. 파마산 치즈를 뿌려 완성한다.");
        recipe35.setIngredients("파스타 면, 새우, 마늘, 생크림, 우유, 파마산 치즈, 올리브오일");
        recipe35.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/06/16/ac11e267578a0bbd6a94c76765ebf8071.jpg");
        recipeRepository.save(recipe35);


        RecipeEntity recipe36 = new RecipeEntity();
        recipe36.setFoodName("까르보나라");
        recipe36.setCalories("700");
        recipe36.setRecipe("1. 베이컨을 잘게 썰어 팬에 볶는다. 2. 달걀 노른자와 생크림을 섞는다. 3. 삶은 파스타 면과 베이컨을 섞는다. 4. 달걀과 생크림 소스를 넣고 섞는다. 5. 파마산 치즈와 후추를 뿌려 완성한다.");
        recipe36.setIngredients("파스타 면, 베이컨, 달걀 노른자, 생크림, 파마산 치즈, 후추");
        recipe36.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/06/24/e2b5b4dd308edb1a3847afcfacb37257.jpg");
        recipeRepository.save(recipe36);


        RecipeEntity recipe37 = new RecipeEntity();
        recipe37.setFoodName("봉골레 파스타");
        recipe37.setCalories("500");
        recipe37.setRecipe("1. 바지락을 해감한다. 2. 마늘을 다지고 올리브오일에 볶는다. 3. 바지락과 화이트 와인을 넣고 끓인다. 4. 삶은 파스타 면을 넣고 섞는다. 5. 파슬리를 뿌려 완성한다.");
        recipe37.setIngredients("파스타 면, 바지락, 마늘, 올리브오일, 화이트 와인, 파슬리");
        recipe37.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/03/14/4846d37440577107d990b5fa0292cb961.jpg");
        recipeRepository.save(recipe37);


        RecipeEntity recipe38 = new RecipeEntity();
        recipe38.setFoodName("라구 파스타");
        recipe38.setCalories("650");
        recipe38.setRecipe("1. 다진 소고기와 돼지고기를 팬에 볶는다. 2. 양파, 당근, 셀러리를 다져서 함께 볶는다. 3. 토마토 소스와 레드 와인을 넣고 끓인다. 4. 삶은 파스타 면을 넣고 섞는다. 5. 파마산 치즈를 뿌려 완성한다.");
        recipe38.setIngredients("파스타 면, 다진 소고기, 다진 돼지고기, 양파, 당근, 셀러리, 토마토 소스, 레드 와인, 파마산 치즈");
        recipe38.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2020/07/23/4ea4584fcdec428a38b79080a95795ba1.jpg");
        recipeRepository.save(recipe38);


        RecipeEntity recipe39 = new RecipeEntity();
        recipe39.setFoodName("명란 크림 파스타");
        recipe39.setCalories("550");
        recipe39.setRecipe("1. 명란젓을 꺼내어 껍질을 제거한다. 2. 팬에 생크림과 우유를 넣고 끓인다. 3. 삶은 파스타 면을 넣고 섞는다. 4. 명란젓을 넣고 잘 섞는다. 5. 파마산 치즈와 파슬리를 뿌려 완성한다.");
        recipe39.setIngredients("파스타 면, 명란젓, 생크림, 우유, 파마산 치즈, 파슬리");
        recipe39.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/03/05/bb0a10f8763b9b48027a993c950cbd751.jpg");
        recipeRepository.save(recipe39);


        RecipeEntity recipe40 = new RecipeEntity();
        recipe40.setFoodName("크림치즈 파스타");
        recipe40.setCalories("550");
        recipe40.setRecipe("1. 팬에 버터를 녹이고 다진 마늘을 볶는다. 2. 생크림과 우유를 넣고 끓인다. 3. 삶은 파스타 면을 넣고 섞는다. 4. 크림치즈를 넣고 잘 섞는다. 5. 파마산 치즈와 파슬리를 뿌려 완성한다.");
        recipe40.setIngredients("파스타 면, 버터, 다진 마늘, 생크림, 우유, 크림치즈, 파마산 치즈, 파슬리");
        recipe40.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/07/31/7ea0f5cd08c9e083947d73b3c3b5c900.jpg");
        recipeRepository.save(recipe40);


        RecipeEntity recipe41 = new RecipeEntity();
        recipe41.setFoodName("바질 페스토 파스타");
        recipe41.setCalories("500");
        recipe41.setRecipe("1. 바질 페스토를 준비한다. 2. 삶은 파스타 면에 올리브오일을 넣고 섞는다. 3. 바질 페스토를 넣고 잘 섞는다. 4. 소금과 후추로 간을 맞춘다. 5. 파마산 치즈를 뿌려 완성한다.");
        recipe41.setIngredients("파스타 면, 바질 페스토, 올리브오일, 소금, 후추, 파마산 치즈");
        recipe41.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/04/05/106afa121b5a7c8abbd13febde6bafe91.jpg");
        recipeRepository.save(recipe41);


        RecipeEntity recipe42 = new RecipeEntity();
        recipe42.setFoodName("레몬 크림 파스타");
        recipe42.setCalories("500");
        recipe42.setRecipe("1. 팬에 버터를 녹이고 다진 마늘을 볶는다. 2. 생크림과 레몬즙을 넣고 끓인다. 3. 삶은 파스타 면을 넣고 섞는다. 4. 레몬 제스트를 넣고 잘 섞는다. 5. 파마산 치즈와 파슬리를 뿌려 완성한다.");
        recipe42.setIngredients("파스타 면, 버터, 다진 마늘, 생크림, 레몬즙, 레몬 제스트, 파마산 치즈, 파슬리");
        recipe42.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2021/10/16/df9b17454ef8f49b411ed5ded8a58f6b1.jpg");
        recipeRepository.save(recipe42);


        RecipeEntity recipe43 = new RecipeEntity();
        recipe43.setFoodName("크림 스파게티");
        recipe43.setCalories("550");
        recipe43.setRecipe("1. 팬에 버터를 녹이고 다진 마늘을 볶는다. 2. 생크림과 우유를 넣고 끓인다. 3. 삶은 스파게티 면을 넣고 섞는다. 4. 파마산 치즈를 넣고 잘 섞는다. 5. 소금과 후추로 간을 맞추고 파슬리를 뿌려 완성한다.");
        recipe43.setIngredients("스파게티 면, 버터, 다진 마늘, 생크림, 우유, 파마산 치즈, 소금, 후추, 파슬리");
        recipe43.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/08/01/852bfdb3627182aa05afa4a40d6f2c4d1.jpg");
        recipeRepository.save(recipe43);


        RecipeEntity recipe44 = new RecipeEntity();
        recipe44.setFoodName("참치 크림 파스타");
        recipe44.setCalories("550");
        recipe44.setRecipe("1. 팬에 버터를 녹이고 다진 마늘을 볶는다. 2. 생크림과 우유를 넣고 끓인다. 3. 참치캔을 넣고 잘 섞는다. 4. 삶은 파스타 면을 넣고 섞는다. 5. 파마산 치즈와 파슬리를 뿌려 완성한다.");
        recipe44.setIngredients("파스타 면, 버터, 다진 마늘, 생크림, 우유, 참치캔, 파마산 치즈, 파슬리");
        recipe44.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/08/30/843b6d5b68353a767c189e844980e9571.jpg");
        recipeRepository.save(recipe44);


        RecipeEntity recipe45 = new RecipeEntity();
        recipe45.setFoodName("연어 크림 파스타");
        recipe45.setCalories("650");
        recipe45.setRecipe("1. 연어를 손질하고 팬에 구운다. 2. 생크림과 우유를 넣고 끓인다. 3. 삶은 파스타 면을 넣고 섞는다. 4. 구운 연어를 넣고 잘 섞는다. 5. 파마산 치즈와 파슬리를 뿌려 완성한다.");
        recipe45.setIngredients("파스타 면, 연어, 생크림, 우유, 파마산 치즈, 파슬리");
        recipe45.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/07/28/0f903bf0dca003ed8e7730188398d69f.jpg");
        recipeRepository.save(recipe45);


        RecipeEntity recipe46 = new RecipeEntity();
        recipe46.setFoodName("백종원 김라면");
        recipe46.setCalories("400");
        recipe46.setRecipe("1. 김을 손으로 잘게 찢는다. 2. 라면을 끓이며 김을 넣는다. 3. 참기름과 깨를 뿌려 마무리한다.");
        recipe46.setIngredients("라면, 김, 참기름, 깨");
        recipe46.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2024/03/12/319413b56b9537c022dbda54ece2fb7c1.jpg");
        recipeRepository.save(recipe46);


        RecipeEntity recipe47 =  new RecipeEntity();
        recipe47.setFoodName("새콤달콤한 김치비빔라면");
        recipe47.setCalories("450");
        recipe47.setRecipe("1. 라면을 끓여 찬물에 헹군다. 2. 김치를 잘게 썰어 양념한다. 3. 면과 김치를 잘 섞는다. 4. 참기름과 깨를 뿌려 마무리한다.");
        recipe47.setIngredients("라면, 김치, 참기름, 깨");
        recipe47.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/06/02/bc4230fca240cb1a5b48c9befaf09a1b1.jpg");
        recipeRepository.save(recipe47);


        RecipeEntity recipe48 = new RecipeEntity();
        recipe48.setFoodName("볶음라면");
        recipe48.setCalories("500");
        recipe48.setRecipe("1. 라면을 반쯤 익혀 물을 버리고 볶는다. 2. 양념을 넣고 잘 섞는다. 3. 대파와 고춧가루를 넣어 마무리한다.");
        recipe48.setIngredients("라면, 대파, 고춧가루");
        recipe48.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/01/24/bd000dd0484d75659b4c20ddaf7b20871.jpg");
        recipeRepository.save(recipe48);


        RecipeEntity recipe49 = new RecipeEntity();
        recipe49.setFoodName("치즈 라면볶이");
        recipe49.setCalories("550");
        recipe49.setRecipe("1. 라면을 끓여 물을 버린다. 2. 팬에 라면과 치즈를 넣고 볶는다. 3. 파슬리를 뿌려 마무리한다.");
        recipe49.setIngredients("라면, 치즈, 파슬리");
        recipe49.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/01/07/37ba1c643d4a35801ee5389443a1b4411.jpg");
        recipeRepository.save(recipe49);


        RecipeEntity recipe50 = new RecipeEntity();
        recipe50.setFoodName("해장짬뽕라면");
        recipe50.setCalories("600");
        recipe50.setRecipe("1. 해산물을 손질하고 라면을 끓인다. 2. 해산물을 넣고 끓인다. 3. 대파와 고춧가루를 넣어 마무리한다.");
        recipe50.setIngredients("라면, 해산물, 대파, 고춧가루");
        recipe50.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/04/18/334de37ec5af1991accfccebd5603e331.jpg");
        recipeRepository.save(recipe50);


        RecipeEntity recipe51 = new RecipeEntity();
        recipe51.setFoodName("북어해장라면");
        recipe51.setCalories("400");
        recipe51.setRecipe("1. 북어를 물에 불려 준비한다. 2. 라면을 끓이며 북어를 넣는다. 3. 대파를 송송 썰어 올리고 후추를 뿌려 마무리한다.");
        recipe51.setIngredients("라면, 북어, 대파, 후추");
        recipe51.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/08/12/92f5a2dca6b0ba94e24b4a8b7e5079161.png");
        recipeRepository.save(recipe51);


        RecipeEntity recipe52 = new RecipeEntity();
        recipe52.setFoodName("짜장라면");
        recipe52.setCalories("500");
        recipe52.setRecipe("1. 라면을 끓이며 짜장소스를 만든다. 2. 면과 짜장소스를 잘 섞는다. 3. 대파와 깨를 뿌려 마무리한다.");
        recipe52.setIngredients("라면, 짜장소스, 대파, 깨");
        recipe52.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/10/05/bdca719b30dafe0fd2db3781fc57fe0f1.jpg");
        recipeRepository.save(recipe52);


        RecipeEntity recipe53 = new RecipeEntity();
        recipe53.setFoodName("명란젓 라면");
        recipe53.setCalories("450");
        recipe53.setRecipe("1. 명란젓을 잘게 썰어 준비한다. 2. 라면을 끓이며 명란젓을 넣는다. 3. 대파를 송송 썰어 올리고 고춧가루를 뿌려 마무리한다.");
        recipe53.setIngredients("라면, 명란젓, 대파, 고춧가루");
        recipe53.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/06/05/13f984f3832b0b75b07c861f0ed1e3921.jpg");
        recipeRepository.save(recipe53);


        RecipeEntity recipe54 = new RecipeEntity();
        recipe54.setFoodName("김치라면");
        recipe54.setCalories("450");
        recipe54.setRecipe("1. 김치를 잘게 썰어 팬에 볶는다. 2. 라면을 끓이며 볶은 김치를 넣는다. 3. 대파를 송송 썰어 올리고 고춧가루를 뿌려 마무리한다.");
        recipe54.setIngredients("라면, 김치, 대파, 고춧가루");
        recipe54.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/08/24/58b457d29f946fa2fb869ab50143905a1.jpg");
        recipeRepository.save(recipe54);


        RecipeEntity recipe55 = new RecipeEntity();
        recipe55.setFoodName("된장라면");
        recipe55.setCalories("400");
        recipe55.setRecipe("1. 된장을 물에 풀어 끓인다. 2. 라면을 끓이며 된장물을 넣는다. 3. 대파를 송송 썰어 올리고 후추를 뿌려 마무리한다.");
        recipe55.setIngredients("라면, 된장, 대파, 후추");
        recipe55.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/08/26/552d27f0e81623f864d17d6d347b89cd1.jpg");
        recipeRepository.save(recipe55);


        RecipeEntity recipe56 = new RecipeEntity();
        recipe56.setFoodName("쿠지라이식 라면");
        recipe56.setCalories("550");
        recipe56.setRecipe("1. 라면을 반쯤 익힌다. 2. 물을 약간 남기고 버린 후, 치즈와 계란을 넣고 약한 불에서 끓인다. 3. 소스를 넣고 잘 섞어 마무리한다.");
        recipe56.setIngredients("라면, 치즈, 계란, 소스");
        recipe56.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2022/08/27/49aceb5d424f99591bf56225153b30811.jpg");
        recipeRepository.save(recipe56);


        RecipeEntity recipe57 = new RecipeEntity();
        recipe57.setFoodName("냉라면");
        recipe57.setCalories("400");
        recipe57.setRecipe("1. 라면을 끓여 찬물에 헹군다. 2. 냉라면 소스를 준비하여 면과 섞는다. 3. 오이와 고명을 올려 완성한다.");
        recipe57.setIngredients("라면, 냉라면 소스, 오이, 고명");
        recipe57.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/07/15/990da0f06cfec6127e43a655b55beba91.jpg");
        recipeRepository.save(recipe57);


        RecipeEntity recipe58 = new RecipeEntity();
        recipe58.setFoodName("콩나물 김치 어묵 라면");
        recipe58.setCalories("500");
        recipe58.setRecipe("1. 콩나물과 어묵을 준비한다. 2. 라면을 끓이며 콩나물과 어묵을 넣는다. 3. 김치를 송송 썰어 넣고 잘 섞는다.");
        recipe58.setIngredients("라면, 콩나물, 어묵, 김치");
        recipe58.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2021/06/17/237ae8c13efcdf979437776269440d461.jpg");
        recipeRepository.save(recipe58);


        RecipeEntity recipe59 = new RecipeEntity();
        recipe59.setFoodName("토마토 라면");
        recipe59.setCalories("500");
        recipe59.setRecipe("1. 토마토를 잘게 썬다. 2. 라면을 끓이며 토마토를 넣는다. 3. 대파와 참기름을 넣어 마무리한다.");
        recipe59.setIngredients("라면, 토마토, 대파, 참기름");
        recipe59.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/05/11/0a7fc6f1cf1a09cfe36376106de3acc51.jpg");
        recipeRepository.save(recipe59);


        RecipeEntity recipe60 = new RecipeEntity();
        recipe60.setFoodName("버터볶음 김치라면");
        recipe60.setCalories("600");
        recipe60.setRecipe("1. 김치를 잘게 썰어 팬에 볶는다. 2. 라면을 끓여 물을 버린 후 팬에 넣고 볶는다. 3. 버터를 넣고 잘 섞는다.");
        recipe60.setIngredients("라면, 김치, 버터");
        recipe60.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/04/01/45f132b40c35730a78fd0e443ffae0d61.jpg");
        recipeRepository.save(recipe60);


        RecipeEntity recipe61 = new RecipeEntity();
        recipe61.setFoodName("두부 스테이크");
        recipe61.setCalories("200");
        recipe61.setRecipe("1. 두부를 으깨어 물기를 제거합니다. 2. 야채를 다져 두부와 섞습니다. 3. 소금과 후추로 간을 하고 반죽을 만듭니다. 4. 팬에 기름을 두르고 노릇노릇하게 굽습니다.");
        recipe61.setIngredients("두부, 양파, 당근, 소금, 후추, 식용유");
        recipe61.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/10/12/06271fe004b12e4f22fe3337a182c6271.jpg");
        recipeRepository.save(recipe61);


        RecipeEntity recipe62 = new RecipeEntity();
        recipe62.setFoodName("치킨 스테이크");
        recipe62.setCalories("450");
        recipe62.setRecipe("1. 닭가슴살을 준비하여 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 닭가슴살을 굽습니다. 3. 야채를 곁들여 완성합니다.");
        recipe62.setIngredients("닭가슴살, 소금, 후추, 야채, 식용유");
        recipe62.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/11/15/a36dfeaf990f082fc811b432d776bf471.jpg");
        recipeRepository.save(recipe62);


        RecipeEntity recipe63 = new RecipeEntity();
        recipe63.setFoodName("생선 스테이크");
        recipe63.setCalories("300");
        recipe63.setRecipe("1. 생선을 손질하여 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 생선을 굽습니다. 3. 레몬즙을 뿌려 완성합니다.");
        recipe63.setIngredients("생선, 소금, 후추, 레몬즙, 식용유");
        recipe63.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/06/08/de4b53a9c85cea6a2e1a94635f598389.jpg");
        recipeRepository.save(recipe63);


        RecipeEntity recipe64 = new RecipeEntity();
        recipe64.setFoodName("돼지 안심 스테이크");
        recipe64.setCalories("350");
        recipe64.setRecipe("1. 돼지 안심을 소금과 후추로 간합니다. 2. 팬에 기름을 두르고 안심을 굽습니다. 3. 소스를 만들어 곁들여 완성합니다.");
        recipe64.setIngredients("돼지 안심, 소금, 후추, 소스, 식용유");
        recipe64.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/07/22/fb05a1e58f3cfe42be8d40646e447495.jpg");
        recipeRepository.save(recipe64);


        RecipeEntity recipe65 = new RecipeEntity();
        recipe65.setFoodName("큐브 스테이크");
        recipe65.setCalories("400");
        recipe65.setRecipe("1. 소고기를 큐브 모양으로 자릅니다. 2. 팬에 기름을 두르고 소고기를 굽습니다. 3. 야채와 소스를 곁들여 완성합니다.");
        recipe65.setIngredients("소고기, 소금, 후추, 야채, 소스, 식용유");
        recipe65.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/12/18/d2181d77edb99c9734a3c21c8ea3aba31.jpg");
        recipeRepository.save(recipe65);


        RecipeEntity recipe66 = new RecipeEntity();
        recipe66.setFoodName("목살 스테이크");
        recipe66.setCalories("500");
        recipe66.setRecipe("1. 돼지 목살을 준비하여 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 목살을 굽습니다. 3. 야채와 함께 완성합니다.");
        recipe66.setIngredients("돼지 목살, 소금, 후추, 야채, 식용유");
        recipe66.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/03/29/9b0aa8a00894883a8e5123909181baff1.jpg");
        recipeRepository.save(recipe66);


        RecipeEntity recipe67 = new RecipeEntity();
        recipe67.setFoodName("부채살 스테이크");
        recipe67.setCalories("550");
        recipe67.setRecipe("1. 부채살을 소금과 후추로 간합니다. 2. 팬에 기름을 두르고 부채살을 굽습니다. 3. 야채와 소스를 곁들여 완성합니다.");
        recipe67.setIngredients("부채살, 소금, 후추, 야채, 소스, 식용유");
        recipe67.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/05/14/1073d124956700ce69354cf6a335c8661.jpg");
        recipeRepository.save(recipe67);


        RecipeEntity recipe68 = new RecipeEntity();
        recipe68.setFoodName("함박 스테이크");
        recipe68.setCalories("450");
        recipe68.setRecipe("1. 소고기와 돼지고기를 섞어 반죽을 만듭니다. 2. 소금과 후추로 간을 하고 팬에 구워 완성합니다.");
        recipe68.setIngredients("소고기, 돼지고기, 소금, 후추, 식용유");
        recipe68.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/03/30/d5b9de52ffedb2727738b8c0e15889a11.jpg");
        recipeRepository.save(recipe68);


        RecipeEntity recipe69 = new RecipeEntity();
        recipe69.setFoodName("연어 스테이크");
        recipe69.setCalories("350");
        recipe69.setRecipe("1. 연어를 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 연어를 굽습니다. 3. 레몬즙을 뿌려 완성합니다.");
        recipe69.setIngredients("연어, 소금, 후추, 레몬즙, 식용유");
        recipe69.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/04/14/6faa6d4863aca33fc5e946017d5301841.jpg");
        recipeRepository.save(recipe69);


        RecipeEntity recipe70 = new RecipeEntity();
        recipe70.setFoodName("돼지 등심 스테이크");
        recipe70.setCalories("400");
        recipe70.setRecipe("1. 돼지 등심을 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 등심을 굽습니다. 3. 소스를 곁들여 완성합니다.");
        recipe70.setIngredients("돼지 등심, 소금, 후추, 소스, 식용유");
        recipe70.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2022/10/19/81318c4101b534506234e639307ecc171.jpg");
        recipeRepository.save(recipe70);


        RecipeEntity recipe71 = new RecipeEntity();
        recipe71.setFoodName("닭다리살 스테이크");
        recipe71.setCalories("450");
        recipe71.setRecipe("1. 닭다리살을 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 닭다리살을 굽습니다. 3. 야채와 함께 완성합니다.");
        recipe71.setIngredients("닭다리살, 소금, 후추, 야채, 식용유");
        recipe71.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/04/03/c678b404e4adf5c1b8ec973aa00b56a01.jpg");
        recipeRepository.save(recipe71);


        RecipeEntity recipe72 = new RecipeEntity();
        recipe72.setFoodName("큐브 스테이크 덮밥");
        recipe72.setCalories("550");
        recipe72.setRecipe("1. 소고기를 큐브 모양으로 자릅니다. 2. 팬에 기름을 두르고 소고기를 굽습니다. 3. 야채와 소스를 곁들여 덮밥을 완성합니다.");
        recipe72.setIngredients("소고기, 소금, 후추, 야채, 소스, 식용유");
        recipe72.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/12/15/670d7c3d82c4c169543f74d4b61353fa1.jpg");
        recipeRepository.save(recipe72);


        RecipeEntity recipe73 = new RecipeEntity();
        recipe73.setFoodName("고등어 스테이크");
        recipe73.setCalories("300");
        recipe73.setRecipe("1. 고등어를 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 고등어를 굽습니다. 3. 레몬즙을 뿌려 완성합니다.");
        recipe73.setIngredients("고등어, 소금, 후추, 레몬즙, 식용유");
        recipe73.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2019/11/28/f45b81d7409dd66baeaf6b762a8be66d1.jpg");
        recipeRepository.save(recipe73);


        RecipeEntity recipe74 = new RecipeEntity();
        recipe74.setFoodName("참치 스테이크");
        recipe74.setCalories("350");
        recipe74.setRecipe("1. 참치를 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 참치를 굽습니다. 3. 야채와 소스를 곁들여 완성합니다.");
        recipe74.setIngredients("참치, 소금, 후추, 야채, 소스, 식용유");
        recipe74.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/11/29/960bc9290199513224de28480a55370a1.jpg");
        recipeRepository.save(recipe74);


        RecipeEntity recipe75 = new RecipeEntity();
        recipe75.setFoodName("돼지갈비 스테이크");
        recipe75.setCalories("600");
        recipe75.setRecipe("1. 돼지갈비를 소금과 후추로 간을 합니다. 2. 팬에 기름을 두르고 돼지갈비를 굽습니다. 3. 소스를 곁들여 완성합니다.");
        recipe75.setIngredients("돼지갈비, 소금, 후추, 소스, 식용유");
        recipe75.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2020/11/08/eaacbabc7c5c4b9a982f06e54424c21f1.jpg");
        recipeRepository.save(recipe75);


        RecipeEntity recipe76 = new RecipeEntity();
        recipe76.setFoodName("감자채 볶음");
        recipe76.setCalories("150");
        recipe76.setRecipe("1. 감자를 채 썰어 찬물에 헹군다. 2. 팬에 기름을 두르고 감자를 볶는다. 3. 소금과 후추로 간을 맞춘다.");
        recipe76.setIngredients("감자, 소금, 후추, 식용유");
        recipe76.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/09/03/7b212e9f49ebe4a5fd27507ce388e7d81.jpg");
        recipeRepository.save(recipe76);


        RecipeEntity recipe77 = new RecipeEntity();
        recipe77.setFoodName("어묵 잡채");
        recipe77.setCalories("250");
        recipe77.setRecipe("1. 어묵을 얇게 썰어 준비한다. 2. 당근과 양파를 채 썰어 볶는다. 3. 어묵을 넣고 간장을 넣어 볶는다.");
        recipe77.setIngredients("어묵, 당근, 양파, 간장, 식용유");
        recipe77.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/09/28/413fe57b314d3a61d6e029d0db063af11.jpg");
        recipeRepository.save(recipe77);


        RecipeEntity recipe78 = new RecipeEntity();
        recipe78.setFoodName("김치찌개");
        recipe78.setCalories("300");
        recipe78.setRecipe("1. 김치를 잘게 썰어 냄비에 넣는다. 2. 돼지고기를 넣고 볶는다. 3. 물과 두부를 넣고 끓인다.");
        recipe78.setIngredients("김치, 돼지고기, 두부, 물, 고춧가루");
        recipe78.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/08/25/d1754942db6cebf74146eff6225e620d1.jpg");
        recipeRepository.save(recipe78);


        RecipeEntity recipe79 = new RecipeEntity();
        recipe79.setFoodName("된장찌개");
        recipe79.setCalories("200");
        recipe79.setRecipe("1. 된장을 물에 풀어 끓인다. 2. 야채와 두부를 넣고 끓인다. 3. 마늘과 고춧가루로 간을 맞춘다.");
        recipe79.setIngredients("된장, 두부, 야채, 마늘, 고춧가루");
        recipe79.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/10/27/462f2e2c70a260e044c4450bc18e6f651.jpg");
        recipeRepository.save(recipe79);


        RecipeEntity recipe80 = new RecipeEntity();
        recipe80.setFoodName("갈비찜");
        recipe80.setCalories("600");
        recipe80.setRecipe("1. 갈비를 손질하고 양념에 재운다. 2. 압력솥에 갈비를 넣고 끓인다. 3. 야채를 넣고 추가로 끓인다.");
        recipe80.setIngredients("갈비, 간장, 설탕, 마늘, 야채");
        recipe80.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/12/02/644ec8ac36a0ecefee6af3e0d13235131.jpg");
        recipeRepository.save(recipe80);


        RecipeEntity recipe81 = new RecipeEntity();
        recipe81.setFoodName("잡채");
        recipe81.setCalories("400");
        recipe81.setRecipe("1. 당면을 불려 준비한다. 2. 각종 야채를 채 썰어 볶는다. 3. 당면과 야채를 섞어 양념을 넣고 볶는다.");
        recipe81.setIngredients("당면, 야채, 간장, 설탕, 식용유");
        recipe81.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/11/14/a2d4839b5743d121d4d2b46fdbc9aa5b1.jpg");
        recipeRepository.save(recipe81);


        RecipeEntity recipe82 = new RecipeEntity();
        recipe82.setFoodName("비빔밥");
        recipe82.setCalories("450");
        recipe82.setRecipe("1. 밥을 준비한다. 2. 각종 나물을 볶아 준비한다. 3. 고추장과 참기름을 넣고 비벼 먹는다.");
        recipe82.setIngredients("밥, 나물, 고추장, 참기름, 계란");
        recipe82.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/12/08/0d2249438aac593752292c6380dbb5c41.jpg");
        recipeRepository.save(recipe82);


        RecipeEntity recipe83 = new RecipeEntity();
        recipe83.setFoodName("불고기");
        recipe83.setCalories("500");
        recipe83.setRecipe("1. 소고기를 양념에 재운다. 2. 팬에 고기를 볶는다. 3. 야채를 넣고 함께 볶아 완성한다.");
        recipe83.setIngredients("소고기, 간장, 설탕, 마늘, 야채");
        recipe83.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/12/30/df939769792632a48a0eba8bc895e8601.jpg");
        recipeRepository.save(recipe83);


        RecipeEntity recipe84 = new RecipeEntity();
        recipe84.setFoodName("떡볶이");
        recipe84.setCalories("400");
        recipe84.setRecipe("1. 떡을 물에 불린다. 2. 팬에 떡과 어묵을 넣고 양념을 넣어 볶는다. 3. 대파를 넣어 마무리한다.");
        recipe84.setIngredients("떡, 어묵, 고추장, 설탕, 대파");
        recipe84.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/08/13/3233d427883d15239f297aeeaf1775531.jpg");
        recipeRepository.save(recipe84);


        RecipeEntity recipe85 = new RecipeEntity();
        recipe85.setFoodName("콩나물국");
        recipe85.setCalories("100");
        recipe85.setRecipe("1. 콩나물을 깨끗이 씻어 준비한다. 2. 물에 콩나물과 다진 마늘을 넣고 끓인다. 3. 소금으로 간을 맞춘다.");
        recipe85.setIngredients("콩나물, 다진 마늘, 소금, 물");
        recipe85.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/10/09/e5ff4ca123d37edd424d1b67bdae7dba1.jpg");
        recipeRepository.save(recipe85);


        RecipeEntity recipe86 = new RecipeEntity();
        recipe86.setFoodName("오이소박이");
        recipe86.setCalories("100");
        recipe86.setRecipe("1. 오이를 깨끗이 씻고 소금을 뿌려 절인다. 2. 양파, 당근, 부추를 채 썰어 양념과 섞는다. 3. 오이에 채운다.");
        recipe86.setIngredients("오이, 양파, 당근, 부추, 소금, 고춧가루, 마늘");
        recipe86.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/09/19/6ecd78db5f3f2623bbf73db9af871eb81.jpg");
        recipeRepository.save(recipe86);


        RecipeEntity recipe87 = new RecipeEntity();
        recipe87.setFoodName("호박전");
        recipe87.setCalories("200");
        recipe87.setRecipe("1. 애호박을 얇게 썰어 소금에 절인다. 2. 밀가루와 계란물을 준비한다. 3. 팬에 기름을 두르고 호박을 부친다.");
        recipe87.setIngredients("애호박, 소금, 밀가루, 계란, 식용유");
        recipe87.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/08/27/f25a06239a4aa0541f5d483808bc7fb31.jpg");
        recipeRepository.save(recipe87);


        RecipeEntity recipe88 = new RecipeEntity();
        recipe88.setFoodName("김치찜");
        recipe88.setCalories("600");
        recipe88.setRecipe("1. 갈비를 물에 담가 핏물을 뺀다. 2. 양념을 만들어 갈비에 재운다. 3. 냄비에 넣고 끓인 후 야채를 넣어 완성한다.");
        recipe88.setIngredients("갈비, 간장, 설탕, 마늘, 생강, 당근, 감자");
        recipe88.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/05/25/53402adf0a5eb2b854649925343219481.jpg");
        recipeRepository.save(recipe88);


        RecipeEntity recipe89 = new RecipeEntity();
        recipe89.setFoodName("콩나물무침");
        recipe89.setCalories("50");
        recipe89.setRecipe("1. 콩나물을 깨끗이 씻어 끓는 물에 데친다. 2. 다진 마늘, 소금, 참기름을 넣어 무친다. 3. 깨를 뿌려 마무리한다.");
        recipe89.setIngredients("콩나물, 다진 마늘, 소금, 참기름, 깨");
        recipe89.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/09/06/fd90bc74ddb4580b2dad22c83b42ec6f1.jpg");
        recipeRepository.save(recipe89);


        RecipeEntity recipe90 = new RecipeEntity();
        recipe90.setFoodName("김치볶음밥");
        recipe90.setCalories("450");
        recipe90.setRecipe("1. 김치를 잘게 썰어 볶는다. 2. 밥을 넣고 함께 볶는다. 3. 계란 프라이를 올려 완성한다.");
        recipe90.setIngredients("김치, 밥, 계란, 간장, 참기름");
        recipe90.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/12/29/c66e0346fb6fb086abbb6e1caa29d4cb1.jpg");
        recipeRepository.save(recipe90);


        RecipeEntity recipe91 = new RecipeEntity();
        recipe91.setFoodName("마파두부");
        recipe91.setCalories("300");
        recipe91.setRecipe("1. 두부를 작게 썰어 준비한다. 2. 돼지고기 다진 것을 볶는다. 3. 마파두부 소스를 넣고 두부를 넣어 끓인다.");
        recipe91.setIngredients("두부, 돼지고기, 마파두부 소스, 대파, 마늘");
        recipe91.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/12/27/81d7bf7713e7b538b97d521d1485ec421.jpg");
        recipeRepository.save(recipe91);


        RecipeEntity recipe92 = new RecipeEntity();
        recipe92.setFoodName("깐풍기");
        recipe92.setCalories("400");
        recipe92.setRecipe("1. 닭고기를 소금과 후추로 간을 한다. 2. 튀김옷을 입혀 튀긴다. 3. 깐풍 소스를 만들어 닭고기를 볶는다.");
        recipe92.setIngredients("닭고기, 소금, 후추, 튀김가루, 깐풍 소스");
        recipe92.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2016/01/23/b7ad001e4bab887facc421923ce868e61.jpg");
        recipeRepository.save(recipe92);


        RecipeEntity recipe93 =  new RecipeEntity();
        recipe93.setFoodName("짜장면");
        recipe93.setCalories("500");
        recipe93.setRecipe("1. 양파, 감자를 작게 썰어 준비한다. 2. 춘장을 볶아 소스를 만든다. 3. 면과 소스를 섞어 완성한다.");
        recipe93.setIngredients("면, 양파, 감자, 춘장, 돼지고기");
        recipe93.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/11/25/1e26880e274893fb6df222bed4794bb51.jpg");
        recipeRepository.save(recipe93);


        RecipeEntity recipe94 = new RecipeEntity();
        recipe94.setFoodName("짬뽕");
        recipe94.setCalories("550");
        recipe94.setRecipe("1. 해물을 준비하여 손질한다. 2. 짬뽕 소스를 만들어 해물과 함께 볶는다. 3. 면과 소스를 섞어 완성한다.");
        recipe94.setIngredients("해물, 양파, 배추, 고추, 면, 짬뽕 소스");
        recipe94.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2015/12/19/db415cb2b1409d1ba1c337d373e089ad1.jpg");
        recipeRepository.save(recipe94);


        RecipeEntity recipe95 = new RecipeEntity();
        recipe95.setFoodName("팔보채");
        recipe95.setCalories("600");
        recipe95.setRecipe("1. 해산물을 준비하고 야채를 손질한다. 2. 소스를 만들어 재료를 볶는다. 3. 재료와 소스를 잘 섞어 완성한다.");
        recipe95.setIngredients("해산물, 양파, 당근, 피망, 팔보채 소스");
        recipe95.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/08/06/f178e2f22e1c06060792d25950a21690.jpg");
        recipeRepository.save(recipe95);


        RecipeEntity recipe96 = new RecipeEntity();
        recipe96.setFoodName("볶음밥");
        recipe96.setCalories("450");
        recipe96.setRecipe("1. 밥을 준비한다. 2. 각종 야채와 고기를 볶는다. 3. 밥을 넣고 함께 볶아 완성한다.");
        recipe96.setIngredients("밥, 양파, 당근, 피망, 소고기, 간장");
        recipe96.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/10/21/907822ffde401693fc312508256b34281.jpg");
        recipeRepository.save(recipe96);


        RecipeEntity recipe97 = new RecipeEntity();
        recipe97.setFoodName("동파육");
        recipe97.setCalories("700");
        recipe97.setRecipe("1. 돼지고기를 큼직하게 썰어 준비한다. 2. 소스를 만들어 고기를 졸인다. 3. 고기를 부드럽게 끓여 완성한다.");
        recipe97.setIngredients("돼지고기, 간장, 설탕, 대파, 생강");
        recipe97.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2017/03/17/5555cd2751c3676f5507f60b2a3d10141.jpg");
        recipeRepository.save(recipe97);


        RecipeEntity recipe98 = new RecipeEntity();
        recipe98.setFoodName("깐쇼새우");
        recipe98.setCalories("550");
        recipe98.setRecipe("1. 새우를 손질하여 튀긴다. 2. 깐쇼 소스를 만들어 새우를 볶는다. 3. 대파를 송송 썰어 넣고 완성한다.");
        recipe98.setIngredients("새우, 튀김가루, 깐쇼 소스, 대파");
        recipe98.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/04/04/284078af29adf6b955d09153517b78071.jpg");
        recipeRepository.save(recipe98);


        RecipeEntity recipe99 = new RecipeEntity();
        recipe99.setFoodName("탕수육");
        recipe99.setCalories("600");
        recipe99.setRecipe("1. 돼지고기를 튀김옷을 입혀 튀긴다. 2. 탕수육 소스를 만들어 고기를 버무린다. 3. 야채를 넣고 함께 볶아 완성한다.");
        recipe99.setIngredients("돼지고기, 튀김가루, 탕수육 소스, 양파, 피망");
        recipe99.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/10/03/2d705ef0e765a316511fe42bac486cd31.jpg");
        recipeRepository.save(recipe99);


        RecipeEntity recipe100 = new RecipeEntity();
        recipe100.setFoodName("유린기");
        recipe100.setCalories("500");
        recipe100.setRecipe("1. 닭가슴살을 튀긴다. 2. 유린기 소스를 만들어 닭고기에 끼얹는다. 3. 야채를 곁들여 완성한다.");
        recipe100.setIngredients("닭가슴살, 튀김가루, 유린기 소스, 양파, 당근");
        recipe100.setImage("https://recipe1.ezmember.co.kr/cache/recipe/2018/11/10/d0881f710b5d7f5c2ce3343b654ce7a01.jpg");
        recipeRepository.save(recipe100);
    }
}
