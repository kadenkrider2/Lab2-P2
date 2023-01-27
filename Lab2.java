/*
* Program: Lab2.java
*
* Author : Kaden Krider :)
* Date :   1.27.23
* Course :  CSCI 250
*
* Program Description:
*
* This program calculates the user's Target Heart Rate (THR), a measure
* for human workout intensity.
*
* THR is defined as THR = (220 – age) × 0.75
*
*
* This program performs the following procedure to calculate BMI
*
* Step 1. Ask the user to enter her/his age in years
*
* Step 2. Calculate and display the THR
*
*/


import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user to enter her/his age in years
        System.out.print("Please enter your age in years : ");

        // Read the user's age
        int age = input.nextInt();

        // Calculate the THR
        double intensity = 0.75;
        double THR = (220 - age) * intensity;

        // Display the output
        System.out.println("==================================================");
        System.out.println("This program calculates your Target Heart Rate (THR)");
        System.out.println("..................................................");
        System.out.println("Your intensity is " + (int)(intensity * 100) + "%");
        System.out.println("--------------------------------------------------");
        System.out.println("Your THR is : " + THR);
        System.out.println("==================================================");
    }
}
