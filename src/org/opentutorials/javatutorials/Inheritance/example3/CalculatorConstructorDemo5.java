package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
    int left, right;

    public Calculator() {
//기본생성자 정의
    }

    public Calculator(int left, int right){ //기본 생성자 존재 X
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        //this.left = left; //부모, 자식 클래스에 생성자 중복 >> 하위클래스 생성자 삭제
        //this.right = right;
        super(left, right); //super는 부모 클래스 의미
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}