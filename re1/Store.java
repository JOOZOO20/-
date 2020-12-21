package com.company;
import java.util.Scanner;

// Item 클래스를 상속받는 store 클래스
public class Store{
    Boolean playing = Boolean.TRUE;
    int num;
    int num1;
    int attackWeaponPrice=200; //+200하면 공격무기 업그레이드
    int defenceWeaponPrice=400; //+300하면 방패무기 업그레이드
    int attackPower=10;
    int defencePower=40;
    int level1_healthPower=100;
    int level1_attackPower=10;
    int level1_defencePower=30;
    Character Attack = new Character(level1_healthPower,level1_attackPower,level1_defencePower);
    Character Defence = new Character(level1_healthPower,level1_attackPower,level1_defencePower);
    Lobby where = new Lobby();
    String[] attackWeapon = {"소소한 검","화려한 검","소소한 총","화려한 총","소소한 활","화려한 활"};
    String[] defenceWeapon = {"소소한 방패","화려한 방패","거대한 방패","초대한 방패"};

//    public Store(String t, String b, String s, String c) {
//        super(t, b, s, c);
//    }


    //상점 메뉴판 출력하는 printMenu 메소드
    public void printMenu() {
        System.out.println(" 콩돌▶ 콩돌상점에 오신것을 환영해 콩");
        System.out.println("--------------메뉴판--------------");
        for(int i=1;i<7;i++){
            System.out.println(i+") "+attackWeapon[i-1]+" 가격: "+attackWeaponPrice+" 공격력: +"+attackPower);
            attackWeaponPrice+=200;
            attackPower+=5;
        }
        for(int i=7;i<11;i++){
            System.out.println(i+") "+defenceWeapon[i-7]+" 가격: "+defenceWeaponPrice+" 방어력: +"+defencePower);
            defenceWeaponPrice+=300;
            defencePower+=10;
        }
        chooseItem();
    }

    //아이템 구매를 하는 chooseItem 메소드
    public void chooseItem(){
        System.out.println("---------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("콩돌▶ 어떤 물건을 살거냐 콩");
        num = scanner.nextInt(); //변수 num을 통해 사용자의 입력을 받아 살 아이템을 결정함.
        if(num>=1 && num <=10){
            numberChoose();
        }
        else {
            System.out.println("없는 메뉴입니다. 다시 선택해주세요");
            chooseItem();
        }
    }


    public void numberChoose (){
        int i=1;
        int j=6;
        while(i<=6){
            if (num==i){
                Attack.Weapon=attackWeapon[i-1];
                Character.money-=attackWeaponPrice;
                System.out.println("콩돌▶ "+Character.name+"님이 선택하신 무기는"+ Attack.Weapon+"입니다.");
                break;
            }
        }
        while(j<=10){
            if(num==j){
                Defence.Weapon=defenceWeapon[i-1];
                Character.money-=defenceWeaponPrice;
                System.out.println("콩돌▶ "+Character.name+"님이 선택하신 무기는"+ Defence.Weapon+"입니다.");
                break;
            }
        }
        buyMore();
//        if (num==1){
//            Attack.Weapon = sword[0];
//            Character.money-=weaponPrice[0];
//            buyMore();
//        }
//        else if(num==2){
//            Attack.Weapon = sword[1];
//        }
//        else if(num==3){
//            Attack.Weapon = gun[0];
//        }
//        else if(num==4){
//            Attack.Weapon = gun[1];
//        }
//        else if(num==5){
//            Attack.Weapon = bow[0];
//        }
//        else if(num==6){
//            Attack.Weapon = bow[1];
//        }
//        else if(num==7){
//            Defence.Weapon = shield[0];
//        }
//        else if(num==8){
//            Defence.Weapon = shield[1];
//        }
//        else if(num==9){
//            Defence.Weapon = shield[2];
//        }
//        else if(num==10){
//            Defence.Weapon = shield[3];
//        }
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
            System.out.println("콩돌▶ 그럼 로비로 안내게해드릴게요 콩");
            where.goWherePlace();
        }
    }

}
