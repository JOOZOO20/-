package com.company;

public class Information {
    Character character = new Character();
    Lobby reGo;

    Information(){
        this.reGo = new Lobby();
    }


    public void showPlayerInformation_level(Information input) {
        System.out.println("이름 : " + Character.name);
        System.out.println("레벨 : " + Character.level[0]);
        System.out.println("체력 : " + Character.healthPower);
        System.out.println("공격력 : " + Character.attackPower);
        System.out.println("방어력 : " + Character.defencePower);
        System.out.println("가진 돈 : " + Character.money);
        System.out.println("------------------------------------");
        System.out.println("로비로 이동하겠습니다.");
        try {
            Thread.sleep(1000);
            reGo.goWherePlace();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
