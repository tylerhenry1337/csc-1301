import java.util.Scanner; // needed for input

/** 
*Illustrates the while loop by summing numbers from 1
* to a given number
*
*@tyler
*/

public class WhileLoops
{
   public static void main(String[] args)
   {
      // Create a Scanner object for input
      Scanner in = new Scanner(System.in);
      
      
      // Get a number from the user
      System.out.print(" Enter a positive nonzero number: ");
      int maxNum = in.nextInt();
      
      
      //Validate input
      while (maxNum < 1)
      {
         System.out.print("Invald. Enter a valid number: ");
         maxNum = in.nextInt();
       }
       
       // Accumulate the sum of the numbers.
       int num = 1; // The number series starts at 1
       int total = 0;
       while(num <= maxNum)
       {
         //Add num to total
         total += num;
         
         //Increment num.
         num++;
        }
        
        //Display the sum.
        System.out.println("TThe sum of all the integers from 1 through" + " " + maxNum + " " + "is" + " " +total);
        }
   }
