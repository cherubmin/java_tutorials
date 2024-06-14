/*
인터페이스 규칙
인터페이스의 멤버는 반드시 public이다.
 */
package org.opentutorials.javatutorials.interfaces.example3;

public interface I5 {
    //private void x();
    //오류 발생 >> private여서
    //외부에서 제어 할 수 있는 가장 개방적인 접근 제어자인 public만을 허용한다.
}
/*
abstract vs interface
인터페이스와 추상 클래스는 서로 비슷한 듯 다른 기능이다.
인터페이스는 클래스가 아닌 인터페이스라는 고유한 형태를 가지고 있는 반면 추상 클래스는 일반적인 클래스다.
또 인터페이스는 구체적인 로직이나 상태를 가지고 있을 수 없고, 추상 클래스는 구체적인 로직이나 상태를 가지고 있을 수 있다.
 */
//115강부터