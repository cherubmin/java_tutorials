package org.opentutorials.javatutorials.classninstance;

class Calculator2 {
    static double PI = 3.14; //static한 변수 //클래스에 소속 //모든 인스턴스에서 동일한 값
    static int base = 0; //base는 static이 붙었기 때문에 클래스 멤버
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right + base)/2);
    }
}

public class CalculatorDemo2 {
    public static void main(String[] args) {

        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        c1.sum();

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);

        c2.sum();

        Calculator2.base = 10; //클래스 변수의 값이 10

        c1.sum(); //40

        c2.sum(); //70
    }

}
/*클래스 변수의 용도
인스턴스에 따라서 변하지 않는 값이 필요한 경우
인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우
*/