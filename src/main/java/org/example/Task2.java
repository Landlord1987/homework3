package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = randomList();
        System.out.println(Arrays.toString(new ArrayList[]{list1}));
        System.out.println(removeEvenNumbers(list1));

        System.out.println();
        ArrayList<Integer> list2 = randomList();
        System.out.println(Arrays.toString(new ArrayList[]{list2}));
        System.out.println(removeEvenNumbers(list2));
    }

    public static ArrayList<Integer> randomList () {
        Random rn = new Random();
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomArrayList.add(rn.nextInt(10));
        }
        return randomArrayList;
    }

    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list){
        ArrayList<Integer> removeEvenNumbersList = new ArrayList<>();
        for (int arr: list) if (arr%2 != 0) removeEvenNumbersList.add(arr);
        return removeEvenNumbersList;
    }
}
