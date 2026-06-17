import java.util.Scanner;

public class RockPaperScissorsStats {

    static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if(choice == 0) return "Rock";
        if(choice == 1) return "Paper";

        return "Scissors";
    }

    static String winner(String user,
                         String computer) {

        if(user.equals(computer))
            return "Draw";

        if((user.equals("Rock")
                && computer.equals("Scissors")) ||

                (user.equals("Paper")
                        && computer.equals("Rock")) ||

                (user.equals("Scissors")
                        && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Games: ");
        int n = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println(
                "\nGame\tUser\tComputer\tWinner");

        for(int i=1;i<=n;i++) {

            System.out.print(
                    "\nRock/Paper/Scissors: ");

            String user = sc.next();

            String comp = computerChoice();

            String result =
                    winner(user, comp);

            if(result.equals("User"))
                userWins++;

            if(result.equals("Computer"))
                computerWins++;

            System.out.println(i + "\t"
                    + user + "\t"
                    + comp + "\t\t"
                    + result);
        }

        double userPercent =
                (userWins * 100.0)/n;

        double computerPercent =
                (computerWins * 100.0)/n;

        System.out.println("\nUser Wins = "
                + userWins);

        System.out.println("Computer Wins = "
                + computerWins);

        System.out.println("User % = "
                + userPercent);

        System.out.println("Computer % = "
                + computerPercent);
    }
}