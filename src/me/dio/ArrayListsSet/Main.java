package me.dio.ArrayListsSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] codes = {123, 456};
        System.out.println(codes.length);
        System.out.println(codes[0]);
        System.out.println(codes[1]);
        List<Integer> codes2 = new ArrayList<Integer>();
        codes2.add(codes[0]);
        codes2.add(codes[1]);
        codes2.add(999);
        codes2.forEach(System.out::println);
    }
}
