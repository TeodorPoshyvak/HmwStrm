import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Task1 {
    /*
    Метод приймає на вхід список імен.
    Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами,
     що стоять під непарним індексом (1, 3 тощо)
     */

    public static String NameParne(List<String> name) {
        name = IntStream.range(0, name.size())
                .filter(num -> num % 2 != 0)
                .mapToObj(name::get)
                .collect(Collectors.toList());

        StringBuilder results = new StringBuilder();
        int i = 1;
        for (String num : name) {
            results.append(i).append(".").append(" ").append(num).append("\n");
            i++;
        }
        return results.toString();
    }

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Petro", "Andrew", "Teodor", "Anna", "Taras", "Mykola");
        System.out.println("NameParne(name) = " + NameParne(name));
    }
}
