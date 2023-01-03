package com.tasks.array_collections_data_structure;
public class NextBiggestElem {

    public static void main(String[]args){
        int [] integers = {1, 2, 3, 4, 12, 2, 1, 4};
        println(integers);
    }

    public static void println(int[] arr) {
        int nge;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            nge = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    nge = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " : " + nge);
        }
    }
}
