package Game;

import main.java.RockPaperScissorGame.RockPaperScissorsGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorTest {
    @Test public void itShouldGiveTheGameResultDrawWhenBothTheGuessIsSame(){
        String expected = "draw";
        assertEquals(expected,RockPaperScissorsGame.getUserGuess("paper","paper"));
    }
    @Test public void itShouldGiveTheGameResultYouLoose(){
        String expected = "you loose";
        assertEquals(expected,RockPaperScissorsGame.getUserGuess("paper","rock"));
    }
    @Test public void itShouldGiveTheGameResultYouWin(){
        String expected = "you win";
        assertEquals(expected, RockPaperScissorsGame.getUserGuess("scissor","rock"));
    }

}
