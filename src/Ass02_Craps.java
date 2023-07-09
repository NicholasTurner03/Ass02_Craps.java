import java.util.Scanner;
import java.util.Random;

public class Ass02_Craps {
    Random rnd = new Random();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
        boolean done = false;


        do {
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            System.out.println("You rolled a " + die1 + " and a " + die2);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You rolled a " + crapsRoll);
                System.out.println("You have crapped out, game over!");

            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You rolled a " + crapsRoll);
                System.out.println("You got a natural, you win!");

            } else {
                System.out.println("You rolled a " + crapsRoll);
                System.out.println("The point is now " + crapsRoll);
                int point = crapsRoll;
                die1 = 0;
                die2 = 0;
                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;
                    System.out.println("Your new roll is a " + die1 + " and a " + die2);

                    if (crapsRoll == 7) {
                        System.out.println("You rolled a " + crapsRoll);
                        System.out.println("You lost, game over!");
                        done = true;
                    } else if (crapsRoll == point) {
                        System.out.println("You rolled a " + crapsRoll);
                        System.out.println("You won!");
                        done = true;
                    } else {
                        System.out.println("Your roll is neither point or 7, trying for point again.");
                        done = false;
                    }

                } while (!done);
            }

                System.out.println("Would you like to play again (Y/N): ");
                choice = in.next();
                if (choice.equalsIgnoreCase("Y")) {
                    done = false;
                } else if (choice.equalsIgnoreCase("N")) {
                    done = true;
                } else {
                    System.out.println("Invalid input, try again: ");
                }

        } while (!done);
    }
}





