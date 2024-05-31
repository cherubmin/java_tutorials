package org.opentutorials.javatutorials.array;

public class LengthDemo {
    public static void main(String[] args) {
        String[] classGroup = new String[4]; //배열을 정의하는 또 다른 방법
        classGroup[0] = "해리케인";
        System.out.println(classGroup.length);
        classGroup[1] = "박지성";
        System.out.println(classGroup.length);
        classGroup[2] = "쏘니";
        System.out.println(classGroup.length);
    }
}
