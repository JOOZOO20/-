package com.company;

public class Tutorial {
    public void GameInformation(){
        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◆◇");
        System.out.println("◇◆◇◆게임설명을 진행할 줄 알았죠?◇◆◇◆◇◆");
        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
        System.out.println("◇◆게임을 하면서 어떤게임인지 맞추어보세요◇◆");
        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");


        //여기 사이에 시간 2초정도 흐른 다음 저 printing 함수 호출하고 scanner 했음 좋겟음. -> 쓰레드구현;-;
        Places lobby = new Places();
        lobby.goWhereMent();
        lobby.inputPlace();
    }

}
