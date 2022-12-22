package oop.collections.exercises;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(100, 3);
        map.put(111, 200);
        map.put(122, 1);
        map.put(123, 2);
        System.out.println(Maps.count(map));
        System.out.println(Maps.keySet(map));
        System.out.println(Maps.values(map));
        for (int i : Maps.values(map)) {
            System.out.println(Maps.getColor(i));
        }
        Maps.empty(map);
        System.out.println(map);
    }
}
