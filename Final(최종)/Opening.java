package com.company;
import java.util.Scanner;

//어디로 갈지 선택을 받는 클래스
public class Opening {
    private int nameChoose;
    Lobby where = new Lobby();
    // 플레이어의 이름을 묻는 메소드
    public void sayYourName() {
        System.out.println("[너굴]▶ 혹시 새로 이사온 이웃 주민이냐? 구리");
        System.out.println("[너굴]▶ 그럼 이름부터 알려주라 구리");
        System.out.println("당신의 이름은? (이름은 '영어' or '숫자' or '숫자+영어' 입력만 가능합니다.) : ");
        Scanner scanner = new Scanner(System.in);
        Character.name = scanner.nextLine(); //캐릭터 이름을 입력받아 저장함.

        //사용자가 입력한 이름이 맞는지 확인함
        System.out.println("[너굴]▶ 흐음 " + Character.name + ", 이 이름 맞아?");
        System.out.println("1) 응, 맞아");
        System.out.println("2) 뭐~?? 아니야!!");

        Scanner scanner2 = new Scanner(System.in);
        nameChoose = scanner2.nextInt(); //1,2번 선택을 통해 사용자로부터 yes or no 답변을 받아냄

        recallName();
    }

    public void recallName(){
        if(nameChoose==1){
            System.out.println("------------------------------------");
            System.out.println("[너굴]▶ 그럼 이제 해적 무인도에서 잘 살아보자구리");
            System.out.println("[너굴]▶ 이동할 곳을 선택해주라 구리");
            where.goWherePlace(); //선택지에 맞게 이동하는 메소드 호출
        }
        //사용자가 이름을 잘못 입력했을 경우
        else if(nameChoose==2){
            System.out.println("------------------------------------");
            System.out.println("[너굴]▶ ??!!다시 제대로 입력해줘 구리");
            sayYourName(); //sayYourName 메소드를 재귀호출하여 이름을 다시 입력받음.
        }
    }


}
