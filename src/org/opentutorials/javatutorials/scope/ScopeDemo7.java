package org.opentutorials.javatutorials.scope;

class C {
    int v = 10;

    void m() {
        int v = 20; //지역변수가 우선순위 높으므로 20이됨
        System.out.println(v);
        System.out.println(this.v); //this는 인스턴스 자신을 의미, 객체에 대한 전역의 의미를 가짐
    }
}

public class ScopeDemo7 {

    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
