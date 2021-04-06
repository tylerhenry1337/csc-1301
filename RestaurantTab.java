import java.util.Scanner;// Needed for scanner class

/** This is a restaurantt tab program that calculates total cost of a 
meal including taxes and a tip

@prof Service
@Tyler Henry
*/

public class RestaurantTab
{
   public static void main(String[] args)
   {
      
      final double TAX_RATE_PERCENTAGE = .075;
      final double TIP_PERCENTAGE = .18;
      double originalTotal, mealPrice, grandTotal, taxAmount, tipAmount;
      
      // Create scanner object for keyboard input.
      Scanner in = new Scanner(System.in);
      
      // Get the first and last name of the server
      System.out.print("Enter the first name of your server: ");
      String firstName= in.next();
      System.out.print("Enter the last name of yourt server: ");
      String lastName = in.next();
      
      //Change last name to the initial
      char firstInitial = firstName.charAt(0);
      
      // Get the price of the meal
      System.out.print("Enter the cost of your meal: ");
      mealPrice = in.nextDouble();
      
       
      // Calculate the amount of tax on the meal.
      taxAmount = mealPrice * TAX_RATE_PERCENTAGE;
      
      // Calculate the total of the meal with tax
      originalTotal = mealPrice + taxAmount;
      
      // Calculate the tip amount for the meal.
      tipAmount = originalTotal * TIP_PERCENTAGE;
      
      // Calculate the grand total of the meal with the tip
      grandTotal = originalTotal + tipAmount;
      
      // Display restaurant bill information
      System.out.println("Restaurant Bill Summary");
      System.out.printf("Server:  %8.16s\n",lastName + ", " + firstInitial);
      System.out.printf("Meal:    $%8.2f\n", mealPrice);
      System.out.printf("Tax:     $%8.2f\n", taxAmount);
      System.out.printf("Tip:     $%8.2f\n", tipAmount);
      System.out.printf("Total:   $%8.2f\n", grandTotal);
     }
 }
      
      
   
     
      
      
      