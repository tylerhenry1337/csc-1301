import java.util.Scanner;


/** This program calculates the area of a circle, rectangle, and triangle
   @author Tyler Henry
   @ prof Service
   @Version 
*/
   
public class Geometry
{  
   // Scanner for user input, display menu method call
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      displayMenu();
      System.out.print("Enter your choice (1-3): ");
      
      int choice = in.nextInt();
         while (choice > 3 || choice < 1)
         {  
            System.out.println("Invalid choice. Please enter 1 - 3: ");
            choice = in.nextInt();
         }
      selectOption(choice);
      System.out.println("\n\nThank you for using the Geometry Calculator - Goodbye!");
   }
   
   /* This method calculates and returns the area of a circle
      @param none
      @return area of circle*/
   public static double circle()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      double radius = in.nextDouble();
      double circleArea = Math.PI * Math.pow(radius, 2);
      
      return circleArea;
   }
   
   /** This method calculates and returns the area of a rectangle
      @param none
      @return Area of rectanle */
   public static double rectangle()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is the rectangle's length? ");
      double length = in.nextDouble();
      System.out.print("What is the rectangle's width? ");
      double width = in.nextDouble();
      double rectangleArea = length * width;
      return rectangleArea;
   }
   
   /** this method calculates and returns the area of a triangle
      @param none
      @return the area of a triangle */
   public static double triangle()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is the length of the triangles base? ");
      double base = in.nextDouble();
      System.out.print("What is the triangles height? ");
      double height = in.nextDouble();
      double triangleArea = (base * height) /2;
      return triangleArea;
   }
   
   /** This method prints the area
   @param takes double as the area
   @return none */
   public static void printArea(double area)
   {
      System.out.printf("The area is %.2f", area);
   }
   
   /** This method is selectoption that sets options for the user
   @param takes int variable for choice
   @return none */
   public static void selectOption(int choice)
   {
      if (choice == 1)
      {
         double area = circle();
         printArea(area);
      }
      else if (choice == 2)
      {
         
         double area = rectangle();
         printArea(area);
           
      }
      else if (choice == 3)
      {
         double area = triangle();
         printArea(area);
      }  
      
   }  
      
   
   /** Method for displayMenu that prints options
      @param none
      @return none*/
   public static void displayMenu()
   {
      System.out.println("Welcome to the Geometry Calculator Application");
      
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectanlge");
      System.out.println("3. Calculate the area of a Triangle");
   }
}