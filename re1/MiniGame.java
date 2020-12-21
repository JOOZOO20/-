package com.company;

import java.util.Scanner;

public class MiniGame {
    Tutorial makeSleep = new Tutorial();
    public void expainMinigame(){
        int choose;
        System.out.println("겜노(게임노예): '미니게임'은 돈을 벌 수 있는 곳이야.");
        makeSleep.makeSleepingThroughException(800);
        System.out.println("겜노(게임노예): 말 그대로 게임을 통해 돈을 벌 수 있어.");
        makeSleep.makeSleepingThroughException(800);
        System.out.println("겜노(게임노예): 미니게임에 참여할 의사가 있니?");
        System.out.println("1) 당연하지. 어떻게든 돈을 벌겠어\n2) 난 돈 많아서 굳이 필요 없어.");
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();
        makeSleep.makeSleepingThroughException(800);
        if (choose==1){
            System.out.println("겜노(게임노예): 자, 여기. 메뉴판이야.");
            makeSleep.makeSleepingThroughException(800);
        }else{
            Lobby reGo = new Lobby();
            reGo.goWherePlace();
        }
    }
    public void menuOfTheMiniGame(){
        String[] menu = {};
    }
}
