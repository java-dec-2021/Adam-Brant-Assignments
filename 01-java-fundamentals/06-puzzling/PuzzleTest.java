import java.util.ArrayList;
import java.util.Random;
public class PuzzleTest {
    
    public static void main(String[] args) {
        Puzzle generator = new Puzzle();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        
        //..
        // Write your other test cases here.
        //..
    }
}