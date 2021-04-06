import java.util.Scanner;// Needed for scanner class

/** This program will calculate the average grades from
test score inputs.


@prof. Service

@Tyler Henry
3/9/20

*/
public class GradeAverage
{
   public static void main(String[] args)
   {
      //Delcare double values
      double  testScore1, testScore2, testScore3;
      double  testscoreAverage,midtermScore,finalScore;
      double  testGrade,midtermGrade,finalGrade,gradeAverage;
      
      // Declaring constants for the program
      final double TEST_WEIGHT = .40; 
      final double MIDTERM_WEIGHT = .25; 
      final double FINAL_WEIGHT = .35;
      
      // Scanner for keyboard input
      Scanner in = new Scanner(System.in);
      
      //prompt user to enter test scores
      System.out.print("Enter test 1 score: ");
      testScore1 = in.nextDouble();
      System.out.print("Enter test 2 score: ");
      testScore2 = in.nextDouble();
      System.out.print("Enter test 3 score: ");
      testScore3 = in.nextDouble();
      
      //Calculate average of test scores.
      testscoreAverage = (testScore1 + testScore2 + testScore3)/3;
      
      
      //Prompt user to enter midterm score.
      System.out.print("Enter midterm exam score: ");
      midtermScore = in.nextDouble();
      
      //Promt user to enter final exam score.
      System.out.print("Enter final exam score: ");
      finalScore = in.nextDouble();
      
      //Calculate grade average
      testGrade = testscoreAverage * TEST_WEIGHT;
      midtermGrade= midtermScore * MIDTERM_WEIGHT;
      finalGrade = finalScore * FINAL_WEIGHT;
      gradeAverage = testGrade + midtermGrade + finalGrade;
      
      // Declaring letter grade for the numerical value
    
      char letterGrade = 'A';
      if (gradeAverage < 60)
      {
         letterGrade = 'F';
       }
       else if (gradeAverage < 70)
       {
         letterGrade = 'D';
       }
       else if (gradeAverage < 80)
       {
         letterGrade = 'C';
       }
       else if (gradeAverage < 90)
       {
         letterGrade = 'B';
       }
       else if (gradeAverage <=100)
       {
         letterGrade = 'A';
       }
       
       // print letter grade and grade average
     System.out.printf("Grade Average: %.2f\n",+ gradeAverage);
      
     System.out.printf("Letter grade: %s\n", letterGrade);
      
     if (gradeAverage > 70)
     {
     System.out.print("Good job. You met the prerequisite for the next course.");
     }
     else
     {
     System.out.print("I'm sorry.You will have to reapeat the course before advancing.");
     } 
      
      
    }
 } 
      
      
      