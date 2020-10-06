package com.company;
import java.util.Scanner;

//어디로 갈지 선택을 받는 클래스
public class Places {
    private int ChooseNum;
    private int NameChoose;


    // 플레이어의 이름을 묻는 메소드
    public void sayYourName(){
        System.out.println("[너굴]▶ 혹시 새로 이사온 이웃 주민이냐? 구리");
        System.out.println("[너굴]▶ 그럼 이름부터 알려주라 구리");
        System.out.println("당신의 이름은? (이름은 '영어' or '숫자' or '숫자+영어' 입력만 가능합니다.) : ");
        Scanner scanner = new Scanner(System.in);
        Character.name = scanner.nextLine(); //캐릭터 이름을 입력받아 저장함.

        //사용자가 입력한 이름이 맞는지 확인함
        System.out.println("[너굴]▶ 흐음 "+Character.name+", 이 이름 맞아?");
        System.out.println("1) 응, 맞아");
        System.out.println("2) 뭐~?? 아니야!!");
        NameChoose = scanner.nextInt(); //1,2번 선택을 통해 사용자로부터 yes or no 답변을 받아냄

        //사용자가 이름을 정확히 입력했을 경우
        if(NameChoose==1){
            System.out.println("------------------------------------");
            System.out.println("[너굴]▶ 그럼 이제 해적 무인도에서 잘 살아보자구리");
            System.out.println("[너굴]▶ 이동할 곳을 선택해주라 구리");
            goWhereMent(); //선택지 출력
            inputPlace(); //선택지에 맞게끔 이동하는 함수
        }
        //사용자가 이름을 잘못 입력했을 경우
        else if(NameChoose==2){
            System.out.println("------------------------------------");
            System.out.println("[너굴]▶ ??!!다시 제대로 입력해줘 구리");
            sayYourName(); //sayYourName 메소드를 재귀호출하여 이름을 다시 입력받음.
        }
    }


    //이동장소 선택지 출력하는 메소드
    public static void goWhereMent(){
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("어느 곳으로 이동하시겠습니까?");
        System.out.println("1번 튜토리얼");
        System.out.println("2번 치유공간");
        System.out.println("3번 싸움터");
        System.out.println("4번 상점");
        System.out.println("5번 내 캐릭터 정보 확인");
    }

    //사용자로부터 이동장소를 입력받고 해당하는 위치로 이동하는 inputPlace 메소드
    public void inputPlace(){
        Scanner scanner = new Scanner(System.in);
        ChooseNum = scanner.nextInt(); //ChooseNum변수를 통해 사용자로부터 이동할 공간을 숫자로 입력받음.

        if(ChooseNum==2){
            CurePlace a = new CurePlace();
            a.showInfoMent(); //2번을 입력하면 치유공간 인포메이션 메소드로 이동
        }
        else if(ChooseNum==3){
            FightPlace.IDontKnow(); //3번을 입력하면 싸움터 아돈노(아직 미정이라 아이돈노) 메소드로 이동
        }
        else if(ChooseNum==4){
            Store Go = new Store("dd","aa","dd","aa");
            Go.printMenu(); //4번을 입력하면 상점의 메뉴판을 나타내는 함수 호출
        }
        else if(ChooseNum==5){
            Information.showMyInfo(Character level1); //5번을 입력하면 나의 정보를 보여주는 showInfo 클래스의 showMyInfo 메소드 호출
        }
        else{
            Tutorial call = new Tutorial(); //Turorial 클래스의 인스턴스 생성
            call.GameInformation(); //Turorial 클래스의 게임 정보 설명하는 메소드 호출
        }

    }


}