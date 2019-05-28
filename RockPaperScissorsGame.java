import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        List<String> moves = Arrays.asList("paper", "scissor", "rock");
        Scanner input = new Scanner(System.in);
        System.out.println("What do you pick? (rock, paper, scissors)");
        String userGuess = input.nextLine().toLowerCase();
        Random rand = new Random();
        String computerGuess = moves.get(rand.nextInt(moves.size()));

        if(!moves.contains(userGuess)) {
            System.out.println("invalid input");
        }
        else if(computerGuess.equals(userGuess)){
            System.out.println("draw");
        }
        else if(userGuess.equals("paper") && computerGuess.equals("rock")){
            System.out.println("you win");
        }

        else if(userGuess.equals("rock") && computerGuess.equals("scissor")){
            System.out.println("you win");
        }

        else if(userGuess.equals("scissor") && computerGuess.equals("paper")){
            System.out.println("you win");
        }
    }
}
