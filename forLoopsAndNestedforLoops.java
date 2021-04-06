import java.util.Scanner; // Needed for in input

/**
*Illustrates the for loop and nested for loop
*
*Tyler
*/

public class forLoopsAndNestedforLoops
{
   public static void main(String[] args)
   {
      //Create a scanner object for in input
      Scanner in = new Scanner(System.in);
      
      //FOR LOOP EXAMPLE
      System.out.println("We will find the test average using a FOR loop");
      
      //Get number from user.
      System.out.print("How many test scores? ");
      int numTests = in.nextInt();
      
      double total = 0;
      for (int i = 0; i < numTests; i++)
      {
         //Add new to total
         System.out.print("Enter Test" + (i + 1) + "grade: ");
         double grade = in.nextDouble();
         total += grade;
       }
       
       double average = total / numTests;
       
       //Display the average.
       System.out.printf("\nThe test average is %.1f\n", average);
       
       //NESTED LOOP EXAMPLE
       System.out.println("\nNow we will find the average rainfall using a NESTED for loop");
       
       //Get the number of years.
       System.out.print("Enter the number of years: ");
       int years = in.nextInt(); // number of years
       
       System.out.println("Enter the rainfall, in inches, for each month.");
       
       double monthRain = 0;   // Rain for a month
       double totalRain = 0;   // Rainfall accumulator
       for (int i = 1; i <= years; i++)
       {
         for (int j = 1; j <= 12; j++)
         {
            //Get the rainfall for a month
            System.out.print("Year" + i + "month" + j +": ");
            monthRain = in.nextDouble();
            
            //Accumulate the rainfall
            totalRain += monthRain;
            
          }
        }
        
        //Calculate the average rainfall.
        double rainAvg = totalRain / (years * 12 );
        
        System.out.printf("Average monthly rainfall %.2f inches: ", rainAvg);
        
    }
}
            
       