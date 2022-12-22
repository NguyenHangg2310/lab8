package oop.collections.exercises;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);
        Set<Integer> second = new HashSet<>();
        second.add(1);
        second.add(3);
        second.add(4);
        System.out.println(Sets.unionManual(first, second));
        //System.out.println(Sets.intersection(first,second));
        //System.out.println(Sets.intersectionManual(first,second));
        System.out.println(Sets.union(first, second));
        System.out.println(Sets.firstRecurringCharacter("abaco"));
        System.out.println(Sets.allRecurringChars("mama"));
        TreeSet<Integer> treeSet1 = new TreeSet(List.of(1, 2, 3, 5));
        System.out.println(Sets.getFirst(treeSet1));
        System.out.println(Sets.getGreater(treeSet1, 1));
        System.out.println(Sets.getLast(treeSet1));
        List<Integer> list1 = new ArrayList<>(List.of(1, 1, 2, 2, 5, 5, 7));
        System.out.println(Sets.removeDuplicates(list1));
    }
}
