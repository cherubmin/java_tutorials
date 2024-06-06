package org.opentutorials.javatutorials.packages.example3;
import org.opentutorials.javatutorials.packages.example1.*;
import org.opentutorials.javatutorials.packages.example2.*;

public class D {
    public static void main(String[] args) {
        //B b = new B(); //에러 발생 //B 클래스가 여러개 로드 되어 있음
        org.opentutorials.javatutorials.packages.example1.B b = new org.opentutorials.javatutorials.packages.example1.B();
        //위와 같이 해결 가능
    }
}
