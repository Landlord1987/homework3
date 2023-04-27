package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = randomList();
        System.out.println(Arrays.toString(new ArrayList[]{list1}));
        findMinMidMax(list1);

    }

    public static void findMinMidMax(ArrayList<Integer> list){
        int min = list.get(0);
        int max = list.get(1);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) min = list.get(i);
            if (max < list.get(i)) max = list.get(i);
        }
        int mid = (max + min) / 2;
        System.out.printf("Min = %d, Mid = %d, Max = %d", min, mid, max);
    }
    public static ArrayList<Integer> randomList () {
        Random rn = new Random();
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomArrayList.add(rn.nextInt(10));
        }
        return randomArrayList;
    }
}
