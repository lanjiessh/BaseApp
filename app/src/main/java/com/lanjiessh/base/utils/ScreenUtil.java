package com.lanjiessh.base.utils;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * 屏幕工具类
 * Created by Vin on 2015/12/31.
 */
public class ScreenUtil {

    /**
     * 返回屏幕宽度
     * @param activity
     * @return
     */
    public static int getWindowWith(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    /**
     * 返回屏幕高度
     * @param activity
     * @return
     */
    public static int getWindowHeight(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }


    /**
     * 返回屏幕密度
     * @param activity
     * @return
     */
    public static int getDensity(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.densityDpi;
    }


}
