/** This is my bitchass using shit from the book on 
how to better create methods*/
public class Pyramids
{
   /** Computes  the volume of a pyramid whose base is a square.
   @param height the height of the pyramid
   @param baseLength the length of one side of the pyramids base
   @return the volume of the pyramid
   */
   // Write method for pyramidVolume
   public static double pyramidVolume(double height, double baseLength)
   {
      double baseArea = baseLength * baseLength; //calculates area
      return height * baseArea / 3;
   }
   // method and print results for user
   public static void main(String[] args)
   {  
      System.out.println("Volume: " +pyramidVolume(9,10));
      System.out.println("Expected: 300");
      System.out.println("Volume: " +pyramidVolume(0,10));
      System.out.println("Expected:  0");
    }
 }
      