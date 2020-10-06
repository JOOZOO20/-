package com.company;

public class Main {
    public static void main(String[] args) {

        Opening.Open(); //opening 클래스 객체 생성하고 오프닝 불러옴.
        Places a = new Places();
        a.sayYourName(); //이름알려달라는 출력을 담당하는 메소드 호출

        //플레이어 캐릭터 1레벨의 체력:100, 공격력:10, 방어력:3
        Character level1 = new Character(100,10,3);

        //플레이어 캐릭터 2레벨의 체력:200, 공격력:20, 방어력:6
        Character level2 = new Character(200, 20, 6);

        //플레이어 캐릭터 3레벨의 체력:300, 공격력:30, 방어력:9
        Character level3 = new Character(300, 30, 9);

    }
}



//---------------memo line------------------
//10.03
////CASE OF JAVA메소드 이름 시작 : 동사, 첫 글자소문자
////parameter use, character levelup method

//09.28
//private 같은 클래스 內에서만 접근 가능
//default 같은 패키지 內에서만 접근 가능
//protected 같은 패키지 內 or 다른패키지's 자손클래스에서 접근 가능
//public 접근 제한 xx

//09.16
//상속의 종류 (extends, implements)
//선언부 like basic frame form && 구현부 have method and instance

//09.14
//첫글자 대문자로
//PageItem 띄어쓰기 들어가는 곳마다 대문자
//클래스별로 파일 따로 (O)
