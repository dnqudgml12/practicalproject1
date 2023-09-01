package org.example;

public class student {
    //멤버변수,생성자,gettersandsetters,멤버스 로 구성
    //String으로 한다, int는 계산으로 할때씀

    //접근 지정자 privte,public,protected,default
    private String WBH;
    private String name;


    public student(String WBH, String name) {
        //super class에 있는 애들 나오는거 overloading(같은 함수 이름으로 파라미터만 다르게 여러개)
        // overring(superclass에 있는 애들 상속받아서 다시 만드는 애들)
        this.WBH = WBH; //생성자
        this.name = name; //생성자
    }


    //getter,setter로 private 상태에서 접근하도록 한다
    public String getWBH() {
        return WBH;
    }

    public void setWBH(String WBH) {
        this.WBH = WBH;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "student : " + WBH+ " "+ name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
