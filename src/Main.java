import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);


        int die1 = 0;
        int die2 = 0;
        int roll = 0;
        int point;
        boolean playAgain = false;
        String Cont = "";


        do {
            System.out.println("Your first roll");
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            roll = die1 + die2;
            System.out.println("You rolled: " + die1 + " and " + die2);
            System.out.println("For a craps roll of: " + roll);

            if (roll == 7 || roll == 11) {
                System.out.println("You win!");
            } else if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You have crapped out!");
            } else {
                point = die1 + die2;
                System.out.println("The point is: " + point + " You are now going for a point.");
                do {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    roll = die1 + die2;
                    System.out.println("Your next roll was: " + die1 + " and " + die2 + ". For a craps roll of: " + roll);
                    if (roll == point) {
                        System.out.println("You rolled the point. You win!");
                        continue;
                    } else if (roll == 7) {
                        System.out.println("You crapped out!");
                        continue;
                    } else {
                        System.out.println("You did not roll the point or have crapped out. Try again");
                    }

                }while (!(roll == point || roll == 7));
            }


            System.out.println("Do you want to play again [Y/N]");
            if (in.hasNext()) {
                Cont = in.nextLine();
                if (Cont.equalsIgnoreCase("N")) {
                    playAgain = true;
                }
            }
        }while (!playAgain);
    }
}
