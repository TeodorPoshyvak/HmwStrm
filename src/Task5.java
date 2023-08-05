import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {
    //Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
    // який "перемішує" елементи зі стрімів first та second, зупиняючись тоді,
    // коли у одного зі стрімів закінчаться елементи.

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIter = first.iterator();
        Iterator<T> secondIter = second.iterator();

        List<T> results = new ArrayList<>();

        int i = 0;
        while (firstIter.hasNext() && secondIter.hasNext()) {
            if (i % 2 == 0) {
                results.add(firstIter.next());
            } else {
                results.add(secondIter.next());
            }
            i++;
        }

        return results.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(10, 12, 123, 321, 41424);
        Stream<Integer> second = Stream.of(101111, 12111111, 122222223, 324444441, 414555524);
        Stream<Integer> newStream = zip(first, second);
        newStream.forEach(System.out::println);
    }
}
