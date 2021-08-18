package com.devmountain.game;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
//Random rand = new Random();
//int number = rand.nextInt(30);
public class Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String first_name;
        System.out.print("Hello! What is your first name?");
        first_name = user_input.next();
        System.out.println("Hello " + first_name+ "! I am thinking of a number between 1 and 50. Can you guess it?");


//        Scanner num_user_input = new Scanner(System.in);
//        int guess;
//        guess = num_user_input.next();
//        if (guess!=25)
//            System.out.println("Try again!");

        Scanner userGuess = new Scanner( System.in );
//        int a = userGuess.nextInt();
//IF STATEMENT

//        if (a< 35){
//            System.out.print("Try guessing a little higher");}
//
//        else if(a>35){
//            System.out.print("Try guessing a little lower");
//        }
//        else if (a == 35)
//            System.out.print("Congratulations! You guessed the number!");
//WHILE LOOP
        //        while (a != 35) {
//            if (a < 35) {
//                System.out.print("Try guessing a little higher");
//                break;
//            } else if (a > 35) {
//                System.out.print("Try guessing a little lower");
//                break;
//            } else if (a == 35)
//                System.out.print("Congratulations! You guessed the number!");
//            break;
//
//        }


        do{
            int a = userGuess.nextInt();
            if(a < 35) {
                System.out.print("Try guessing a little higher");
                continue;
            } else if (a > 35) {
                System.out.print("Try guessing a little lower");
                continue;
            } else if (a == 35)
                System.out.print("Congratulations! You guessed the number!");
            break;
        } while(true);
    }
}
