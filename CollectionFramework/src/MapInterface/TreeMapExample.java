package MapInterface;

import java.util.Map;
import java.util.TreeMap;

// basically its ordered map
public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>((Integer key1, Integer key2) -> key2 - key1);
        map1.put(21, "PD");
        map1.put(11, "VK");
        map1.put(5, "PA");
        map1.put(15, "AK");
        map1.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

        System.out.println("------------------------------------");

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(21, "PD");
        map2.put(15, "VK");
        map2.put(11, "PA");
        map2.put(5, "AK");
        map2.forEach((Integer key, String val) -> System.out.println(key + ":" + val));
    }
}
