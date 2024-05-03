/*
Write a Java program that will keep taking even positive integer numbers 
as inputs from the user and print the number of divisors 
of those numbers until it gets an odd number and then stops. 
*/

import java.util.Scanner;

public class eva2_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.print("Enter number: ");
      int num = scanner.nextInt();
      
      if (num % 2 != 0) {
        break;
      }
      
      int count = 0;
      for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
          count++;
        }
      }
      System.out.println (num + " has " + count + " divisors");
    }
    
    scanner.close();
  }
}
