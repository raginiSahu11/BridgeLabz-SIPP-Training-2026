import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))
        ) {

            String line;

            bw.write("\n========== NEW RESULT ENTRY ==========\n");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;
                int subjects = data.length - 1;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / subjects;

                String grade;

                if (average >= 90) {
                    grade = "A+";
                } else if (average >= 80) {
                    grade = "A";
                } else if (average >= 70) {
                    grade = "B";
                } else if (average >= 60) {
                    grade = "C";
                } else {
                    grade = "F";
                }

                bw.write("Student Name : " + name + "\n");
                bw.write("Average Marks: " + String.format("%.2f", average) + "\n");
                bw.write("Grade        : " + grade + "\n");
                bw.write("----------------------------------\n");
            }

            System.out.println("Report cards generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading/writing file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid mark format found in file.");
        }
    }
}