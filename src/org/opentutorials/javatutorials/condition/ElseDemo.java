package org.opentutorials.javatutorials.condition;

public class ElseDemo {
    public static void main(String[] args) {
        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3); //위에가 트루여서 3은 실행 안된다.
        } else {
            System.out.println(4);
        }
    }
}