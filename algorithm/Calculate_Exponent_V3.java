/*
   Write a program that calculates the exponent, ask the user to enter a base value and an exponent value.
   then calculates base to the power of exponent. 
   For example if the users enter 2, 3 then your program should calculate 2 * 2 * 2  
   if the user enter 5, 4 then your program should calculate 5 * 5 * 5 * 5
   
   Note: this program take input 2 number with a comma between them.
   
   Version 3
   Update: Add sentence You request to calculate 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2
   if base is 2 and exponent is 10.
*/

import java.util.Scanner;

public class Calculate_Exponent_V3
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
      System.out.print("Enter base and exponent (comma in between): ");
      String input = scanner.nextLine(); //read input and remove extra spaces
      
      String[] parts = input.split(",");
      int base = 0;
      int exponent = 0;
      int total = 1;
       
      if (parts.length !=2){
         System.out.println("Please enter 2 numbers (comma in between).");
      } else {
         base = Integer.parseInt(parts[0].trim());
         exponent = Integer.parseInt(parts[1].trim());
         
         //New stuff
         StringBuilder expression = new StringBuilder();
         for (int j = 1; j < exponent; j++)
         {
            expression.append(" x ");
            expression.append(base);
         }
         System.out.println("You request to calculate " + base + expression); 
      }
      
      if (exponent < 0)
      {
         System.out.println("The program can not give correct result if your exponent "+ exponent + " is less than 0");
      }
     
      for (int i = 0; i < exponent; i++)
      {
        total *= base;
      }    
     // System.out.println(base + " raised of the power of " + exponent + " is " + total);
      return total;
   }
}
