import java.util.Scanner;

public class StudentGradeCard {

    static int[][] generateMarks(int students) {

        int[][] marks =
                new int[students][3];

        for(int i=0;i<students;i++) {

            for(int j=0;j<3;j++) {

                marks[i][j] =
                        (int)(Math.random()*100);
            }
        }

        return marks;
    }

    static String grade(double percent) {

        if(percent >= 90)
            return "A+";

        else if(percent >= 80)
            return "A";

        else if(percent >= 70)
            return "B";

        else if(percent >= 60)
            return "C";

        else if(percent >= 50)
            return "D";

        return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Number of Students: ");

        int n = sc.nextInt();

        int[][] marks =
                generateMarks(n);

        System.out.println(
                "\nPhy\tChem\tMath\tTotal\t%\tGrade");

        for(int i=0;i<n;i++) {

            int total =
                    marks[i][0]
                            + marks[i][1]
                            + marks[i][2];

            double percent =
                    total / 3.0;

            System.out.println(
                    marks[i][0] + "\t"
                            + marks[i][1] + "\t"
                            + marks[i][2] + "\t"
                            + total + "\t"
                            + Math.round(percent*100)/100.0
                            + "\t"
                            + grade(percent));
        }
    }
}