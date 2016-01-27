package com.lanjiessh.baselibs.utils;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * Created by Vin on 2015/12/31.
 */
public class ScreenUtil {

    /**
     * @param activity
     * @return
     */
    public static int getWindowWith(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    /**
     * @param activity
     * @return
     */
    public static int getWindowHeight(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }


    /**
     * @param activity
     * @return
     */
    public static int getDensity(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.densityDpi;
    }


}
