package com.trainibit.example;

public class HelloWorld {
    private String message;
    private User user;

    // Setter method for dependency injection
    public void setMessage(String message) {
        this.message = message;
    }
    // Setter para User
    public void setUser(User user) {
        this.user = user;
    }

    // Method to print the message
    public void printMessage() {
        System.out.println("Message: " + message +
                "\nUser: " + user.getName() +
                "\nLast Name: " + user.getLastName() +
                "\nBirth Date: " + user.getBirthDate());
    }
}