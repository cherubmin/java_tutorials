//어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 그 객체는 반드시 인터페이스의 메소드들을 구현해야 한다.
//만약 인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 이 애플리케이션은 컴파일 조차 되지 않는다.
package org.opentutorials.javatutorials.interfaces.example1;

interface I{
    public void z();
}

class A implements I{//구현 //"클래스 A는 인터페이스 I를 구현한다"
    public void z(){} //본체의 로직은 없지만 본체는 존재
    //public void z(){}를 삭제하면 컴파일 에러가 발생한다.
}