package com.java.basics.collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    public void concurrentMapDemo() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Shubham", 1);
        map.put("Soham", 2);
        map.put("Varshit", 3);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("Soham")) {
                map.remove("Soham"); // ✅ Safe in ConcurrentHashMap
            }
        }

        System.out.println(map); // Output: {A=1, C=3}
    }

    public static void main(String[] args) {
        new ConcurrentMapExample().concurrentMapDemo();
    }
}
