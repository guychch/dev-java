/*
Practice Java
Problem:
   This method calculate the distance travel by a car
   formula = speed * time 
   parameters
      travel_speed
      travel_time
*/
   
public class CalculationDistance
{
   public static void main(String[] args)
   {
      double speed = 65;
      double hours = 30.0/60;
      
      //call the method getDistance
      getDistance(speed, hours);
   }
   
   
   public static void getDistance(double travel_speed, double travel_hours)
   {
      double distance = travel_speed * travel_hours;
      System.out.println("Distance: " + distance);
   
   }
}
