package org.example;

public class Main {

   // student s1 =new student().
    public static void main(String[] args) {
        student s1= new student("21800454","우병희" ); //자바가 생성자가 하나도 없으면 기본 생성자 만들어줌, 빈생성자를 쓰고 있어서 에러가 뜸

        System.out.println(s1.toString());
    }
}