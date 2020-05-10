package com.skillsup;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 1, 2};
        Map<Integer, Boolean> mem = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mem.containsKey(arr[i])) {
                arr[i] = 0;
            }
            mem.put(arr[i], true);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}