import java.beans.Introspector;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {

    public static void sortedNumber(String[] arr) {
        System.out.println(Arrays.stream(arr)
                .flatMap(num -> Arrays.stream(num.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", ")));
    }


    public static void main(String[] args) {
        String[] num = {"1, 2, 0", "4, 5"};
        sortedNumber(num);
    }
}
