package com.company;

import java.util.Scanner;

public class Tutorial {
    public int choosing;
    Opening a = new Opening();
    public void GameInformation(){
        Opening.count+=1;
        if(Opening.count<=1){
            System.out.println("열정페이 노예: '어서와.... 너는... 신규 노예구나...?");
            makeSleepingThroughException(850);
            System.out.println("귀가 얇은 노예: '혹시 너도 너굴이가 이주 패키지 무료로 하게 해준다고 해서 왔니?'");
            System.out.println("1번) 응, 맞아.\n2번) 아니야. 난 다른 이유인데?");
            Scanner scanner = new Scanner(System.in);
            choosing = scanner.nextInt(); //choosing 변수를 통해 사용자로부터 게임을 하고 있다는 느낌을 주기 위해 숫자를 입력받음
            if (choosing==1){
                System.out.println("열정페이 노예: 역시 너도 그 계략에 당했군..");
                makeSleepingThroughException(850);
            }else{
                System.out.println("열정페이 노예: ..세상물정을 모르는 구나..?");
                makeSleepingThroughException(850);
                System.out.println("귀가 얇은 노예: 누군가 길거리에서 도를 아시냐고 물으면 무조건 피하는 건 알고 있지?");
                makeSleepingThroughException(850);
            }
            System.out.println("그냥 노예: 하는 수 없어. 여기 들어온 이상 부장이라는 괴물을 물리쳐야만 노예를 탈출할 수 있어.");
            makeSleepingThroughException(850);
            System.out.println("모든 노예: ..건투를 빌어.. 신입 노예..");
            makeSleepingThroughException(400);
        }else{
            System.out.println("모든 노예: 우리는 지금 노예일만해도 충분히 바빠..");
            makeSleepingThroughException(850);
            System.out.println("모든 노예: 더 이상 그만 불러줘..");
        }


        //여기 사이에 시간 2초정도 흐른 다음 저 printing 함수 호출하고 scanner 했음 좋겟음. -> 쓰레드구현;-;
        Lobby where = new Lobby();
        where.goWherePlace();
    }

    public void makeSleepingThroughException(int m) {
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
//        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◆◇");
//        System.out.println("◇◆◇◆게임설명을 진행할 줄 알았죠?◇◆◇◆◇◆");
//        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
//        System.out.println("◇◆게임을 하면서 어떤게임인지 맞추어보세요◇◆");
//        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆";
