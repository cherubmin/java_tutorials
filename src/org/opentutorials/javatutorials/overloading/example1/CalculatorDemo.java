package org.opentutorials.javatutorials.overloading.example1;
//오버로딩 : 같은 이름, 다른 매개변수의 형식, 숫자에 의해 >> 다른 메서드로 인식됨
class Calculator{
    int left, right;
    int third = 0;

    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third){
        this.setOprands(left, right);//이렇게 수정하는게 중복 제거 굿~
        System.out.println("setOprands(int left, int right, int third)");
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();

    }//자바는 인자의 숫자를 보고 결정

}