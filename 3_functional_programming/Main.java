import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Eksempel på anonym klasse
        AbstractClass abstractClassImplemented = new AbstractClass() {

            @Override
            public void makeSurrealArt() { // "Hello word" hedder en string literal
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            }
        }; // semikolon indikere, at det er et statement, og en anonym class.

        Comparator<String> stringComparator = new Comparator<String>() {

            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }
        };

        stringComparator.compare("Hello", "Ehllo");

        Comparator<String> stringComparatorLambda = (String firstString, String secondString) -> firstString.compareTo(secondString);

        System.out.println(stringComparatorLambda.compare("a", "b"));
    }
}
