import java.util.Scanner; // Needed for scanner class


/**
  *This program will reach in three test scores from the user and
  *output the formatted test score and average test score.
  *
  *@prof Servive
  *@Tyler Henry
  */
  
public class TestAverage
{
   public static void main(String[] args)
   {
   
   // Create scanner object for keyboard input.
   Scanner in = new Scanner(System.in);
   
   //Get the first test score.
   System.out.print("Enter test score 1: ");
   double test1 = in.nextDouble();   //Test score 1
   
   //Get second test score
   System.out.print("Enter test score 2: ");
   double test2 = in.nextDouble();   //Test score 2
   
   //Get third test score
   System.out.print("Enter test score 3: ");
   double test3 = in.nextDouble();  //Test score 3
   
   //Get fourth test score
   System.out.print("Enter test score 4: ");
   double test4 = in.nextDouble();
   
   //Calculate the average
   double average = (test1 + test2 + test3 + test4) / 4.0; //Test score average
   
   //Display each test score, as well as the average
   System.out.printf("\nTest score 1: %3.1f\n", test1);
   System.out.printf("Test score 2: %3.1f\n", test2);
   System.out.printf("Test score 3: %3.1f\n", test3);
   System.out.printf("Test score 4: %3.1f\n", test4);
   System.out.printf("\nTest average: %3.2f", average);
  }
}