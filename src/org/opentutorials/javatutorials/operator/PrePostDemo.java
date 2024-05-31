package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i); //6 //미리 더해짐 //해당에 반영
        System.out.println(i++); //6 //나중에 더해짐 //다음에 반영
        System.out.println(i); //7
    }
}
