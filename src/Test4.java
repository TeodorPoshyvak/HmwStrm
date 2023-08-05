import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    /*
    Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
    Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed,
    і далі кожний наступний елемент рахуйте за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.
    Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.
    Для тесту використовуйте такі дані:
    a = 25214903917
    c = 11
    m = 2^48 (2в степені48`)
     */
    public static Stream<Long> myRandom(long a, long m, long c) {
        AtomicLong x;
        x = new AtomicLong(c);
        Stream<Long> results = Stream.iterate(c, (seed) -> (1 * ((a * x.getAndIncrement()) + c) % m));
        results.peek(System.out::println)
                .collect(Collectors.toList());
        return results;
    }

    public static void main(String[] args) {
        System.out.println("myRandom(25214903917l, 2^48, 11) = " + myRandom(25214903917l, 2 ^ 48, 11));
    }
}
