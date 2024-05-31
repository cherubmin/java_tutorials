package org.opentutorials.javatutorials.io;

import java.util.Scanner; //스캐너 프로그램 읽어오기

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in : 사용자가 입력한 값
        int i = sc.nextInt(); //여기까지 실행되고 멈춰있음 //사용자가 숫자를 입력하면 다시 실행
        System.out.println(i*1000);
        sc.close(); //원래 이렇게 하는거다 //암기
    }
}
