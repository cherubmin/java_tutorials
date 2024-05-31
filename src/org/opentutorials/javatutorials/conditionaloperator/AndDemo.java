package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {
    public static void main(String[] args) {
        if (true && true) { //이거만 출력된다. 두개 모두 참이여야함
            System.out.println(1);
        }

        if (true && false) {
            System.out.println(2);
        }

        if (false && true) {
            System.out.println(3);
        }

        if (false && false) {
            System.out.println(4);
        }

    }
}
