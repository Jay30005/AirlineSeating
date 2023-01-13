package com.company;

//The program should prompt the user to enter the class of the seat (1 for first class, 2 for business class) and then display the seating for that class.
// After that, the program prompts for the seat desired, the user types in a seat, and then the seating chart is updated. If a passenger requests a
//seat that is already assigned, the program should indicate that the seat is occupied and ask for another choice.
// If seats in the same class are not available, ask the user if he/she wants a seat in the other class and proceed
//appropriately. If no other seats are available, display an appropriate message.
//When there are no more passengers to process (the plane may not be full when it
//takes off), display the total number of passengers in each class.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[][] Seat = {{"Seat Assigned"}, {"First Class"}, {"Business Class"}};//{"Choose another Choice"}};
        System.out.println("Seat Classes \n");
        for (int i = 1; i < Seat.length; i++) {
            for (int j = 0; j < Seat[i].length; j++) {
                System.out.println(i + "-" + Seat[i][j]);
            }
            ;
            System.out.println();
            ArrayList<Integer> ClassSeating = new ArrayList<Integer>();
            int userInput = 0;
            int Class = 0;

            while (userInput != 2) {
                System.out.println("Please Enter Class Choice :" + Class);
                userInput = input.nextInt();
                if (userInput != 2 && userInput < 2) {
                    ClassSeating.add(userInput);
                    Class++;

                };
            };
            System.out.println("\n\n");
            printTable(ClassSeating, Class,Seat);
        }
    } public static void printTable(ArrayList<Integer> ClassSeating, int Class, String [][]Seat)
    {


    }
}