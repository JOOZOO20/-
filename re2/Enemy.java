package com.company;

public class Enemy { //이용가능한 기본 생성자가 없다 - ?
    String deputySectionChief="대리";
    String sectionChief="과장";
    String headOfDepartment="부장";

    //대리의 기본정보
    int deputySectionChiefHealthPower=100;
    int deputySectionChiefAttackPower=10;
    int deputySectionChiefDefencePower=3;

    //과장의 기본정보
    int sectionChiefHealthPower=200;
    int sectionChiefAttackPower=20;
    int sectionChiefDefencePower=6;

    //부장의 기본정보
    int headOfDepartmentHealthPower=300;
    int headOfDepartmentAttackPower=30;
    int headOfDepartmentDefencePower=9;


}
//논센스 문제들 난이도 별로 배열로 만들어 놓고 랜덤으로 각 위치에 넣어주기