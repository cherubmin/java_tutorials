package org.opentutorials.javatutorials.variables;

public class DoubleDemo {

    public static void main(String[] args) {
        double a; //double은 실수 //실수 하지 마세용~
        a = 1.1;
        //만약 변수의 형태가 다르면 프로그램이 실행조차 안된다.
        //실행이 된다는 것은 최소한 변수 타입이 일치한다...

        System.out.println(a + 1.1);
        System.out.println(a + "하하"); //실수 더하기 문자열도 가능하군...
        System.out.println(a * 3);
    }
}
