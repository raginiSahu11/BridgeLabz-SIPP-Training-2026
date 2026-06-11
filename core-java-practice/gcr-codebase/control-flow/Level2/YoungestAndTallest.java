import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest Friend: Amar");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Youngest Friend: Akbar");
        else
            System.out.println("Youngest Friend: Anthony");

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest Friend: Amar");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Tallest Friend: Akbar");
        else
            System.out.println("Tallest Friend: Anthony");
    }
}