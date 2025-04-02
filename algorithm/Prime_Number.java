/*
   Write a program that prompts the users for an interger and prints all the prime nummers up to it
   For example, maximum number of 52
   2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 15 primes (28.84%)
   
*/
import java.util.Scanner;
public class Prime_Number
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Maximum number: ");
      int max = kb.nextInt();
      int primeCount = 0;
      for (int i = 2; i <= max; i++)
      {
         if (countFactors(i) == 2) {
            //i is prime
            primeCount++;
            System.out.print(i + " ");
         }
      }
      System.out.println();
      double percentage = 100.0 * primeCount / max;
      String formattedPercentage = String.format("%.2f", percentage);
      System.out.print(primeCount + " primes (" + formattedPercentage + "%)");
      
   }
   
   public static int countFactors(int number)
   {
      int count = 0;
      for (int i = 1; i <= number; i++)
      {
         if (number % i == 0)
         {
            count++;
         }
      }
      return count;
   }
//end program.  
}
