import java.util.Scanner;

public class IT24102555Lab4Q2
{
    public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter examMarks:");
        double ExamMarks=input.nextDouble();

        
 while(ExamMarks<0||ExamMarks>100)
      { 
         System.out.print("Invalid input.");
         System.out.print("Please enter examMarks:");
         double examMarks=input.nextDouble();
       }
        
        System.out.print("Please enter Lab submission marks:");
        double labMarks=input.nextDouble();

 while(labMarks<0||labMarks>100)
      { 
         System.out.print("Invalid input.");
         System.out.print("Please enter labMarks:");
         double LabMarks=input.nextDouble();
       }
 
         System.out.print("Enter the percentage taken from the from the examMarks:");
         double ExamPercentage=input.nextDouble();
         System.out.print("Enter the percentage taken from the from the labMarks:");
         double LabPercentage=input.nextDouble();

while(ExamPercentage+LabPercentage!=100)
      {
         System.out.print("Invalid input.");
         System.out.print("Enter the percentage taken from the from the examMarks:");
         double examPercentage=input.nextDouble();
         System.out.print("Enter the percentage taken from the from the labMarks:");
         double labPercentage=input.nextDouble();
      }
 double finalMark=(ExamMarks*ExamPercentage/100)+(labMarks*LabPercentage/100);

System.out.print("The final marks is:"+finalMark);
    
     }
}