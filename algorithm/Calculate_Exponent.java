/*
   Write a program that calculates the exponent, ask the user to enter a base value and an exponent value.
   then calculates base to the power of exponent. 
   For example if the users enter 2, 3 then your program should calculate 2 * 2 * 2  
   if the user enter 5, 4 then your program should calculate 5 * 5 * 5 * 5
   
   Note: this program take input 2 number with a space between them.
   Version 1
*/

import java.util.Scanner;

public class Calculate_Exponent
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int total = exponent(kb);
      System.out.println("Total is : " + total);
   }
   
   public static int exponent(Scanner kb)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter base and exponent (space in between): ");
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int total = 1;
      for (int i = 1; i <= num2; i ++)
      {
        total *= num1;
      }    
      return total;
   }
}
