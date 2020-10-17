import java.util.Random;

public class StartGameMain {

    public static final int START_POSITION = 0;
    public static final int WINNING_POSITION = 100;
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;

    public static void main(String[] args) {

        int playerPosition = START_POSITION, dieRoll, options, dieRolledTimes = 0;
        Random random = new Random();

        while(playerPosition < WINNING_POSITION) {

            dieRoll = random.nextInt(6) + 1;
            dieRolledTimes++;
            options = random.nextInt(3) + 1;

            if (options == NO_PLAY) {

                playerPosition += 0;

            } else if (options == LADDER) {

                if (playerPosition + dieRoll <= WINNING_POSITION) {

                    playerPosition += dieRoll;
                    System.out.println("Player landed on a ladder");

                } else {

                    System.out.println("Player needs " + (WINNING_POSITION - playerPosition) + " to win!");

                }

            } else if (options == SNAKE) {

                playerPosition -= dieRoll;

                if(playerPosition < 0) {

                    playerPosition = 0;
                }

                System.out.println("Player landed on a snake");

            }

            System.out.println("Player position  = " + playerPosition);

        }

        System.out.println("Dice was rolled " + dieRolledTimes + " to win the game");

    }

}