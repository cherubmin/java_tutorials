package org.opentutorials.javatutorials.overloading.example1;
public class OverloadingDemo2 extends OverloadingDemo{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");}
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");

    }
}

/*
오버로딩은 같은 이름, 다른 메서드
 */
/*
오버라이딩 vs 오버로딩
라이딩을 이용해서 부모 클래스의 메소드의 동작방법을 변경하고,
로딩을 이용해서 같은 이름, 다른 매개변수의 메소드들을 여러개 만들 수 있다
 */