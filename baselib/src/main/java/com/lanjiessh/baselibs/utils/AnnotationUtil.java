package com.lanjiessh.baselibs.utils;

import android.app.Activity;
import android.view.View;


import com.lanjiessh.baselibs.annotation.FindView;

import java.lang.reflect.Field;

/**
 * Created by Vin on 2015/12/31.
 */
public class AnnotationUtil {

    /**
     *
     * @param activity
     */
    public static boolean injectView(final Activity activity) {
        try {
            View view = activity.getWindow().getDecorView();
            Field[] fields = activity.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(FindView.class)) {
                    FindView viewById = field.getAnnotation(FindView.class);
                    int viewId = viewById.value();
                    if (viewId > 0) {
                        field.setAccessible(true);
                        field.set(activity, view.findViewById(viewId));
                    }
                }
            }
            return true;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return false;
    }
}
