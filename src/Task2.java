import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    /*
    Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
    Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
     */

    public static String sorted(List<String> collection) {
        List<String> upperCase = collection.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return upperCase.toString();
    }

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Petro", "Andrew", "Teodor", "Anna", "Taras", "Mykola");
        System.out.println("sorted(name) = " + sorted(name));
    }
}
