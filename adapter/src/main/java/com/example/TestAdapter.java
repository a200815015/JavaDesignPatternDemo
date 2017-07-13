package com.example;

import com.example.example1.OperationAdapter;

public class TestAdapter {
    public static void main(String[] arg) {
//        8 2 1 7 3 5 9 6
        int[] array = new int[]{8, 2, 1, 7, 3, 5, 9, 6,34,32,90,10};

        OperationAdapter operationAdapter = new OperationAdapter();
        operationAdapter.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n...............\n");
        int key = 8;
        int result = operationAdapter.search(array, key);
        if (result == 1) {
            System.out.println("successfully search for : " + key);
        } else if (result == -1) {
            System.out.println("failed to search for : " + key);
        }
    }


}
