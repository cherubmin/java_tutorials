package org.opentutorials.javatutorials.overloading.example1;
public class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");} //에러발생
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A(); //첫번째
        od.A(1); //두번째
        od.A("coding everybody"); //세번째
    }
}
//오버로딩 이해하기
//매개변수의 이름은 상관없다
//