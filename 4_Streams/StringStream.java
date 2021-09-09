import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("DenRødePrutFraLufthaven", "ChristianPrut", "PrutChristian", "Patricks sokker"
        , "ChristianPrutDitlevJensenDanmark", "ChristianPrut", "", "12");

        List<String> onlyWords = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

        long vocabulary = strings.stream().filter(s -> !s.isEmpty()).distinct().count();
        System.out.println(vocabulary);

        String sentence = strings
                .parallelStream()
                .filter(s -> !(s.equals("")))
                .collect(Collectors.joining(" ")) + ".";

        System.out.println(sentence);


    }


}
