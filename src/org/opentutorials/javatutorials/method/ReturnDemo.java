package org.opentutorials.javatutorials.method;

public class ReturnDemo {
    public static int one() {
        return 1; //자바는 return을 만나는 순간에 리턴값을 메서드 바깥으로 반환함
        //밑에는 실행조차 안되고 컴파일 조차 안된다.
        //return 2;
        //return 3;
    }

    public static void main(String[] args) {
        System.out.println(one());
    }
}
