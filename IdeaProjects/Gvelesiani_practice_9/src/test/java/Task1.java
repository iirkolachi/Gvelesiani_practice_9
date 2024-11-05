import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> ferebi = new ArrayList<>();
        ferebi.add("წითელი");
        ferebi.add("ყვითელი");
        ferebi.add("მწვანე");
        System.out.println(ferebi);
        System.out.println("მეორე ფერია: " + ferebi.get(1));
        ferebi.remove(2);
        System.out.println("დარჩა: " + ferebi);
    }
}
