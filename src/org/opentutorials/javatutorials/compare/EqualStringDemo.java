package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {
    public static void main(String[] args) {
        String a = "Hello World";
        String b = new String("Hello World");
        System.out.println(a == b); //false가 된다. 왜..?
        System.out.println(a.equals(b));//t
    }
}
