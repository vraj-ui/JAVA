import java.util.Scanner; // Needed for Scanner class

public class overtime
{
   public static void main(String[] args)
   {
      final int EMPLOYEES = 2;  
      double MinWage;       
      double salary;
      double overtime;     

      // Create an array to hold employee hours.
      int[] hours = new int[EMPLOYEES];

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      for (int index = 0; index < EMPLOYEES; index++)
      {
         System.out.print( "Employee #" + (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
      }

      // Get the hourly pay rate.
      System.out.print("Enter each employee's hourly rate: ");
      MinWage = keyboard.nextDouble();

      // Display each employee's gross pay.
      System.out.println( "Here is the salary for each employee:");
      for (int index = 0; index < EMPLOYEES; index++)
      {
         if (hours[index] > 40)
         {
            // Calculate base pay
            salary = 40 * MinWage;

            // Calculate overtime pay
            overtime = (hours[index] - 40) * (1.5 * MinWage);

            // Add base pay and overtime pay
            salary += overtime;
         }
         else
            salary = hours[index] * MinWage;

         System.out.println("Employee #" + (index + 1) + salary);
            
         if (hours[index] >60) 
         System.out.println("Error for EMPLOYEE " +EMPLOYEES);
      }
      keyboard.close();
   }
}