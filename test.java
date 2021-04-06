import java.util.Scanner;
public class test
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   System.out.print("Enter the price: ");
   double price = in.nextDouble();
   System.out.print("Enter the discount rate: ");
   double discount = in.nextDouble();
   System.out.println("The new price is " + (price - price * (discount / 100.0))); 
  }
}
