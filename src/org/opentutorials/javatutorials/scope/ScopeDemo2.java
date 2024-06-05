package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i; //전역 변수

    static void a(){
        i = 0; //전역변수인 i 사용
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }//무한 실행
}
//무한 루프 해결 방법
//1. 메서드 a에 int i = 0;으로 설정
//2. for문에 있는 i = 0을 int i = 0으로 바꾸기