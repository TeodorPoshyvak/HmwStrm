import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Task1 {

    public static String NameParne(List<String> name) {
        AtomicInteger i = new AtomicInteger(1);
        name = IntStream.range(0, name.size())
                .filter(num -> num % 2 != 0)
                .mapToObj(name::get)
                .collect(Collectors.toList());
        name.forEach(num -> System.out.println(i.getAndIncrement() + "." + num));
        return name.toString();
    }

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Petro", "Andrew", "Teodor", "Anna", "Taras", "Mykola");
        System.out.println("NameParne(name) = " + NameParne(name));
    }
}
