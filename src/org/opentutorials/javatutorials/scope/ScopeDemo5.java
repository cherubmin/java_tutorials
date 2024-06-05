package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i);
    }//i의 값이 for문으로 선언이 되었고 중괄호 사이에서만 유효
}
