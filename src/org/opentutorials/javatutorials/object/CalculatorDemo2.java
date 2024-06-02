package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {

    public static void sum(int left, int right) {
        int sum = left + right;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(10,20);
        sum(20,40);
    }

    //refactoring이라 한다. 기존에 있던 코드를 보완?
    //리팩토링 많이 하면 건강한 코드가 된다.
}
