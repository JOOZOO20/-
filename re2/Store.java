package com.company;

import java.util.Scanner;

// Item 클래스를 상속받는 store 클래스
public class Store {
    Boolean playing = Boolean.TRUE;
    int num;
    int num1;
    int attackWeaponPrice = 200; //+200하면 공격무기 업그레이드
    int defenceWeaponPrice = 400; //+300하면 방패무기 업그레이드
    int attackWeaponPower = 10;
    int defenceWeaponPower = 40;
    //    Character Attack = new Character(level1_healthPower,level1_attackPower,level1_defencePower);
//    Character Defence = new Character(level1_healthPower,level1_attackPower,level1_defencePower);
    Lobby where = new Lobby();
    String[] attackWeapon = {"소소한 검", "화려한 검", "소소한 총", "화려한 총", "소소한 활", "화려한 활"};
    String[] defenceWeapon = {"소소한 방패", "화려한 방패", "거대한 방패", "초대형 방패"};
    int[] attackWeaponPrice_List = new int[6];
    int[] attackWeaponPower_List = new int[6];
    int[] defenceWeaponPrice_List = new int[4];
    int[] defenceWeaponPower_List =new int[4];
    Information show = new Information();
    Tutorial sleep;
    Store(){
        this.sleep=new Tutorial();
    }

    public void makingMenu(){
        for (int i = 0; i < 6; i++) {
            attackWeaponPrice_List[i] = attackWeaponPrice;
            attackWeaponPower_List[i]=attackWeaponPower;
            attackWeaponPrice += 200;
            attackWeaponPower += 5;
        }
        for (int i = 0; i < 4; i++) {
            defenceWeaponPrice_List[i] = defenceWeaponPrice;
            defenceWeaponPower_List[i]=defenceWeaponPower;
            defenceWeaponPrice += 300;
            defenceWeaponPower += 10;
        }
        printMenu();
    }

    //상점 메뉴판 출력하는 printMenu 메소드
    public void printMenu() {
        System.out.println(" 콩돌▶ 콩돌상점에 오신것을 환영해 콩");
        System.out.println("--------------메뉴판--------------");
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + ") " + attackWeapon[i] + " 가격: " + attackWeaponPrice_List[i] + " 공격력: +" + attackWeaponPower_List[i]);
        }
        for (int i = 6; i < 10; i++) {
            System.out.println((i+1) + ") " + defenceWeapon[i-6] + " 가격: " + defenceWeaponPrice_List[i-6] + " 방어력: +" + defenceWeaponPower_List[i-6]);
        }
        chooseItem();
    }

    //아이템 구매를 하는 chooseItem 메소드
    public void chooseItem() {
        System.out.println("---------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("콩돌▶ 어떤 물건을 살거냐 콩");
        System.out.println("콩돌▶ 원하는 물건의 번호를 누르고 enter를 눌러줘 콩");
        num = scanner.nextInt(); //변수 num을 통해 사용자의 입력을 받아 살 아이템을 결정함.
        if (num >= 1 && num <= 10) {
            numberChoose();
        } else {
            System.out.println("콩돌▶ 없는 메뉴야. 다시 입력해주라 콩");
            chooseItem();
        }
    }

    //본격적으로 아이템 구매 및 장착이 이루어지는 메소드
    public void numberChoose() {
        int i = num;
        int j = num;
        if (i >= 1 && i <= 6) {
            if ((Character.money-attackWeaponPrice_List[i-1])>=0){
                Character.Weapon = attackWeapon[i - 1];
                Character.money -= attackWeaponPrice_List[i-1];
                Character.attackPower+=attackWeaponPower_List[i-1];
                System.out.println("콩돌▶ " + Character.name + "님이 선택하신 무기는 '" + Character.Weapon + "' 입니다.");
                System.out.println("내 캐릭터 돈: -"+attackWeaponPrice_List[i-1]+"\t증가된 공격력: +"+attackWeaponPower_List[i-1]);
                sleep.makeSleepingThroughException(400);
                show.showPlayerInformation_level(show);
            }
            else{
                System.out.println("콩돌▶ 이런?! "+Character.name+" 은 지금 돈이 없잖아??");
                System.out.println("콩돌▶ '"+attackWeapon[i-1]+"' 을 사고 싶다면 "+attackWeaponPrice_List[i-1]+"원이 더 필요해.");
                sleep.makeSleepingThroughException(400);
            }
        } else if (j >= 6 && j <= 10) {
            if ((Character.money-defenceWeaponPrice)>=0){
                Character.Weapon = defenceWeapon[j - 6];
                Character.money -= defenceWeaponPrice_List[j-6];
                Character.defencePower+=defenceWeaponPower_List[j-6];
                System.out.println("콩돌▶ " + Character.name + "님이 선택하신 무기는" + Character.Weapon + "입니다.");
                System.out.println("내 캐릭터 돈: -"+defenceWeaponPrice_List[j-1]+"\t증가된 방어력: +"+defenceWeaponPower_List[j-1]);
                sleep.makeSleepingThroughException(400);
                show.showPlayerInformation_level(show);
            }else{
                System.out.println("콩돌▶ 이런?! "+Character.name+" 은 지금 돈이 없잖아??");
                System.out.println("콩돌▶ '"+defenceWeapon[j-6]+"' 을 사고 싶다면 "+defenceWeaponPrice_List[j-6]+"원이 더 필요해.");
                sleep.makeSleepingThroughException(400);
            }
        }
        buyMore();
    }


    // 아이템을 더 살건지 묻는 buyMore 메소드
    public void buyMore() {
        System.out.println("---------------------------------");
        System.out.println("콩돌▶ 더 사실 건가요? 콩");
        System.out.println("1) 응, 더 살거야.");
        System.out.println("2) 아니, 이 정도면 됐어.");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("---------------------------------");
        if (num1 == 1) {
            printMenu();
        } else if (num1 == 2) {
            System.out.println("콩돌▶ 그럼 로비로 안내게해드릴게요 콩");
            where.goWherePlace();
        }
    }

}
