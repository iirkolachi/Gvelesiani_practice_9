import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");

        List<String> uppercase1 = words.stream().map(String::toUpperCase).toList();

        for (String item : words);
        System.out.println(uppercase1);
    }
}
