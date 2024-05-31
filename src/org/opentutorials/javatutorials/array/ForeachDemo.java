package org.opentutorials.javatutorials.array;

public class ForeachDemo {
    public static void main(String[] args) {
        String[] members = {"최진혁", "김정민", "김미미"};

        for (String e : members) { //foreach 구문
            //members에 있는 변수를 하나씩 꺼내서 e에 넣음
            System.out.println(e + "가 축구를 하고 있습니다");
        }
    }
}
