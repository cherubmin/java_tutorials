package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("kane")) {
            if (password.equals("harry")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }
        } else {
            System.out.println("Login Failed");
        }
    }
}
