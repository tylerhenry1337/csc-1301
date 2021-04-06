import java.util.Scanner;

/** This program outputs the number of points a book club
member has earned based on the number of books purchased

@Prof Service
*/

public class BookClubPoints
{
   public static void main(String[] args)
   {
   
   // Create a scanner object for in input
   Scanner in = new Scanner(System.in);
   
   //Get the number of books purchased this month.
   System.out.print("How many books have you purchased this month? ");
   int books = in.nextInt();
   
   
   // determine the number of points to award.
   // declare and intialize points variable.
   int points = 0;
   if (books < 1)
   {
      points = 0;
   }
   else if (books == 1)
   {
      points = 5;
   }
   else if (books == 2)
   {
      points = 15;
   }
   else if (books == 3)
   {
      points = 30;
   }
   else
   {
      points = 60;
   }
   
   // Display the points earned.
   System.out.println("You've earned " + points + " points.");
   }
}
   