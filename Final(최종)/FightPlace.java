package com.company;

import java.util.Random;
import java.util.Scanner;

public class FightPlace {
    Tutorial sleep = new Tutorial();
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    Lobby go = new Lobby();

    public void sayOpeningMent(){
        System.out.println("ººººººººººººººººººººººººººººººººººººººº");
        System.out.println("ººººººººººº싸움터로 이동중입니다ººººººººººº");
        System.out.println("ººººººººººººººººººººººººººººººººººººººº");
        try {
            Thread.sleep(800);
        } catch (Exception e) {}
        level1_deputySectionChief();
    }


    //대리 레벨의 적
    public void level1_deputySectionChief(){
        if (Character.level==1){
            System.out.println(Enemy.deputySectionChief+": 어서와요. 우린 가족같은 분위기에서 일해요^^");
            sleep.makeSleepingThroughException(400);
            System.out.println(Enemy.deputySectionChief+": 나는 과장님, 부장님이랑 다르게 그런 농담안해요~");
            sleep.makeSleepingThroughException(400);
            System.out.println(Enemy.deputySectionChief+": 그럼 우리 같이 일 잘해봐요~^^");
            sleep.makeSleepingThroughException(400);
            System.out.println("퀴노(퀴즈노예): LEVEL 1 라운드는 '맞춤법 퀴즈' 입니다.");
            System.out.println("퀴노: 틀릴 때마다 체력이 -20 되니 주의하세요.");
            System.out.println("퀴노: 준비~~~~~");
            sleep.makeSleepingThroughException(800);
            System.out.println("퀴노: 시~~~~~~작");
            sleep.makeSleepingThroughException(400);
            go_attacking_level1();
        } else if (Character.level==2){
            level2_sectionChief();
        }else{
            level3_headOfDepartment();
        }



    }

    //과장 레벨의 적
    public void level2_sectionChief(){
        System.out.println(Enemy.sectionChief+": "+Character.name+"씨, 우리 회사 어때? 이런 회사 또 없다~");
        sleep.makeSleepingThroughException(400);
        System.out.println(Enemy.sectionChief+": 열심히 일해보자구.");
        sleep.makeSleepingThroughException(400);
        System.out.println("퀴노(퀴즈노예): LEVEL 2 라운드는 '상식 퀴즈' 입니다.");
        System.out.println("퀴노: 모든 답은 띄어쓰기를 사용하면 안 됩니다. 주의하세요!");
        System.out.println("퀴노: 틀릴 때마다 체력이 -40 되니 주의하세요.");
        sleep.makeSleepingThroughException(600);
        System.out.println("퀴노: 준비~~~시작");
        sleep.makeSleepingThroughException(400);
        go_attacking_level2();

    }

