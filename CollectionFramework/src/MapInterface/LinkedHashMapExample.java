package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        System.out.println("------------- below is LinkedHashMap Output --------------");

        Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");
        map.get(23);
        map.forEach((Integer key, String val) -> System.out.println(key + ": " + val));
        // last element is the highest priority in access order

        System.out.println("------------- below is normal Hashmap Output --------------");

        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1, "A");
        map2.put(21, "B");
        map2.put(23, "C");
        map2.put(141, "D");
        map2.put(25, "E");
        for(Map.Entry<Integer,String> entry: map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



    }
}
