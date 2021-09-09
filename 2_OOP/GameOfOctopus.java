public class GameOfOctopus extends Thread {


    @Override
    public void run() {
        Octopus octopus = new Octopus();
        octopus.makeDoActivity();
    }
}
