// Cumulative algorithm 

/*
This program find the sum of the numbers 1 - 10
*/

public class Cumulative_Algorithm
{
   public static void main(String[] args)
   {
      int sum = findSum();
      System.out.println("The sum of number 1 - 100 is : " + sum);
   }
   
   public static int findSum()
   {
      int sum = 0;
      for (int i = 0; i <= 100; i++)
      {
         sum=sum + i;
      }
      return sum;
   }
}
