package com.muzammilpeer.gistapplication;

/**
 * Created by muzammilpeer on 22/07/2015.
 */

import android.annotation.TargetApi;
import android.os.Build;
import android.view.Window;

public class WindowCompatUtils {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static void setStatusBarcolor(Window window, int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(color);
        }
    }
}