package org.opentutorials.javatutorials.Inheritance.example1;

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo3 {

    public static void main(String[] args) {

        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }

}
//상속 장점
//코드 중복 제거
//유지보수성 증가
//재활용성 업업업