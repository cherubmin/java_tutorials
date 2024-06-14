//추상이 상속을 강제하는 것이라면
// final은 상속/변경을 금지하는 규제이다.

//필드에서의 final >> 실행되는 과정에서 한번 값이 정해진 이후에는 변수 내의 값이 바뀌지 않도록 하는 규제
//메소드에서의 final >> 오버라이딩 못함.
//클래스에서의 final >> 상속못함.
package org.opentutorials.javatutorials.finals;

class Calculator {
    static final double PI = 3.14; //static >> 모든 인스턴스에 공통적 final >> 바뀌지 않음, 고정된 상수가 된다.
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6; //이미 3.14로 final로 고정해놨기 때문에 에러 발생함.
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10; //역시 오류 발생


    }

}