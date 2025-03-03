 /*
    This method calculate the BMI body mass index
    formular = weight (kg) / height(meter) * height(meter)
    BMI = weight (in pounds) / [height (in inches)]² x 703
    parameters
    weight
    height
 */

public class BMI
{
   public static final double BMI_FACTOR = 703;
   public static void main(String[] args)
   {
   //call the method getBMI
      double weight = 180;
      double height = 67.7;
      getBMI(weight, height);
   }
  
   public static void getBMI(double weight, double height)
   {
      double bmi = weight / (height * height) * BMI_FACTOR;
      System.out.println("BMI:" + bmi);
   }
}
