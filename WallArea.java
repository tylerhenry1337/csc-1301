import java.util.Scanner;

public class WallArea
{
   public static void main(String[] args)
   {
      double Wallwidth, Wallheight, Numberofwindows, Areawall, Areawindow, TotalArea;
      Scanner scan = new Scanner(System.in);
      
      
      
      
      
      
      System.out.print("Wall width: ");
      System.out.print("Wall height: ");
      System.out.print("Number of windows: ");
      
      
     
      Wallwidth = scan.nextDouble();
      Wallheight = scan.nextDouble();
      Numberofwindows = scan.nextDouble();
      
      Areawall = Wallwidth*Wallheight;
      Areawindow= 2*3*Numberofwindows;
      TotalArea= Areawall-Areawindow;

   
     
      System.out.println("Area: " + TotalArea);