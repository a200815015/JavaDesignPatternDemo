package com.example.osImageImpl;

import com.example.Matrix;

/**
 * Created by yuanzhuang on 2017/7/11.
 */

public class LinuxImageImpl implements ImageImpl {
    @Override
    public void draw(Matrix matrix) {
        System.out.print(" draw on Linux system");
    }
}
