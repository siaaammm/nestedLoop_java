/*
Write a  Java program that asks the user for a range, a starting number(inclusive) 
and an ending number (inclusive). Then, take another input for checking. 
If the product of all the digits of each number in the range is divisible by the third input, then print the product.
*/

import java.util.Scanner;

public class hw7_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the range:");
    int start = scanner.nextInt();
    int end = scanner.nextInt();
    
    System.out.println("Enter the number for checking divisibility:");
    int checkingNumber = scanner.nextInt();
    
    for (int i = start; i <= end; i++) {
      int number = i;
      int product = 1;
      while (number != 0) {
        int digit = number % 10;
        product *= digit;
        number /= 10;
      }
      if (product % checkingNumber == 0) {
        System.out.println(product + " ");
      }
    }
    
    scanner.close();
  }
}
