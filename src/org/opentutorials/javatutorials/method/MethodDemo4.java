package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
    public static void numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(5); //입력값을 준다
        //입력값에 따라 출력값이 달라짐
    }
}
//int limit와 같은것은 매개변수라 한다.
//영어로는 파라미터

//(5)는 인자라고 한다.
//영어로는 아규먼트