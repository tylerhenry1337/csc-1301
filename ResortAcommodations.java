import java.util.Scanner; // Needed for scanner class

/** This program will read user input for how many floors a resort has and output
 how many rooms and occupied rooms are  on said floor.
 
 * @ author Tyler Henry
 * @ prof Service
 * @ version
 
 */
 
 public class ResortAcommodations
 {
   public static void main(String[] args)
   {
   
   // Create Scanner for keyboard input
   Scanner in = new Scanner(System.in); 
   
   //Declare variables for Total number of rooms, total number of rooms occupied.
   int totalRooms = 0;
   int totalOccupied = 0;
  
   
   //Prompt the user to enter the number of floors the resort contains
   System.out.print("How many floors does the resort have? ");
   int numFloors = in.nextInt();
   
   //Validate that the user enters the correct number of floors.
   while (numFloors < 1)
   {
      System.out.print("Invalid. Enter 1 or more: ");
      numFloors = in.nextInt();
      
    }
   // for loop that prompts for the number of rooms on each floor
   int j = 0;
   for (int i = 0; i < numFloors; i++)
   {
      j = i+1;
      System.out.print("How many rooms does floor" +" "+ j +" " + "have? ");
      int numRooms = in.nextInt();
      // validate the user enters correct number of rooms
      while (numRooms < 10)
      {
         System.out.print("Invalid. Enter 10 or more: ");
         numRooms = in.nextInt();
      }
       //Add the number of rooms to the total of rooms
         totalRooms += numRooms;
         
       //Prompt the user to enter the amount of occupied rooms
         System.out.print("How many occupied rooms does floor" + " " + j + " "+ "have? ");
         int roomsOccupied = in.nextInt();
       //Validate that the number of occupied rooms is not greater than the number of rooms  
         while (roomsOccupied > numRooms)
         {
            System.out.print("Invalid. Enter 10 or more: ");
            roomsOccupied = in.nextInt();
          }
        //Add the number of occupied rooms to the total of occupied rooms
          totalOccupied += roomsOccupied;
    }
    // out of for loop calculate the number of vacant rooms  
    int vacantRooms = totalRooms - totalOccupied;
    
    //Calculate the percentage of occupied rooms
    double percentOccupied = ((double)totalOccupied/(double)totalRooms) * 100;
    
   
    // output the numbers of rooms, Occupied rooms, vacant rooms, and occupancy rate
    System.out.printf("Number of rooms: "+ totalRooms);
    System.out.printf("\nOccupied rooms: "+ totalOccupied);
    System.out.printf("\nVacant rooms: "+ vacantRooms);
    System.out.printf("\nOccupancy rate: %.2f" + "%%", percentOccupied);
  
    
    }
}   
       