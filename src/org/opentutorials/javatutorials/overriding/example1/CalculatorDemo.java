package org.opentutorials.javatutorials.overriding.example1;
//부모와 자식의 형식이 같아야한다(타입이) > 안그러면 에러

/*
오버라이딩을 하기 위한 조건
1. 메소드의 이름
2. 메소드 매개변수의 숫자와 데이터 타입 그리고 순서
3. 메소드의 리턴 타입

위와 같이 메서드의 서명이 같아야한다.
 */
class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {

    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }

    public int avg() {
        return super.avg(); //super는 현재 클래스의 부모 클래스를 의미
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}