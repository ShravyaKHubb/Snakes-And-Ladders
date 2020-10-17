import java.util.Random;

public class StartGameMain {
    
    public static final int START_POSITION = 0;

    public static void main(String[] args) {

        int playerPosition = START_POSITION, dieRoll;
        Random random = new Random();
        dieRoll = random.nextInt(6) + 1;
        
    }

}
