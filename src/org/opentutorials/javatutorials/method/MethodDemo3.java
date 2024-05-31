package org.opentutorials.javatutorials.method;

public class MethodDemo3 { //메서스 사용이유:유지보수 증가, 코드량 감소
    public static void nubering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) { //메소드데모2와 결과가 같지만 재활용이 가능하다
        //유지보수성이 높다
        nubering();
        nubering();
        nubering();
        nubering();
        nubering();
    }
}
