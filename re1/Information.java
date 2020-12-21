package com.company;

public class Information {
    int healthPower;
    int attackPower;
    int defencePower;
    Lobby reGo;

    Information(){
        this.healthPower=100;
        this.attackPower=10;
        this.defencePower=3;
        this.reGo = new Lobby();
    }

    void showPlayerInformation_level(Information input) {
        System.out.println("이름 : " + Character.name);
        System.out.println("레벨 : " + Character.level[0]);
        System.out.println("체력 : " + healthPower);
        System.out.println("공격력 : " + attackPower);
        System.out.println("방어력 : " + defencePower);
        System.out.println("가진 돈 : " + Character.money);
        System.out.println("------------------------------------");
        System.out.println("로비로 이동하겠습니다.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        reGo.goWherePlace();
    }
}
