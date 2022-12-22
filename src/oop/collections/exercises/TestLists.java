package oop.collections.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        Lists.generateSquare();
        System.out.println(list);
        Lists.reverse(list);
        System.out.println(list);
        Lists.removeEvil(list);
        System.out.println(list);
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40));
        Lists.insertBeginningEnd(linkedList, 10);
        System.out.println(linkedList);
    }
}
