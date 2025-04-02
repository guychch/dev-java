/*
Apply cumulative sum to the case
Find out the amount of money that you will have at the end of the year 
if you deposit certain amount of money per month. 
There are 12 months in a year, therefore a loop for 12 iteration is needed.
At each iteration ask the users for the amount of the money to be deposited to the account.
Add the money to the sum.
*/

import java.util.Scanner;
public class Cumulative_Amount
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int balance = deposit(kb);
      System.out.println("Your Balance is : " + balance);
   }
   
   public static int deposit(Scanner kb)
   {
      int sum = 0;
      for (int i = 1; i <= 12; i++)
      {
         System.out.print(i + " Deposit amount: ");
         int amount = kb.nextInt();
         sum = sum + amount;
      }
      return sum;
   }
   
   }
