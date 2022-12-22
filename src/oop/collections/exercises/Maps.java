package oop.collections.exercises;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer,Integer> map) {
       return map.size();
    }

    public static void empty(Map<Integer,Integer> map) {
        map.clear();
    }

    public static boolean contains (Map<Integer,Integer> map, int key) {
        if (map == null) {
            return false;
        }
        if (map.containsKey(key)) {
            return true;
        }
        return false;
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map == null) {
            return false;
        }
        if (map.containsKey(key) && map.containsValue(value)) {
            return true;
        }
        return false;
    }

    public static Set<Integer> keySet(Map<Integer,Integer> map) {
        return  map.keySet();
    }

    public static Collection<Integer> values(Map<Integer,Integer> map) {
       return map.values();
    }

    public static String getColor(int value) {
        if (value == 0){
            return "black";
        } else if (value == 1) {
            return "white";
        } else if (value == 2) {
            return "red";
        }
        return null;
    }

}
