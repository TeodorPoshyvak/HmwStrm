import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {

    public static Stream<Long> myRandom(long a, long m, long c) {
        AtomicLong x;
        x = new AtomicLong(c);
        Stream<Long> results = Stream.iterate(c, (seed) -> (1 * ((a * x.getAndIncrement()) + c) % m));
        results.peek(System.out::println)
                .collect(Collectors.toList());
        return results;
    }

    public static void main(String[] args) {
        System.out.println("myRandom(25214903917l, 2^48, 11) = " + myRandom(25214903917l, (long) Math.pow(2, 48), 11));
    }
}
