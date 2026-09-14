import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Swapnil", 12);
        students.put("Sonam", 7);
        students.put("Kalika", 29);

        for ( String key : students.keySet()){
            System.out.println(key + " : "+students.get(key));
        }
    }
}
