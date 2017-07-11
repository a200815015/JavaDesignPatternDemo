package com.example.image;

import com.example.Matrix;

/**
 * Created by yuanzhuang on 2017/7/11.
 */

public class PngImage extends Image {
    @Override
    public void parseImageFile(String ImagePath) {
        //解析图像得到Matrix
        Matrix matrix = new Matrix();
        System.out.print("parse Png image file "+ImagePath);
        //解析图像并显示图像到屏幕上
        mImageImpl.draw(matrix);
    }
}
