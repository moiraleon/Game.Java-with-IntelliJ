package com.devmountain.game;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String first_name;
        System.out.print("Hello! What is your first name?");
        first_name = user_input.next();
        System.out.println("Hello " + first_name+ "! I am thinking of a number between 1 and 30. Can you guess it?");
    }
}
