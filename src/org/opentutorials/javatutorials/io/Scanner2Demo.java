package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo { //계속 실행이되는 프로그램 //ScannerDemo는 한번만 실행

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { //여기서 대기중 //사용자가 입력하면 밑에 실행 //false면 close됨
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }
}
