package com.example.example1;

/**
 * Created by yuanzhuang on 2017/7/11.
 * 操作业务类，目标接口。
 */

public interface ScoreOperation {
    int[] sort(int[] array);

    int search(int[] array, int key);
}
