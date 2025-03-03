package alanlee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OutOfMemoryError: Java heap space
 * OutOfMemoryError: GC overhead limit exceeded
 *
 * @author AlanLee
 * @date 2022-02-27
 */
public class HeapOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        while (true) {
            list.add("1");
        }
    }

    public void testOom1() {
        List<Map<String, Object>> mapList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            Map<String, Object> map = new HashMap<>();
            for (int j = 0; j < i; j++) {
                map.put(String.valueOf(j), j);
            }
            mapList.add(map);
        }
    }

}