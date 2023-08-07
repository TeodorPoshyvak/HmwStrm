import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Task1 {

    public static String NameParne(List<String> name) {
        return IntStream.range(0, name.size())
                .filter(num -> num % 2 != 0)
                .mapToObj(i -> i + ". " + name.get(i))
                .collect(Collectors.joining(", "));
    }


    public static void main(String[] args) {
        List<String> name = Arrays.asList("Petro", "Andrew", "Teodor", "Anna", "Taras", "Mykola");
        System.out.println("NameParne(name) = " + NameParne(name));
    }
}