    //부장 레벨의 적
    public void level3_headOfDepartment(){
        System.out.println(Enemy.headOfDepartment+": 아~~ 자네가 그 신입사원인가?");
        System.out.println(Enemy.headOfDepartment+": 자네 짤리고 싶지 않으면 열심히 해야할거야^^");
        System.out.println(Enemy.headOfDepartment+": 그럼 바로 시작하지.");
        sleep.makeSleepingThroughException(400);
        System.out.println("퀴노(퀴즈노예): LEVEL 3 라운드는 '논센스 퀴즈' 입니다.");
        System.out.println("퀴노: 틀릴 때마다 체력이 -60 되니 주의하세요.");
        sleep.makeSleepingThroughException(600);
        System.out.println("퀴노: 준비~~~시작");
        sleep.makeSleepingThroughException(400);
        go_attacking_level3();
    }
    public void go_attacking_level1(){
        String[] quiz1 = new String[10];
        quiz1[0]="내 기사가 신문 (     )에 실렸다." +
                "\n1.스포츠난" +
                "\n2.스포츠란";
        quiz1[1]="어묵에 간장을 (      )." +
                "\n1.묻치다" +
                "\n2.묻히다";
        quiz1[2]="과거의 일에 (    )" +
                "\n1.얽매이다" +
                "\n2.얽메이다";
        quiz1[3]="나는 그녀를 (    )기다렸다." +
                "\n1.오래동안" +
                "\n2.오랫동안";
        quiz1[4]="()좀 버려줄래?" +
                "\n1.우유갑" +
                "\n2.우유곽";
        quiz1[5]="오늘도 선생님의 ()에 걸려들었다." +
                "\n1.유도신문" +
                "\n2.유도심문";
        quiz1[6]="()이라도 좀 떼고 나가라." +
                "\n1.눈곱" +
                "\n2.눈꼽";
        quiz1[7]="어젯밤 아랫마을 이장이 ()를 감행했다." +
                "\n1.야반도주" +
                "\n2.야밤도주";
        quiz1[8]="()네 마음대로 해라." +
                "\n1.하던지 말던지" +
                "\n2.하든지 말든지";
        quiz1[9]="그사람을 만나고 오는데 왠지 ()한 기분이 들었다." +
                "\n1.께럼칙" +
                "\n2.꺼림직" +
                "\n3.꺼림칙" +
                "\n4.께림칙";

        int[] answer1 = new int[10];
        answer1[0]=1;
        answer1[1]=2;
        answer1[2]=1;
        answer1[3]=2;
        answer1[4]=1;
        answer1[5]=1;
        answer1[6]=1;
        answer1[7]=1;
        answer1[8]=2;
        answer1[9]=3;


        //퀴즈 시작
        int i=1;
        while (true){
            if (Character.healthPower<=0){
                System.out.println("You die");
                break;
            }else if (Enemy.deputySectionChiefHealthPower<=0){
                System.out.println("LEVEL UP");
                sleep.makeSleepingThroughException(800);
                Character.level=2;
                Character.healthPower=150;
                Character.attackPower=20;
                Character.defencePower=4;
                showInTheGameInformation();
                System.out.println("----로딩중----");
                sleep.makeSleepingThroughException(600);
                System.out.println("겜노: 다음 결정 중 하나를 선택해주세요!");
                System.out.println("1번. Level 2의 적과 맞서 싸운다.");
                System.out.println("2번. 로비로 돌아간다.");
                int chooseNumber = sc.nextInt();
                if (chooseNumber==1){
                    level2_sectionChief();
                } else{
                    go.goWherePlace();
                }
            }else {
                int number = rand.nextInt(10);
                System.out.println("문제 "+i+"번");
                System.out.println(quiz1[number]);
                int user_answer = sc.nextInt();
                if (user_answer==answer1[number]){
                    System.out.println("퀴노: 정답입니다!");
                    System.out.println("-> 적 체력: "+(Enemy.deputySectionChiefHealthPower-=(Enemy.deputySectionChiefDefencePower+Character.attackPower)));
                }else{
                    System.out.println("퀴노: 틀렸습니다!");
                    System.out.println("-> "+Character.name+"의 체력: "+(Character.healthPower-=(Character.defencePower+Enemy.deputySectionChiefAttackPower)));
                }
            i++;
            }
        }
    }

