package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("어서와 구리");
        System.out.println("해적 무인도 이주 패키지에 오신 것을 환영하구리");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        Opening a = new Opening();
        a.sayYourName(); //이름알려달라는 출력을 담당하는 메소드 호출
    }
}



//---------------memo line------------------
//10.09
// 메소드 첫 글자 = 소문자
// 클래스 첫 글자 = 대문자 , 첫 문자 = 동사
// 둘 다 마찬가지로 띄어쓰기마다 대문자

//10.06
//변수명 소문자, static만 소문자로 시작 x
//변수이름 full name 적어주기.
//com. 지우기
//선언할때는 파라미터의 값을 지정해줘야함. at java
//shift+f6, alt shift click


//10.03
////CASE OF JAVA메소드 이름 시작 : 동사, 첫 글자소문자
////parameter use, character levelup method

//09.28
//private 같은 클래스 內에서만 접근 가능
//default 같은 패키지 內에서만 접근 가능
//protected 같은 패키지 內 or 다른패키지's 자손클래스에서 접근 가능
//public 접근 제한 xx
//static을 사용해서 클래스메소드로 만들면 멤버변수 사용 불가.

//09.16
//상속의 종류 (extends, implements)
//선언부 like basic frame form && 구현부 have method and instance

//09.14
//첫글자 대문자로
//PageItem 띄어쓰기 들어가는 곳마다 대문자
//클래스별로 파일 따로 (O)
