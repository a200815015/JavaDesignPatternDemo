package com.example.example1.lib;

/**
 * Created by yuanzhuang on 2017/7/11.
 * 快速排序类，适配者
 */

public class QuickSort {

    public int[] quickSort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int baseIndex = partiton(array, startIndex, endIndex);
            sort(array, startIndex, baseIndex - 1);
            sort(array, baseIndex + 1, endIndex);
        }
    }

    private int partiton(int[] array, int startIndex, int endIndex) {

        int baseValue = array[endIndex];
        //记录最后一个较小值的位置,默认为startIndex
        int lessIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] < baseValue) {
                swap(array, lessIndex, i);
                lessIndex++;
            }
        }
        swap(array, lessIndex, endIndex);
        return lessIndex;
    }

    private void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

}

