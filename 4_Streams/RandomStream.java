import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.stream.Stream;

public class RandomStream {

    public static void main(String[] args) {

        Random random = new Random();
//        System.out.println(random.nextInt()); // not a stream
        random.ints().limit(4).limit(2).forEach((number) -> System.out.println(number));



    }
}