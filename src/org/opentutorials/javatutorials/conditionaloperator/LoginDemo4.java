package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo4 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if ((id.equals("harry") || id.equals("kaka") || id.equals("haha")) //or
                && password.equals("12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
