package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
    static int i = 5; //전역변수 설정

    static void a() {
        int i = 10; //지역변수 설정
        b();
    }

    static void b() {
        System.out.println(i); //전역변수 사용
    }

    public static void main(String[] args) {

        a();
    }
}
