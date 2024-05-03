/*
Draw a flowchart and write a Java program to take a positive integer N 
as user input and print the first N perfect numbers starting from 2. 
Your code should check all the positive integers starting from 2 
and determine whether they are perfect or not until N perfect numbers are found. 
*/

import java.util.Scanner;

public class hw5_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the value of N: ");
    int N = scanner.nextInt();
    
    int count = 0;
    int number = 2;
    
    System.out.println("First " + N + " perfect numbers:");
    
    while (count < N) {
      int sum = 1;
      for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
          sum += i;
          if (i != number / i) {
            sum += number / i;
          }
        }
      }
      if (sum == number) {
        System.out.println(number);
        count++;
      }
      number++;
    }
    
    scanner.close();
  }
}
