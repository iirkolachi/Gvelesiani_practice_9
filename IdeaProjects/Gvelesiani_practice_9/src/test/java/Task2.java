import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        HashSet<Integer> ricxvebi = new HashSet<>();
        ricxvebi.add(5);
        ricxvebi.add(7);
        ricxvebi.add(7);
        ricxvebi.add(5);
        ricxvebi.add(3);
        System.out.println(ricxvebi);

        if (ricxvebi.contains(9)) {
            System.out.println("Set contains 9.");
        } else {
            System.out.println("Set does not contain 9.");
        }
        for (Integer num : ricxvebi) {
            System.out.println(num);
        }
    }
}
