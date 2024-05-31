package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
    public static String numbering(int init, int limit) { //해당 메서드의 리턴값이 string이다. //반드시 문자열을 리턴한다.
        int i = init;
        //만들어지는 숫자들을 output이라는 변수에 담기 위해 변수에 빈값 줌
        String output = "";
        while (i <= limit) {
            //숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i; //output = output + i
            i++;
        }
        return output; //java에서는 return을 만나면 프로그램을 반드시 종료시킴
        //output을 메서드의 결과로 출력이 된다.
    }

    public static void main(String[] args) { //void는 리턴값이 정해지지 않음
        String result = numbering(1,5);
        System.out.println(result);
    }
}
