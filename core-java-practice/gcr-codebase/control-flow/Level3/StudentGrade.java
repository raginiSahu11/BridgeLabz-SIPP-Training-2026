import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double percentage = (physics + chemistry + maths) / 3;

        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Average Marks = " + percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);
    }
}