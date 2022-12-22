package oop.collections.exercises;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list.size() >= 3) {
            list.remove(2);
        }else {
            System.out.println("Invalid");
        }
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.removeAll(List.of(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> listSquare = new ArrayList<>();
        int s = 1;
        for (int i = 1; i <= 10; i++) {
            s = i * i;
            listSquare.add(s);
        }
        for (int i = 0; i < listSquare.size(); i++) {
            System.out.println(listSquare.get(i));
        }
        return listSquare;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        if (list.contains(value)) {
            return true;
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.removeAll(target);
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println(list);
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(value);
        list.add(0,value);
    }



}
