/*
Write a Java program that will ask the user to specify a range, indicating the starting
and ending numbers for generating a times table. The program will
generate and display the times table for the specified numbers.
*/

import java.util.Scanner;

public class hw6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("start: ");
        int start = sc.nextInt();

        System.out.print("stop: ");
        int stop = sc.nextInt();

        for (int i = start; i <= stop; i++) {
            System.out.println("Times Table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        sc.close();
    }
}
