import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, String> dedaqalaqebi = new HashMap<>();
        dedaqalaqebi.put("Georgia", "Tbilisi");
        dedaqalaqebi.put("Portugal", "Lisbon");
        dedaqalaqebi.put("Japan", "Tokyo");
        System.out.println("Capital of Portugal: " + dedaqalaqebi.get("Portugal"));

        dedaqalaqebi.remove("Japan");
        for (String country : dedaqalaqebi.keySet()) {
            System.out.println(country + ": " + dedaqalaqebi.get(country));
       }
    }
}
