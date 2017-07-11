package com.example;

import com.example.image.Image;
import com.example.image.PngImage;
import com.example.osImageImpl.ImageImpl;
import com.example.osImageImpl.LinuxImageImpl;

public class TestBridge {
    public static void main (String[] arg){
        Image image=new PngImage();
        ImageImpl image1=new LinuxImageImpl();
        image.setOsImageImpl(image1);

        image.parseImageFile("LovelyGirl.png");
    }
}
