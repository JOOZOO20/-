package com.company;

// 정보를 안내하는 Information 클래스
public class Information {

    //나의 캐릭터의 정보를 출력하는 showMyInfo 클래스메소드
    static void showMyInfo(Character level1) {
        System.out.println("------------------------------------");
        System.out.println("------------내 캐릭터 정보------------");
        System.out.println("이름 : "+Character.name);
        System.out.println("체력: "+level1.hp);
        System.out.println("공격력: "+level1.ap);
        System.out.println("방어력: "+level1.dp);
        System.out.println("가진 돈: "+Character.money);
    }

}
