import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for(int i=0;i<n;i++) {

            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();

            double h = personData[i][1] / 100;

            personData[i][2] =
                    personData[i][0] / (h*h);

            if(personData[i][2] < 18.5)
                status[i] = "Underweight";
            else if(personData[i][2] < 25)
                status[i] = "Normal";
            else if(personData[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for(int i=0;i<n;i++) {

            System.out.println(
                    "Weight=" + personData[i][0] +
                            " Height=" + personData[i][1] +
                            " BMI=" + personData[i][2] +
                            " Status=" + status[i]);
        }
    }
}