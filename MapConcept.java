import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapConcept {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("Ramesh", 95);
        map.put("Kame", 78);

        System.out.println(map.get("Ramesh"));
        System.out.println(map.get("Kame"));
    }
}
