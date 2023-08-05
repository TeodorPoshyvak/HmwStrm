import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {


    public static String sortedNumber(String[] arr) {
        String numStr = "";
        for (String num : arr) {
            numStr += num + " ";
        }
        String[] splited = numStr.replace(",", "").split("\\s+");
        List<Integer> parser = new ArrayList<>();
        for (String num : splited) {
            parser.add(Integer.valueOf(num));
        }

        List<Integer> results = parser.stream()
                .sorted()
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        int lastIndex = results.get(results.size() - 1);
        for (int num : results) {
            if (num != lastIndex) {
                sb.append(num).append(", ");
            } else sb.append(num).append(".");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String[] num = {"1, 2, 0", "4, 5"};
        System.out.println("sortedNumber(num) = " + sortedNumber(num));
    }
}
