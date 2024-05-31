package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i ==5)
                continue; //continue는 건너띔.
            System.out.println(i);
        }
    }
}
