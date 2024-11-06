import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");

        List<String> namesFiltered = names.stream()
                                    .filter(item -> item.contains("e"))
                                    .toList(); /*collect(Collectors.toList());
                                                 ინტელიჯეიმ შემომთავაზა ოპტიმიზაცია*/

        namesFiltered.forEach(System.out::println); /*(item -> System.out.println(item));
                                                               ინტელიჯეიმ შემომთავაზა ოპტიმიზაცია*/
    }
}
