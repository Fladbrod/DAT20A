import javax.xml.namespace.QName;
import java.util.Random;

public class Octopus extends Animal {

    private final Random random = new Random();
    private static final int min = 1;
    private static final int max = 10;

    GameOfOctopus gameThread = new GameOfOctopus();

    public void makeDoActivity() {

        for (;;) {
            try {
                String activity = selectActivity();
                System.out.println(activity);
                if (activity.equals("Mate")) {
                    GameOfOctopus gameThread = new GameOfOctopus();
                    gameThread.start();
                    gameThread.setName("Octopus");
                    System.out.println("New ocotopus named: " + gameThread.getName() + " conceived");
                }
                if (activity.equals("Eat")) {
                    gameThread.interrupt();
                }
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

        private String selectActivity () {
            String activity;

            int activityNumber = random.nextInt(max) + min;

            switch (activityNumber) {
                case 1:
                    activity = "Eat";
                    break;
                case 2:
                    activity = "Mate";
                    break;
                case 3:
                    activity = "Sleep";
                    break;
                case 4:
                    activity = "Jet ink";
                    break;
                default: activity = move();
            }
            return activity;
        }


        @Override
        public String move () {
            return "swish swash";
        }
    }

