package com.introvertuoso.computer_vision_project;

import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class Logic {
    private Mat image = null;



    public Mat getImage() {
        return image;
    }
    public void setImage(Mat image) {
        this.image = image;
    }
}
