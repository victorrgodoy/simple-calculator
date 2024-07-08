package main.java;

import main.java.controller.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(scanner);
        userInterface.start();
    }
}
