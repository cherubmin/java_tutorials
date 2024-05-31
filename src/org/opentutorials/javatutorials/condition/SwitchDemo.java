package org.opentutorials.javatutorials.condition;

public class SwitchDemo {
    public static void main(String[] args) {

        System.out.println("switch(1)");
        switch(2) { //괄호 안에 있는 숫자부터 순차적으로 진행
            case 1:
                System.out.println("1");

            case 2:
                System.out.println("2");
                break; //break를 사용하여 스위치문 중지 가능

            case 3:
                System.out.println("3");

            default: //아무 값이 없을 때는 default를 사용할 수 있음
                System.out.println("default");


        }
    }
}
