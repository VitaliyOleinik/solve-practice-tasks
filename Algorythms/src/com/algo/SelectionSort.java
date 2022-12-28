package com.algo;

import java.util.LinkedList;

public class SelectionSort {
    public static void main(String[] args) {
        int[] example = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("The min value with index: " + findSmallest(example) + " and the value = "
                + example[findSmallest(example)]);
        sort(example);
        printArray(example);
    }

    // return index
    private static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static void sort(int... array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // find smallest element
            int minIndex = i;
            for (int j = i + 1; j < n; j ++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            // swap the min element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Prints the array
    private static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
