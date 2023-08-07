import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIter = first.iterator();
        Iterator<T> secondIter = second.iterator();

        List<T> results = new ArrayList<>();
        while (firstIter.hasNext() && secondIter.hasNext()) {
            results.add(firstIter.next());
            results.add(secondIter.next());
        }

        Collections.shuffle(results);
        return results.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(10, 12, 123, 321, 41424);
        Stream<Integer> second = Stream.of(101111, 12111111, 122222223, 324444441, 414555524, 1);
        Stream<Integer> newStream = zip(first, second);
        newStream.forEach(System.out::println);
    }
}
