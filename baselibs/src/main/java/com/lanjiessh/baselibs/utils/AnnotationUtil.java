package com.lanjiessh.baselibs.utils;

import android.app.Activity;
import android.view.View;


import com.lanjiessh.baselibs.annotation.FindView;

import java.lang.reflect.Field;

/**
 * Activity中View注解工具类  替换findViewById
 * Created by Vin on 2015/12/31.
 */
public class AnnotationUtil {

    /**
     * 通过注解的方式初始化View
     *
     * @param activity
     */
    public static boolean injectView(final Activity activity) {
        try {
            View view = activity.getWindow().getDecorView();
            Field[] fields = activity.getClass().getDeclaredFields(); //获得声明的字段
            for (Field field : fields) {
                if (field.isAnnotationPresent(FindView.class)) {
                    FindView viewById = field.getAnnotation(FindView.class);
                    int viewId = viewById.value(); // 获取View的Id
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
