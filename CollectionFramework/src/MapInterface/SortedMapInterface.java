package MapInterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
    public static void main(String[] args) {
        SortedMap<Integer,String> map2 = new TreeMap<>();
        map2.put(21, "SJ");
        map2.put(11, "PJ");
        map2.put(13, "KJ");
        map2.put(5, "TJ");

        System.out.println(map2.headMap(13));
        System.out.println(map2.tailMap(13));
        System.out.println(map2.firstKey());
        System.out.println(map2.lastKey());
    }
}
