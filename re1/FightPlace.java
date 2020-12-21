package com.company;

public class FightPlace {
    Enemy information = new Enemy();

    public void sayOpeningMent(){
        System.out.println("ººººººººººººººººººººººººººººººººººººººº");
        System.out.println("ººººººººººº싸움터로 이동중입니다ººººººººººº");
        System.out.println("ººººººººººººººººººººººººººººººººººººººº");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {}
        level1_deputySectionChief();
    }


    //퀴즈 한번 못 맞힐때마다 -hp,
    //대리 레벨의 적
    public void level1_deputySectionChief(){
        System.out.println(information.deputySectionChief+": 어서와요. 우린 가족같은 분위기에서 일해요^^");
        System.out.println(information.deputySectionChief+": 나는 과장님, 부장님이랑 다르게 그런 농담안해요~");
        System.out.println(information.deputySectionChief+": 그럼 우리 같이 일 잘해봐요~^^");
        System.out.println(information.deputySectionChief+": 왕이 넘어지면?"); //arraylist로 하고 싶은데 왜 안되는 걸까요
    }

    //과장 레벨의 적
    public void level2_sectionChief(){

    }

    //부장 레벨의 적
    public void level3_headOfDepartment(){

    }

    public void go_attacking_level1() {
        String[] quiz = new String[30];
        quiz[0]="왕이넘어지면?";
        quiz[1]="미꾸라지보다 더 큰 물고기는?";
        quiz[3]="왕이넘어지면?";
        quiz[4]="미꾸라지보다 더 큰 물고기는?";
        quiz[5]="왕이넘어지면?";
        quiz[6]="미꾸라지보다 더 큰 물고기는?";
        quiz[7]="왕이넘어지면?";
        quiz[8]="미꾸라지보다 더 큰 물고기는?";
        quiz[9]="왕이넘어지면?";
        quiz[10]="미꾸라지보다 더 큰 물고기는?";
        quiz[11]="왕이넘어지면?";
        quiz[12]="미꾸라지보다 더 큰 물고기는?";
        quiz[13]="왕이넘어지면?";
        quiz[14]="미꾸라지보다 더 큰 물고기는?";
        quiz[15]="왕이넘어지면?";
        quiz[16]="미꾸라지보다 더 큰 물고기는?";
        quiz[17]="왕이넘어지면?";
        quiz[18]="미꾸라지보다 더 큰 물고기는?";

        String[] answer = new String [30];
        answer[0]="킹콩";

    }





//    논센스퀴즈를 맞추냐 못 맞추냐에 따라 적을 공격할 수 있는거임. 타자게임처럼.
//    몬스터 레벨에 따라 각 이름이 대리, 과장, 부장 이렇게 나뉨.
//    arrayList에 여러 문제 넣어놓고 중간에 "그럼 제가 한 번 내보겠습니다."로 player가 역공격하고 포인트얻는 chance있었으면 좋겠는데 arrayList가 지금 안됨.
}
