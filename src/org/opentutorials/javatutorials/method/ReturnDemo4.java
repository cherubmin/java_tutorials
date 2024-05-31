package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
    public static String[] getMembers() {
        String[] members = {"김정민", "해리케인", "반더벤"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
    }
}
