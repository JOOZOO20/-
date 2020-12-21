package com.company;

    public class Character extends Level {
        static int money=0;
        static String name;
        static String Weapon;
        int dp; //defence-power 공격력
        static int[] level={1,2,3};
        Character(int hp, int ap, int dp){
            super(hp, ap);
            this.dp = dp;
        }
    }

