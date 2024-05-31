package org.opentutorials.javatutorials.numberstring;

public class CharString {

    public static void main(String[] args) {
        //문자는 charater 문자열은 string
        System.out.println('생'); //문자는 '(작은따옴표)
        System.out.println("생고기 먹고싶다"); //문자열는 "(큰따옴표)
        //하나의 문자도 문자열이므로 "큰따옴표 사용 가능
        //결론: 그냥 큰따옴표 사용하자

        System.out.println("해리"+"케인"); //문자열도 더하기 가능

        System.out.println(1+2);
        System.out.println("1"+"2"); //따옴표 사용하면 문자열로 취급

        System.out.println("해리케인이\"패스해\"하고 말했다"); //역슬래시를 사용해서 문자로 해석하도록 강제할 수 있다.
        // 위와 같은 것을 이스케이프(escape)라고 한다.

        System.out.println("손흥민은\nepl 득점왕 \n출신이다");
    }
}
