import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> xili = new ArrayList<>();
        xili.add("ვაშლი");
        xili.add("მსხალი");
        xili.add("ატამი");
        System.out.println("ჩემი საყვარელი ხილია " + xili.get(2) + " ♥");

        for (String fruit : xili) {
            System.out.println(fruit);
        }
        for (int i = 0; i < xili.size(); i++) {
            System.out.println(xili.get(i));
        }
        Iterator<String> iterator = xili.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        xili.forEach(fruit -> System.out.println(fruit));

        xili.forEach(System.out::println);
    }
}
