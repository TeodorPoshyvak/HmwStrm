import java.beans.Introspector;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {

    public static void sortedNumber(String[] arr) {
        int[] res = Arrays.stream(arr)
                .flatMapToInt(num -> Arrays.stream(num.split(", "))
                        .mapToInt(Integer::parseInt)
                        .sorted())
                .toArray();
        Arrays.stream(res).forEach(num -> {
            if (num != res[res.length - 1]) {
                System.out.print(num + ", ");
            } else System.out.println(num + ".");
        });
    }


    public static void main(String[] args) {
        String[] num = {"1, 2, 0", "4, 5"};
        sortedNumber(num);
    }
}
