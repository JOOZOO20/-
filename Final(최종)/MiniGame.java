package com.company;

import java.util.Scanner;

public class MiniGame {
    Tutorial makeSleep = new Tutorial();
    int choose;
    Scanner sc = new Scanner(System.in);

    public void expainMinigame() {
        System.out.println("겜노(게임노예): '미니게임'은 돈을 벌 수 있는 곳이야.");
        makeSleep.makeSleepingThroughException(400);
        System.out.println("겜노(게임노예): 말 그대로 게임을 통해 돈을 벌 수 있어.");
        makeSleep.makeSleepingThroughException(400);
        System.out.println("겜노(게임노예): 미니게임에 참여할 의사가 있니?");
        System.out.println("1) 당연하지. 어떻게든 돈을 벌겠어\n2) 난 돈 많아서 굳이 필요 없어.");
        choose = sc.nextInt();
        makeSleep.makeSleepingThroughException(300);
        if (choose == 1) {
            System.out.println("겜노(게임노예): 1~50 사이의 숫자 한 개를");
            makeSleep.makeSleepingThroughException(400);
            System.out.println("겜노(게임노예): 10번 안에 맞추는 게임이야.");
            makeSleep.makeSleepingThroughException(400);
            System.out.println("겜노(게임노예): 5번 이하로 맞추면 50포인트, 그 이후부터는 20포인트야.");
            makeSleep.makeSleepingThroughException(400);
            System.out.println("겜노(게임노예): 물론 10번 안에 맞추지 못한다면 포인트는 없어.");
            makeSleep.makeSleepingThroughException(400);
            System.out.println("겜노(게임노예): 그럼 시작할게!");
            makeSleep.makeSleepingThroughException(400);
            System.out.println("■□■□■□■□■□■□■□■□■");
            makeSleep.makeSleepingThroughException(800);
            playFindNumberIn10Times();
        } else {
            Lobby reGo = new Lobby();
            reGo.goWherePlace();
        }
    }


    public void playFindNumberIn10Times() {
        int randomNumber;
        int userFindNumber;
        int countTurn = 0;
        int opportunityTurn = 9;
        randomNumber = (int) (Math.random() * 50) + 1;
        while (opportunityTurn > 0) {
            System.out.println("숫자를 입력해주세요");
            userFindNumber = sc.nextInt();
            if (userFindNumber <= 50) {
                if (randomNumber == userFindNumber) {
                    System.out.println("와우 " + countTurn + "번 만에 정답을 맞추셨군요");
                    if (countTurn <= 5) {
                        System.out.println("당신은 숫자맞추기 고수이군요? +50 Point");
                        Character.money += 50;
                    } else {
                        System.out.println("안타깝네요.. 조금만 더 하면 고수였는데.. +20 Point");
                        Character.money += 20;
                    }
                    break;
                } else if (randomNumber > userFindNumber) {
                    System.out.println("땡, 정답이 아닙니다. 기회는 " + opportunityTurn + "번 남았습니다.");
                    System.out.println("Hint! " + userFindNumber + "보다 큰 수입니다.\n");
                    countTurn += 1;
                    opportunityTurn -= 1;
                } else {
                    System.out.println("땡, 정답이 아닙니다. 기회는 " + opportunityTurn + "번 남았습니다.");
                    System.out.println("Hint! " + userFindNumber + "보다 작은 수입니다.\n");
                    countTurn += 1;
                    opportunityTurn -= 1;
                }
            } else {
                System.out.println("50 이하의 수로 다시 입력해주세요.\n");
            }
        }
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★");
        System.out.println("☆★☆★☆★게임 끝☆★☆★☆★");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★");
        makeSleep.makeSleepingThroughException(300);

        System.out.println("겜노(게임노예): 한 번 더 해볼래?");
        System.out.println("1번) 응!!\n2번) 아니. 이제 로비로 돌아갈래");
        int choose;
        Scanner sc = new Scanner(System.in);
        choose=sc.nextInt();
        if (choose==1){
            playFindNumberIn10Times();
        }
        else{
            Information info = new Information();
            info.showPlayerInformation_level(info);
        }

    }

}
