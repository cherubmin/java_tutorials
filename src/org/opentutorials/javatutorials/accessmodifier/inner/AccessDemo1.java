package org.opentutorials.javatutorials.accessmodifier.inner;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z(); //이것도 실행이 된다?? 왜냐면 처음 호출한게 퍼블릭이여서 //직접적으론 호출 못함
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        //아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());
    }
}
