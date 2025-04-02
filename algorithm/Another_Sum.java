/*
   Another case of sum
*/

public class Another_Sum
{
   public static void main(String[] args)
   {
      double sum = findSum();
      System.out.println("1 + 1/2 + 1/3...1/50 = " + sum);
   }
   
   public static double findSum()
   {
      double sum = 0;
      for (int i = 1; i <= 50; i++)
      {
         sum = sum + 1.0/i;
      }
      return sum;
   }
}
