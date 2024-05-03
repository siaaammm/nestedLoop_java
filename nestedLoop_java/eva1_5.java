/*
Write a Java code of a program that reads the value of N from the 
user and calculates the value of y if the expression of y is as follows:
*/

import java.util.Scanner;

public class eva1_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the value of N: ");
    int N = scanner.nextInt();
    
    int y = 0;
    for (int i = 1; i <= N; i++) {
      int sum = (i * (i + 1)) / 2;
      y = y - sum;
    }
    
    System.out.println("The value of y is: " + y);
    
    scanner.close();
  }
}
