import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 7, 6, 10, 8);

        System.out.println(numbers);

        int sum = numbers.stream().mapToInt(number -> number).sum();

        int sumParallelled = numbers.parallelStream().mapToInt(number -> number).sum();

        double averageTemperature = numbers.parallelStream().mapToInt(number -> number).average().getAsDouble();

        // System.out.println(averageTemperature);

        List<Integer> squaredNumbers = numbers.stream().map(num -> num * num).collect(Collectors.toList());

        // System.out.println(squaredNumbers);

        List<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
       // System.out.println(evenNumber);

        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
       // System.out.println(oddNumbers);

        List<Integer> uniqueNumber = numbers.stream().distinct().collect(Collectors.toList());
        // System.out.println(uniqueNumber);

        IntSummaryStatistics summary = numbers
                .parallelStream()
                .mapToInt(n -> n)
                .summaryStatistics();

        System.out.println(summary);
        System.out.println(summary.getMin());
        System.out.println(summary.getSum());
        System.out.println(summary.getMax());
        System.out.println(summary.getCount());
        System.out.println(summary.getAverage());
    }
}
