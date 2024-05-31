package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

    public static void main(String[] args) {
        float a = 2.2F; //float를 사용하려면 숫자를 명시적으로 표현해줘야함(F)
        System.out.println(a);

        //int b = 2147483648; //범위가 2147483647까지여서 오류 발생
        long c = 2147483648L; //역시 명시적으로 표시(L)
        byte d = 100; //byte지만 int
        short e = 200; //마찬가지...

        //자동 형 변환:
        //double a = 3.0F;
        //위 코드는 자동으로 형 변환이 된것이다.
        //double이 범위가 더 크기 때문에 타입을 변경해도 정보의 손실이 일어나지 않아 자동 형 변환이 일어난다.

        //float a = 3.0;
        //위 코드는 에러가 뜸
        //자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용된다는 것임.

        //명시적 형 변환 예))
        //float a = (float)100.0;
    }
}
