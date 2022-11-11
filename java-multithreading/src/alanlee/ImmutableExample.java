package alanlee;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 不可变(Immutable)的对象一定是线程安全的
 *
 * @author AlanLee
 * @date 2022-11-11
 */
public class ImmutableExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println(unmodifiableMap.get("a"));
        unmodifiableMap.put("a", 2);
    }

}