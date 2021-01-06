package com.company;

import java.util.Scanner;

public class Lobby {
    public int chooseNum;
    Tutorial call = new Tutorial();

    //lobby든 information이든 둘 중 하나는 끊어줘야함
    //그리구 lobby에서 this.show=new Information(level1_healthPower,level1_attackPower,level1_defencePower
    //해결.

    //이동장소 선택지를 출력하고 사용자로부터 이동장소를 입력받고 해당 위치로 이동하는 goWherePlace 메소드
    public void goWherePlace() {
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("어느 곳으로 이동하시겠습니까?");
        System.out.println("1번 튜토리얼");
        System.out.println("2번 치유공간");
        System.out.println("3번 싸움터");
        System.out.println("4번 상점");
        System.out.println("5번 미니게임");
        System.out.println("6번 내 캐릭터 정보 확인");

        Scanner scanner = new Scanner(System.in);
        chooseNum = scanner.nextInt(); //ChooseNum변수를 통해 사용자로부터 이동할 공간을 숫자로 입력받음.

        if(chooseNum == 2){
            CurePlace a = new CurePlace();
            a.showInfoMent(); //2번을 입력하면 치유공간 인포메이션 메소드로 이동
        }
        else if(chooseNum == 3){
            FightPlace b = new FightPlace();
            b.sayOpeningMent(); //3번을 입력하면 싸움터 레벨1_대리로 이동
        }
        else if(chooseNum == 4){
            Store Go = new Store();
            Go.makingMenu(); //4번을 입력하면 상점의 메뉴판을 나타내는 함수 호출
        }
        else if(chooseNum == 5){
            MiniGame go = new MiniGame();
            go.expainMinigame();
        }
        else if (chooseNum==6){
            System.out.println("이름 : " + Character.name);
            System.out.println("레벨 : " + Character.level);
            System.out.println("체력 : " + Character.healthPower);
            System.out.println("공격력 : " + Character.attackPower);
            System.out.println("방어력 : " + Character.defencePower);
            System.out.println("가진 돈 : " + Character.money);
            call.makeSleepingThroughException(600);
            goWherePlace();
        }
        else{
            call.GameInformation(); //Turorial 클래스의 게임 정보 설명하는 메소드 호출
        }
    }
}
