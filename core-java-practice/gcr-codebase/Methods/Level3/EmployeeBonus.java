public class EmployeeBonus {

    public static double[][] generateEmployeeData() {

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }

        return data;
    }

    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[10][4];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = salary + bonus;
        }

        return result;
    }

    public static void display(double[][] result) {

        double oldSalarySum = 0;
        double newSalarySum = 0;
        double totalBonus = 0;

        System.out.println("Salary\tYears\tBonus\tNew Salary");

        for (double[] row : result) {

            System.out.printf("%.0f\t%.0f\t%.2f\t%.2f%n",
                    row[0], row[1], row[2], row[3]);

            oldSalarySum += row[0];
            totalBonus += row[2];
            newSalarySum += row[3];
        }

        System.out.println("\nTotal Old Salary = " + oldSalarySum);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + newSalarySum);
    }

    public static void main(String[] args) {

        double[][] data = generateEmployeeData();
        double[][] result = calculateBonus(data);

        display(result);
    }
}