package com.company;
public class Character extends Level {

    static String name;
    static int money;
    String[] HoldWeapon = {};
    String Weapon; //AttackWeapon의 줄임말. 갖고 있는 무기
    int dp; //defence-power 공격력

    Character(int hp, int ap, int dp){
        super(hp, ap);
        this.dp = dp;
    }
}



// Item클래스를 implements,level도 상속