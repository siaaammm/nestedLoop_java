/*
Write a Java program that will ask for a range 
(a starting number and an ending number) from the user 
and print all the Armstrong numbers between that range. 
*/

import java.util.Scanner;

public class cw3_5 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a starting number: ");
    int st = sc.nextInt();
    System.out.print("Enter an ending number: ");
    int end = sc.nextInt();
    System.out.println("Armstrong number: ");
    
    for (int i = st; i <= end; i++) {
      int num = i;
      int digits = 0;
      int originalNum = num;
      double sum = 0;
      
      while (originalNum != 0) {
        originalNum /= 10;
        digits++;
      }
      
      originalNum = num;
      
      while (originalNum != 0) {
        int remainder = originalNum % 10;
        sum += Math.pow(remainder, digits);
        originalNum /= 10;
      }
      
      if (sum == num) {
        System.out.println(num);
      }
    }
    sc.close ();
  }
}
