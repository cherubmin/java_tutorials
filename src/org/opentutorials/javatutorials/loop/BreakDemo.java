package org.opentutorials.javatutorials.loop;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) //밑에 트루 조건이 한줄이면 {} 생략 가능
                break; //중간에 중단
            System.out.println(i);
        }
    }
}
