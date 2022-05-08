package com.hejie.acm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num85 {
    public static void main(String args[]) {
//        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};


        System.out.println(findRestaurant(list1, list2));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> tt = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    // result.add(list1[i]);
                    tt.put(list1[i], i + j);
                    break;
                }
            }
        }
        //System.out.println(tt);
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> index : tt.entrySet()) {
            if (index.getValue() <= min) {
                min = index.getValue();
            }
        }

        for (Map.Entry<String, Integer> index : tt.entrySet()) {
            if (index.getValue() == min) {
                result.add(index.getKey());
            }
        }
        return result.toArray(new String[0]);
    }
}
