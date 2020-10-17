import java.util.Random;

public class StartGameMain {

    public static final int START_POSITION = 0;
    public static final int WINNING_POSITION = 100;
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;

    public static void main(String[] args) {

        boolean player1IsPlaying = true;
        int player1Position = START_POSITION, player2Position = START_POSITION, dieRoll, options, dieRolledTimes = 0;
        Random random = new Random();

        while(player1Position != WINNING_POSITION && player2Position != WINNING_POSITION) {

            dieRoll = random.nextInt(6) + 1;
            dieRolledTimes++;
            options = random.nextInt(3) + 1;

            if (options == NO_PLAY) {

                if(player1IsPlaying) {

                    player1Position += 0;
                    player1IsPlaying = false;

                } else {

                    player2Position += 0;
                    player1IsPlaying = true;

                }

            } else if (options == LADDER) {

                if(player1IsPlaying) {

                    if (player1Position + dieRoll <= WINNING_POSITION) {

                        player1Position += dieRoll;
                        System.out.println("Player 1 landed on a ladder");

                    }

                } else {

                    if (player2Position + dieRoll <= WINNING_POSITION) {

                        player2Position += dieRoll;
                        System.out.println("Player 2 landed on a ladder");

                    }

                }

            } else if (options == SNAKE) {

                if(player1IsPlaying) {

                    player1Position -= dieRoll;

                    if (player1Position < 0) {

                        player1Position = 0;

                    }

                    System.out.println("Player 1 landed on a snake");

                } else {

                    player2Position -= dieRoll;

                    if (player2Position < 0) {

                        player2Position = 0;

                    }

                    System.out.println("Player 2 landed on a snake");

                }

            }

            System.out.println("Player 1 position  = " + player1Position);
            System.out.println("Player 2 position  = " + player2Position);

        }

        if(player1Position == 100) {

            System.out.println("Player 1 won the game!");

        } else {

            System.out.println("Player 2 won the game!");

        }

        System.out.println("Dice was rolled " + dieRolledTimes + " to win the game");

    }

}
