/*
Write a Java program to take a positive integer N as user input 
and print the first N prime numbers starting from 2. 
Your code should check all the positive integers starting from 2 
and determine whether they are prime or not until N prime numbers are found.
*/

import java.util.Scanner;
public class cw2_5 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer N: ");
    int n = sc.nextInt();
    
    int num = 2;
    int i = 1;
    while (i <= n) {
      int j = 2;
      while (j <= num/2) {
        if (num % j == 0) {
          break;
        }
        j++;
      }
      if (j > num/2) {
        System.out.println(num);
        i++;
      }
      num++;
    }
    sc.close ();
  }
}
