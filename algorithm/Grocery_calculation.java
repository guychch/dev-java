/*
   Write a program that simulates a cash register, ask the user how many items they want to
   purchase, create a loop, ask the user the price of each item, 
   add it to the total
   Calculate the tax and display the final cost

*/

import java.util.Scanner;
public class Grocery_calculation
{
   public static void main(String[] args)
   {  
      Scanner kb = new Scanner(System.in);
      double bill = checkout(kb);
      System.out.println("Total is : " + bill);
   }
   
   public static double checkout(Scanner kb)
   {
      System.out.print("How many items: ");
      int count = kb.nextInt();
      
      double total = 0;
      for (int i = 1; i <= count; i++)
      {
         System.out.print("Price item " + i + " ----> ");
         double price = kb.nextDouble();
         total = total + price;
      }
      
      //calculate the tax
      double tax = total * 8 / 100;
      total = total + tax;
      return total;
   }
   
   //end program.
}
