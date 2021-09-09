import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        GameOfOctopus game = new GameOfOctopus();

        // kører thread
        game.start();
        // kører metoden
         // game.run();
    }

}
