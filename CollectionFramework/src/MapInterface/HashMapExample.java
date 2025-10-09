package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> rollNumberVsNameMap = new HashMap<>();
        rollNumberVsNameMap.put(null, "TEST");
        rollNumberVsNameMap.put(0, null);
        rollNumberVsNameMap.put(1, "A");
        rollNumberVsNameMap.put(2, "B");
        // default size = 16

        // compute if present
        rollNumberVsNameMap.putIfAbsent(null, "test");
        rollNumberVsNameMap.putIfAbsent(0, "ZERO");
        rollNumberVsNameMap.putIfAbsent(3, "C");

        for(Map.Entry<Integer,String> entryMap : rollNumberVsNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }

        // isEmpty
        System.out.println("isEmpty(): " + rollNumberVsNameMap.isEmpty());

        // size
        System.out.println("size: " + rollNumberVsNameMap.size());

        // containsKey
        System.out.println("containsKey(3): " + rollNumberVsNameMap.containsKey(3));

        // get(key)
        System.out.println("get(1): " + rollNumberVsNameMap.get(1));

        // getOrDefault(key)
        System.out.println("get(9): " + rollNumberVsNameMap.getOrDefault(9, "Default value"));

        // remove(key)
        System.out.println("remove(null): " + rollNumberVsNameMap.remove(null));

        for(Map.Entry<Integer,String> entryMap : rollNumberVsNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }

        // keySet()
        for(Integer key: rollNumberVsNameMap.keySet()) {
            System.out.println("Key: " + key);
        }

        // values()
        for(String value: rollNumberVsNameMap.values()) {
            System.out.println("Value: " + value);
        }
    }
}
