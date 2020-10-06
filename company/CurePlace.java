package com.company;
import java.util.Scanner;

public class CurePlace {
    int CarePrice = 5; //유료가격
    int YPlusHp = 10; //유료일때 증진되는 체력
    int NPluseHp = 1; //무료일때 증진되는 체력
    private int num; //물리치료 진행여부를 입력받는 변수
    private int num1; // 유료/무료치료의 여부를 입력받는 변수
    static boolean fee; // 무료,유료 여부에 따라 달라지는 회복력의 차이


    //치유센터 안내를 담당하는 메소드
    public void showInfoMent (/*Character level1*/){
        System.out.println("이름: "+Character.name+" 체력: "/*+level1.hp*/);
        System.out.println("[물리치료사]▶ 이곳은 치유공간으로 체력을 증진시킬 수 있습니다.");
        System.out.println("[물리치료사]▶ 유료치료의 경우 체력은 "+YPlusHp+"이 증가되고, 가격은 "+CarePrice+"원 입니다.");
        System.out.println("[물리치료사]▶ 반면 무료치료의 경우 체력은 "+NPluseHp+"이 증가되고, 가격은 무료입니다.");
        HowAbout(Character level1); // 물리치료 진행 여부를 묻는 메소드 호출
    }

    public void HowAbout(Character level1){
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
                System.out.println("------------------------------------");
                level1.hp +=10;
                Character.money-=5;
                Information.showMyInfo(Character level1);
            }
            else if(num1==2){
                System.out.println("------------------------------------");
                level1.hp += 1;
                Information.showMyInfo(Character level1);
            }

        }

        // 2번, No를 선택할 경우
        else if (num==2){
            System.out.println("------------------------------------");
            System.out.println("[물리치료사]▶ 그럼 로비로 연결해 드리겠습니다.");
            Places lobby = new Places();
            lobby.goWhereMent();
            lobby.inputPlace();
        }
    }


}
