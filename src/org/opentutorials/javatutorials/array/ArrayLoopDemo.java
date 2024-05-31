package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {
    public static void main(String[] args) {

        String[] members = {"해리케인", "외질", "리오넬"};
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "축구를 하고 있습니다");
        }
    }
}
