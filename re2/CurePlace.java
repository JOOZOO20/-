package com.company;


import java.util.Scanner;

public class CurePlace {
//    Character character = new Character();
    int carePrice = 5; //유료가격
    int yesMoneyPlusHp = 10; //유료일 때 증진되는 체력
    int noMoneyPlusHp = 1; //무료일 때 증진되는 체력
    private int num; //물리치료 진행여부를 입력받는 변수
    private int num1; // 유료/무료치료의 여부를 입력받는 변수
    static boolean fee; // 무료,유료 여부에 따라 달라지는 회복력의 차이
    Lobby where;
    Information info = new Information();
    CurePlace(){
        this.where=new Lobby();
    }


    //치유센터 안내를 담당하는 메소드
    public void showInfoMent (){
        System.out.println("[물리치료사]▶ 이곳은 치유공간으로 체력을 증진시킬 수 있습니다.");
        System.out.println("[물리치료사]▶ 유료치료의 경우 체력은 "+yesMoneyPlusHp+"이 증가되고, 가격은 "+carePrice+"원 입니다.");
        System.out.println("[물리치료사]▶ 반면 무료치료의 경우 체력은 "+noMoneyPlusHp+"이 증가되고, 가격은 무료입니다.");
        HowAbout(); // 물리치료 진행 여부를 묻는 메소드 호출
    }

    public void HowAbout(){
        System.out.println("[물리치료사]▶ 치료를 진행하시겠습니까?");
        System.out.println("1) 넹!");
        System.out.println("2) 앗.. 아뇨.. 담에 다시올게요~^^;");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt(); //변수 num을 통해 사용자의 입력을 받음

        // 1번, yes를 선택할 경우
        if(num==1){
            System.out.println("------------------------------------");
            System.out.println("[물리치료사]▶ 무료치료를 하시겠습니까, 유료치료를 하시겠습니까?");
            System.out.println("1) 유료치료");
            System.out.println("2) 무료치료");
            num1 = scanner.nextInt();

            if (num1==1){
                if(Character.money>=5){
                System.out.println("------------------------------------");
                Character.money-=5;
                Character.healthPower +=10;
                info.showPlayerInformation_level(info);
                where.goWherePlace();
                }
                else{
                    System.out.println("[물리치료사]▶ 오우.. 미안하지만 우리는 일정 돈이 있어야 들어올 수 있어요..");
                    System.out.println("[물리치료사]▶ 다음에 다시 봅시다.");
                    Tutorial a= new Tutorial();
                    a.makeSleepingThroughException(450);
                    where.goWherePlace();
                }

            }
            else if(num1==2){
                System.out.println("------------------------------------");
                Character.healthPower += 1;
                info.showPlayerInformation_level(info);
            }

        }
        // 2번, No를 선택할 경우
        else if (num==2) {
            System.out.println("------------------------------------");
            System.out.println("[물리치료사]▶ 그럼 로비로 연결해 드리겠습니다.");
            where.goWherePlace();
        }
    }


}
