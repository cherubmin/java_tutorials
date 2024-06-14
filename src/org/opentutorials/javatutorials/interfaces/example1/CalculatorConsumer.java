/*
예를 들어보자. 계산기 기능이 필요한 프로젝트를 진행하는데 시간이 촉박하다.
그래서 계산기 클래스는 개발자 A가 만들고, 개발자 B는 그 클래스를 사용하는 로직을 만든다고 해보자.
이런 경우 개발자 B는 개발자 A가 계산기를 잘 만들어서 나중에 제출할 것이라고 기대하고 개발을 진행할 것이다.
그리고 아래 코드와 같이 가짜 로직을 만들어서 코드를 작성한다.
 */
package org.opentutorials.javatutorials.interfaces.example1;
class CalculatorDummy{ //가짜 클래스 //모조 클래스
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60; //임의의 고정된 값
    }
    public int avg(){
        return 20; //임의의 고정된 값
    }
}
public class CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}