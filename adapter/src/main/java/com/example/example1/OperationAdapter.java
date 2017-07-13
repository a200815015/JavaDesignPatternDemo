package com.example.example1;

import com.example.example1.lib.BinarySearch;
import com.example.example1.lib.QuickSort;

/**
 * Created by yuanzhuang on 2017/7/11.
 */

public class OperationAdapter implements ScoreOperation {

    private QuickSort mQuickSort;
    private BinarySearch mBinarySearch;

    public OperationAdapter() {
        mQuickSort = new QuickSort();
        mBinarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return mQuickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return mBinarySearch.binarySearch(array,key);
    }
}
