/*
   Write a program to calculate the average of a series of the numbers entered by the users
   A cumulative algorithm is needed
*/

import java.util.Scanner;

public class Average_Cumulative
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      double avg = average(kb);
      System.out.println("Average : " + avg);     
   }
   
   public static double average(Scanner kb)
   {
      double sum = 0;
      int i = 1;
      for (i = 1; i <= 5; i++)
      {
         System.out.print(i + " Enter your number: ");
         double num = kb.nextDouble();
         sum = sum + num;
      }
      System.out.println(sum + " " + i);
      double avg = sum / (i-1);
      return avg;
   }
   
   
//End program   
}
