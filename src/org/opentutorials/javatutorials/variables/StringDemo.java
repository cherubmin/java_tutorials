package org.opentutorials.javatutorials.variables;

public class StringDemo {
    public static void main(String[] args) {
        String first; //String은 문자열
        first = "coding";
        System.out.println(first);

        String second = "Harry Kane"; //위 두문장은 한문장으로도 가능
        System.out.println(second);

        String a, b; //동시에도 선언 가능
        a = "haha";
        b = "nana";
        System.out.println(a + b);

        /*변수 사용하는 이유:
        중복의 제거, 가독성 증가, 유지보수성 증가
        */

        //;(세미콜론)은 문장의 끝에 사용한다.
        //;를 사용하여 한줄에 여러개의 문장을 쓸 수 있다.
    }
}
