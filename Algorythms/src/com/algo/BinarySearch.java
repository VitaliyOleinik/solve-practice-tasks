package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        System.out.print("find 8 - index : ");
        System.out.println(binarySearch(list, 8));
        System.out.print("find 5 - index : ");
        System.out.println(binarySearch(list, 5));
        System.out.print("find 2 - index : ");
        System.out.println(binarySearch(list, 2));
        System.out.print("find 209754 - index : ");
        System.out.println(binarySearch(list, 209754));
    }

    private static int binarySearch(List<Integer> list, int findValue) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list.get(mid);
            if (guess == findValue) {
                return mid;
            }
            if (guess > findValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
