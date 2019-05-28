package Game;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("What do you pick? (rock, paper, scissors)");
            String userGuess = input.nextLine().toLowerCase();
            List<String> moves = Arrays.asList("paper", "scissor", "rock");
            if (!moves.contains(userGuess)) {
                System.out.println("invalid input");
            }
            else {
                System.out.println(getUserGuess(userGuess, getComputerGuess(moves)));
            }
            System.out.println("for play again (yes and no)");
            String again = input.nextLine().toLowerCase();
            if (again.equals("no")){
                break;
            }
        }
    }
    public static String getComputerGuess(List<String> moves){
        Random rand = new Random();
        return moves.get(rand.nextInt(moves.size()));
    }

    public static String getUserGuess(String computerGuess, String userGuess){
        if (computerGuess.equals(userGuess)) {
            return "draw";
        } else if (userGuess.equals("paper") && computerGuess.equals("rock")) {
            return "you win";
        } else if (userGuess.equals("rock") && computerGuess.equals("scissor")) {
            return "you win";
        } else if (userGuess.equals("scissor") && computerGuess.equals("paper")) {
            return "you win";
        }
        else {
            return "you loose";
        }
    }
}


