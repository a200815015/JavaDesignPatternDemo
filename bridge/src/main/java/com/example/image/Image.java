package com.example.image;

import com.example.osImageImpl.ImageImpl;

/**
 * Created by yuanzhuang on 2017/7/11.
 */

public abstract class Image {
    protected ImageImpl mImageImpl;

    public void setOsImageImpl(ImageImpl image) {
        mImageImpl = image;
    }

    public abstract void parseImageFile(String ImagePath);


}
