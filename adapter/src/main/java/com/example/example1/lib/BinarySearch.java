package com.example.example1.lib;

/**
 * Created by yuanzhuang on 2017/7/11.
 * 二分查找，是适配者
 */

public class BinarySearch {
    //
    public int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <=end) {
            int mid = (start + end) / 2;
            int midValue=array[mid];
            if (key > midValue) {
                start = mid + 1;
            } else if (key < midValue) {
                end = mid - 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}