    public void go_attacking_level2(){
        String[] quiz2 = new String[15];
        quiz2[0]="로봇이나 가상의 아바타가 인간과 닮을수록 호감도가 높아지지만 일정수준에 도달하면 오히려 강한 거부감을 느낀다는 이론입니다.\n호" +
                "감도가 계속해서 상승하다 급격하게 하강하는 그래프 모양이 알파벳 V자를 닮아서 이름이 붙여졌는데요. \n1970년 일본의 로봇 과학자인 모리 마사히로 박사가 언급하며" +
                "알려진 이 이론은 무엇일까요?";
        quiz2[1]="다음 중 복수 표준어가 아닌 것은 무엇일까요?" +
                "\n1. 옥수수, 강냉이" +
                "\n2. 예쁘다, 이쁘다" +
                "\n3. 벌레, 버러지" +
                "\n4. 강소주, 깡소주";
        quiz2[2]="1636년, 청나라의 침입으로 병자호란이 일어나자 조선의 왕 인조는 궁을 떠나 '이곳'에서 47일간 피신해 있었는데요." +
                "\n'이곳'은 한양의 동남쪽을 지키던 군사 요새 중 하나로, 높고 가파른 산세를 이용한 뛰어난 축성숙을 인정받아" +
                "\n지난 2014년, 유네스코 세계문화유산으로 등재되기도 했습니다. '이곳'은 어디일까요?";
        quiz2[3]="다음 중 실제로 존재하지 않는 식물은 무엇일까요?" +
                "\n1. 존낸쉬름" +
                "\n2. 개쉽싸리" +
                "\n3. 조팝나무" +
                "\n4. 민머리씨방" +
                "\n5. 가시파대가리";
        quiz2[4]="'호랑이를 잡는 개'라고 불리며 2018 평양 남북정상회담 때 " +
                "\n북한으로부터 암수 한 쌍을 선물 받은, '북한 천연기념물'인" +
                "\n이 견종은 무엇일까요?";
        quiz2[5]="다음 속담에 들어가는 '이것'은 무엇일까요?" +
                "\n<열 번 찍어 안 넘어가는 '이것' 없다.>";
        quiz2[6]="2020년 4월 베트남 하노이의 세계 최초의 (  )  ATM 기가 등장해 화제다." +
                "\n코로나 19로 일자리를 잃고 생계난을 겪는 시민들에게 (  )을 무료로 제공하고 있는데," +
                "\n전 세계에서 베트남이 세 번째로 많이 수출하는 (  )은?";
        quiz2[7]="이것은 영국의 한 진화 생물학자가 만든 용어로" +
                "\n그리스어로 모방을 뜻하는 미메메(mimeme)와 유전자를 뜻하는 영어로 진(gene)을 합성해 만든 단어입니다." +
                "\n최근 인터넷에 유행하는 콘텐츠를 재창조해 확산시키는 것을 이것이라 표현하는데요" +
                "\n가수 비의 노래인 깡이 대표적인 이것 현상이라 할 수 있습니다. 이것은 무엇일까요?";
        quiz2[8]="오늘날 전 세계에서 사용하는 이것은 지난 2007년 IT개발자였던 크리스 메시나에 의해 탄생했습니다." +
                "\n그는 프로그래밍 C언어에서 우선 처리해야 하는 명령어 앞에 특정기호를 붙였던 방식에서 이것에 영감을 얻었다고 하는데요" +
                "\n게시물의 분류와 검색을 편안하게 하기 위한 목적으로 하루 평균 1억 건 이상 사용되는 이것은 무엇일까요?(한국말로 적어주세요)";
        quiz2[9]="영국의 경제학자인 애덤 스미스는 최초로 자본주의 사회를 체계적으로 파악해" +
                "\n오늘날 경제학 이론의 대표 저서 국부론을 저술했습니다. 그는 국부론에서 개인이 자신의 이익을 추구하다 보면" +
                "\n'보이지 않는 이것'이 작용해 사회 질서가 유지된다고 했는데요, 이것은 무엇일까요?";
        quiz2[10]="알바 중 귀신을 봤을 때보다 더 소름이 돋았던 순간 1위는?" +
                "\n1. 헤어진 애인이 손님으로 왔을 때" +
                "\n2. 휴대전화 확인 중 사장님과 눈 마주칠 때" +
                "\n3. 마감 정산 시 정산액이 맞지 않을 때" +
                "\n4. 생각지도 않은 시간에 손님이 몰려올 때";
        quiz2[11]="오스트리아에는 나치 시대의 독재자인 히틀러의 생가가 있는데요." +
                "\n오스트리아 정부가 2023년까지 히틀러의 생가를 이것으로 개조한다고 밝혔습니다." +
                "\n시민의 기본권과 자유를 수호하는 이들이 근무하는 곳으로 바꿔" +
                "\n나치 추종자들의 성지가 되는 것을 막기 위한 목적이라는데요, 이것은 무엇일까요?";
        quiz2[12]="가장 오래된 벚꽃 축제는 매년 4월 경남 진해에서 열리는 군항제입니다." +
                "\n군항제는 우리나라 최초로 진해에 이 인물의 동상을 세우고 추모제를 지낸 것에서 시작됐는데요" +
                "\n'필사즉생 필생즉사'라는 명언을 남긴 인물의 이름은?";
        quiz2[13]="1919년 일제의 식민지 지배에 저항하며 일어난 3.1운동을 계기로" +
                "\n같은 해 1919년, 중국에 해외 독립운동의 핵심체인 이 기관이 수립됐습니다." +
                "\n최근 '이 기관 하면 떠오르는 것'에 대한 설문조사 결과" +
                "\n1위 백범 김구 선생님, 2위 상해, 3번 이승만 전 대통령이 차지했는데요." +
                "\n이 기관의 정식명칭은 무엇일까요?";
        quiz2[14]="최근 코로나 19 여파로 마스크에 대한 관심이 높습니다." +
                "\n식약처에서 인증한 보건용 마스크 제품에는 'KF80', 'KF90' 등이 표기되어 있는데요" +
                "\n이는 미세입자의 차단 성능을 의미하는 것으로, 숫자가 클수록 더 작은 입자를, 더 많이 막아낸다는 뜻입니다." +
                "\n그렇다면 'KF'는 무엇의 약자일까요?";


        String[] answer2 = new String[15];
        answer2[0]="불쾌한골짜기";
        answer2[1]="4";
        answer2[2]="남한산성";
        answer2[3]="4";
        answer2[4]="풍산개";
        answer2[5]="나무";
        answer2[6]="쌀";
        answer2[7]="밈";
        answer2[8]="해시태그";
        answer2[9]="손";
        answer2[10]="3";
        answer2[11]="경찰서";
        answer2[12]="이순신";
        answer2[13]="대한민국임시정부";
        answer2[14]="KoreaFilter";

        int i=1;
        while (true){
            if (Character.healthPower<=0){
                System.out.println("You die");
                break;
            }else if (Enemy.sectionChiefHealthPower<=0){
                System.out.println("LEVEL UP");
                sleep.makeSleepingThroughException(800);
                Character.level=3;
                Character.healthPower=200;
                Character.attackPower=40;
                Character.defencePower=8;
                showInTheGameInformation();
                System.out.println("----로딩중----");
                sleep.makeSleepingThroughException(600);
                System.out.println("겜노: 다음 결정 중 하나를 선택해주세요!");
                System.out.println("1번. Level 3의 적과 맞서 싸운다.");
                System.out.println("2번. 로비로 돌아간다.");
                int chooseNumber = sc.nextInt();
                if (chooseNumber==1){
                    level3_headOfDepartment();
                } else{
                    go.goWherePlace();
                }


            }else {
                int number = rand.nextInt(15);
                System.out.println("문제 "+i+"번");
                System.out.println(quiz2[number]);
                String user_answer = sc.nextLine();
                if (user_answer.equals(answer2[number])){
                    System.out.println("퀴노: 정답입니다!");
                    System.out.println("-> 적 체력: "+(Enemy.sectionChiefHealthPower-=(Enemy.sectionChiefDefencePower+Character.attackPower)));
                }else{
                    System.out.println("퀴노: 틀렸습니다!");
                    System.out.println("-> "+Character.name+"의 체력: "+(Character.healthPower-=(Character.defencePower+Enemy.sectionChiefAttackPower)));
                }
            }
        }

    }

