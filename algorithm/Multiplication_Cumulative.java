/*
   Cumulative product
   - Require a variable declared outside the loop
   - the variable must be initialized to 1 since it is the product of some numbers
   - The cumulative product variable must be updated in the loop
   
   //declare a place holder
   int product = 1;
   for ("all number")
   {
   Get the value
   multiply it to the product
   }
   
   Write a program to find out the following 1 * 2 * 3 * 4 * 5 * 6.....* 10
*/

import java.util.Scanner;
public class Multiplication_Cumulative
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int p = product(kb);
      System.out.println(p);
   }
      
   public static int product(Scanner kb)
   {
      int product = 1;
      for (int i = 1; i <= 10; i++)
      {
         product = product * i;
      }
      return product;
   }
}

