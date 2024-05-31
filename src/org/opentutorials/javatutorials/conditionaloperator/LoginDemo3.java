package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("harry") && password.equals("12345")) { //양쪽다 트루여야함
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
