package com.company;

import java.util.Scanner;

// Item 클래스를 상속받는 store 클래스
public class Store extends Item {
    public int money; //Item클래스를 상속하고 '돈'을 나타낼 인스턴스 추가
    private int num;
    private int num1;
    static String AWeapon = "공격";
    static String DWeapon = "방어";
    int AWP; //AttackWeaponPrice
    int DWP; //DefenceWeaponPrice
    int APower; //AttackPower
    int weaponPrice; //아이템 가격의 멤버변수
    Character Attack = new Character();
    Character Defence = new Character();
    Places a = new Places();

    public Store(String t, String b, String s, String c) {
        super(t, b, s, c);
    }


    //상점 메뉴판 출력하는 printMenu 메소드
    public void printMenu() {
        System.out.println(" 콩돌▶ 콩돌상점에 오신것을 환영해 콩");
        System.out.println("--------------메뉴판--------------");
        System.out.println("1) 소소한 검, 가격: 200, 공격력: +10");
        System.out.println("2) 화려한 검, 가격: 400, 공격력: +15");
        System.out.println("3) 소소한 총, 가격: 600, 공격력: +20");
        System.out.println("4) 화려한 총, 가격: 800, 공격력: +25");
        System.out.println("5) 소소한 활, 가격: 1000, 공격력: +30");
        System.out.println("6) 화려한 활, 가격: 1200, 공격력: +35");
        System.out.println("7) 소소한 방패, 가격: 400, 공격력: +40");
        System.out.println("8) 화려한 방패, 가격: 700, 공격력: +45");
        System.out.println("9) 거대한 방패, 가격: 1000, 공격력: +50");
        System.out.println("10) 초대형 방패, 가격: 1300, 공격력: +55");
        chooseItem();
    }

    //아이템 구매를 하는 chooseItem 메소드
    public void chooseItem(){
        System.out.println("---------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("콩돌▶ 어떤 물건을 살거냐 콩");
        num = scanner.nextInt(); //변수 num을 통해 사용자의 입력을 받아 살 아이템을 결정함.

        if(num>=1 && num <=6){
            NumberChoose();
            Character.money-=weaponPrice; //나중에 가격 빼는거 수정해야함
            System.out.println("콩돌▶ "+Character.name+"님이 선택하신 무기는"+ Attack.Weapon+"입니다.");
        }

        //while-break 수정하면 되지 않을까
        else if (num>=7 && num<=10){
             NumberChoose();
            Character.money-=weaponPrice; // 나중에 가격 빼는거 수정해야함
            System.out.println("콩돌▶ "+Character.name+"님이 선택하신 무기는"+ Defence.Weapon+"입니다.");
        }

        else {
            System.out.println("없는 메뉴입니다. 다시 선택해주세요");
            chooseItem();
        }
        buyMore();
    }


    // 아이템을 더 살건지 묻는 buyMore 메소드
    public void buyMore(){
        System.out.println("---------------------------------");
        System.out.println("콩돌▶ 더 사실 건가요? 콩");
        System.out.println("1) 응, 더 살거야.");
        System.out.println("2) 아니, 이 정도면 됐어.");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("---------------------------------");
        if(num1 == 1){
            printMenu();
        }
        else if(num1 == 2){
            ReturnLobby();
        }
    }

    public void ReturnLobby(){
        System.out.println("콩돌▶ 그럼 로비로 안내게해드릴게요 콩");
        a.goWhereMent();
        a.inputPlace();
    }

    public void NumberChoose (){
        if (num==1){
            Attack.Weapon = "소소한 검";
        }
        else if(num==2){
            Attack.Weapon = "화려한 검";
        }
        else if(num==3){
            Attack.Weapon = "소소한 총";
        }
        else if(num==4){
            Attack.Weapon = "화려한 총";
        }
        else if(num==5){
            Attack.Weapon = "소소한 활";
        }
        else if(num==6){
            Attack.Weapon = "화려한 활";
        }
        else if(num==7){
            Defence.Weapon = "소소한 방패";
        }
        else if(num==8){
            Defence.Weapon = "화려한 방패";
        }
        else if(num==9){
            Defence.Weapon = "거대한 방패";
        }
        else if(num==10){
            Defence.Weapon = "초대형 방패";
        }
    }
}
