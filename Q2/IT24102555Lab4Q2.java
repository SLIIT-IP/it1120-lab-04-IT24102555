import java.util.Scanner;

public class FinalMarkCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double examMarks, labMarks, examPercentage, labPercentage;

          
            System.out.print("Enter exam marks (0-100): ");
            examMarks = scanner.nextDouble();

                           if (examMarks < 0 || examMarks > 100) {
                                 System.out.println("Invalid input. Exam marks must be between 0 and 100.");
                                 }
        
            System.out.print("Enter lab submission marks (0-100): ");
            labMarks = scanner.nextDouble();
                            if (labMarks < 0 || labMarks > 100) {
                                   System.out.println("Invalid input. Lab marks must be between 0 and 100.");
                                  }
    
            System.out.print("Enter the percentage for exam marks (0-100): ");
            examPercentage = scanner.nextDouble();

            System.out.print("Enter the percentage for lab marks (0-100): ");
            labPercentage = scanner.nextDouble();

            if (examPercentage + labPercentage != 100) {
                System.out.println("Invalid input. The percentages must add up to 100.");
            }
     


        double finalMark = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));


        System.out.println("The final mark is: " + finalMark);

    }
}
