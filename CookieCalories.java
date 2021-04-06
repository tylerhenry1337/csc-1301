import java.util.Scanner;// Needed for scanner class

/** This calculates the total number of calories consumes for a given number of cookies

@prof Service
@Tyler Henry 2/24/20 
*/

public class CookieCalories
{
   public static void main(String[] args)
   {
   final int COOKIES_PER_BAG = 40;
   final int SERVINGS_PER_BAG=10;
   final int CALORIES_PER_SERVING = 300;
   
   
   // Calculate the number of cookies per serving.
   final int COOKIES_PER_SERVING=COOKIES_PER_BAG/SERVINGS_PER_BAG;
   
   
   // Calculate the number of calories per cookie.
   final int CALORIES_PER_COOKIE = CALORIES_PER_SERVING/COOKIES_PER_SERVING;
   
   // create a scanner object for keyboard input.
   Scanner in = new Scanner(System.in);
   
   // Get the number of cookies eaten.
   System.out.print("Enter the number of cookies eaten: ");
   int cookiesEaten = in.nextInt();           // to hold the total calories consumed
   
   //Calculate the number of total calories consumed.
   int totalCalories = CALORIES_PER_COOKIE * cookiesEaten;  // to hold total calories consumed
   
   //Display the number of total calories consumed.
   System.out.printf("The total calories consumed: %,d\n", totalCalories);
  }
}   
   
   