    public void go_attacking_level3() {
        String[] quiz3 = new String[20];
        quiz3[0]="왕이넘어지면?";
        quiz3[1]="미꾸라지보다 더 큰 물고기는?";
        quiz3[2]="오리를 생으로 먹으면?";
        quiz3[3]="세상에서 가장 지루한 중학교는?";
        quiz3[4]="물고기의 반댓말은?";
        quiz3[5]="신데렐라가 잠을 못자면?";
        quiz3[6]="세상에서 가장 잔인한 비빔밥은?";
        quiz3[7]="땅이 우는 소리는?";
        quiz3[8]="신발이 화나면?";
        quiz3[9]="세상에서 가장 가난한 왕은?";
        quiz3[10]="곰이 목욕하는 곳은?";
        quiz3[11]="차가 놀라면?";
        quiz3[12]="왕이 궁에 가기 싫으면?";
        quiz3[13]="새우가 출연하는 드라마는?";
        quiz3[14]="맨날 미안해 하는 동물은?";
        quiz3[15]="이상한 사람들만 가는 곳은?";
        quiz3[16]="노인들이 가장 좋아하는 폭포는?";
        quiz3[17]="고등학생들이 가장 싫어하는 나무는?";
        quiz3[18]="형이랑 동생이 싸웠는데 동생 편만 드는 세상을 뭐라고 할까요?";
        quiz3[19]="자동차를 톡하고 치면?";

        String[] answer3 = new String [20];
        answer3[0]="킹콩";
        answer3[1]="미꾸엑스라지";
        answer3[2]="회오리";
        answer3[3]="로딩중";
        answer3[4]="불고기";
        answer3[5]="모짜렐라";
        answer3[6]="산채비빔밥";
        answer3[7]="흙흙";
        answer3[8]="신발끈";
        answer3[9]="최저임금";
        answer3[10]="곰탕";
        answer3[11]="카놀라유";
        answer3[12]="궁시렁궁시렁";
        answer3[13]="대하드라마";
        answer3[14]="오소리";
        answer3[15]="치과";
        answer3[16]="나이아가라폭포";
        answer3[17]="야자나무";
        answer3[18]="형편없는세상";
        answer3[19]="카톡";


        //퀴즈 시작
        int i=1;
        while (true){
            if (Character.healthPower<=0){
                System.out.println("You die");
                break;
            }else if (Enemy.headOfDepartmentHealthPower<=0){
                System.out.println("★☆★★☆★★☆★★☆★★☆★★☆★★☆★★☆★★☆★");
                System.out.println("★☆★★☆★★☆★Finish the Game★☆★★☆★★☆★");
                System.out.println("★☆★★☆★★☆★★☆★★☆★★☆★★☆★★☆★★☆★");
                break;
            }else {
                int number = rand.nextInt(20);
                System.out.println("문제 "+i+"번 \n"+quiz3[number]);
                String user_answer = sc.nextLine();
                if (user_answer.equals(answer3[number])){
                    System.out.println("퀴노: 정답입니다!");
                    System.out.println("-> 적 체력: "+(Enemy.headOfDepartmentHealthPower-=(Enemy.headOfDepartmentDefencePower+Character.attackPower)));
                }else{
                    System.out.println("퀴노: 틀렸습니다!");
                    System.out.println("-> "+Character.name+"의 체력: "+(Character.healthPower-=(Character.defencePower+Enemy.headOfDepartmentAttackPower)));
                }
            }
        }
    }

    public void showInTheGameInformation() {
        System.out.println("이름 : " + Character.name);
        System.out.println("레벨 : " + Character.level);
        System.out.println("체력 : " + Character.healthPower);
        System.out.println("공격력 : " + Character.attackPower);
        System.out.println("방어력 : " + Character.defencePower);
        System.out.println("가진 돈 : " + Character.money);
    }
}
