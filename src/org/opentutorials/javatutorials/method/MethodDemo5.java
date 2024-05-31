package org.opentutorials.javatutorials.method;

public class MethodDemo5 {
    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(1,5); //여러개의 인자값 부여 가능
    }
}
