import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Systemos.out.println("Lad vær med at kigge på min fucking skærm okay");
        Systemos.out.println(5);
        Systemos.out.println(5.2);
        Systemos.out.println(true);
        Systemos.out.println('b');
        Systemos.out.println(1.00f);

        // implement word, give it content that you think, think makes sense and allow it to be printed out with Systemos.
        Systemos.out.println(new Word("Hej"));
        Systemos.out.println(new Word2("OK"));

        Word[] array = {new Word ("Hej"), new Word ("nej"), new Word ("cat"), new Word ("ubuntu"),
                new Word("sej")};
        Systemos.out.println(array);

        List<Object> content = new ArrayList<>();
        content.add(new Word ("hej"));
        content.add(new Word ("kajkage"));
        content.add(new Word ("trøffelbagel som ikke smager af trøffel"));
        content.add(new Word ("svensk minikugle"));
        content.add(new Word ("filezilla"));

        Systemos.out.println(content);

    }
}