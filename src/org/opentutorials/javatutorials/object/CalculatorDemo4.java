package org.opentutorials.javatutorials.object;
//객체를 하나의 프로그램으로 봐라

class Calculator { //클래스=객체의 설계도 //클래스
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left; //this.은 c1에 담겨있는 클래스를 구체적인 인스턴스를 가르킴
        //class 전체에 있는 int left, int right임
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

public class CalculatorDemo4 {
//인스턴스는 구체적인 객체
    public static void main(String[] args) {

        Calculator c1 = new Calculator(); //인스턴스(객체)=c1 //Calculator는 c1의 데이터 타입을 의미함
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(); //인스턴스(객체)=c2
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }
}
//클래스는 설계도, 인스턴스는 설계도로 만들어진 구체적인 구현체들
//클래스는 하나, 인스턴스는 여러개