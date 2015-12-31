package com.lanjiessh.base.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;


/**
 * View工具类
 *
 * Created by Vin on 2015/12/31.
 */
public class ViewUtil {

    /**
     * 设置View的GONE
     *
     * @param view
     * @param <V>
     * @return
     */
    public static <V extends View> V setGone(final V view) {
        if (view != null) {
            if (View.GONE != view.getVisibility()) {
                view.setVisibility(View.GONE);
            }
        }
        return view;
    }


    /**
     * 设置View的INVISIBLE
     *
     * @param view
     * @param <V>
     * @return
     */
    public static <V extends View> V setInvisible(final V view) {
        if (view != null) {
            if (View.INVISIBLE != view.getVisibility()) {
                view.setVisibility(View.INVISIBLE);
            }
        }
        return view;
    }

    /**
     * 设置View的VISIBLE
     *
     * @param view
     * @param <V>
     * @return
     */
    public static <V extends View> V setVisible(final V view) {
        if (view != null) {
            if (View.VISIBLE != view.getVisibility()) {
                view.setVisibility(View.VISIBLE);
            }
        }
        return view;
    }


    /**
     * 设置焦点
     *
     * @param view
     */
    public static void getFocus(View view) {
        if (view != null) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
    }

    /**
     * 输入框错误提示
     * @param view
     * @param error
     */
    public static void setError(TextView view, CharSequence error) {
        setError(view, error, 0);
    }


    /**
     * 输入框错误提示
     * @param view
     * @param error
     * @param indicator_input_error 修改默认错误icon
     */
    public static void setError(TextView view, CharSequence error, int indicator_input_error) {
        if (error == null) {
            view.setError(null, null);
        } else {
            if (indicator_input_error == 0) {
                view.setError(error);
            } else {
                Drawable dr = view.getContext().getResources().getDrawable(indicator_input_error);
                dr.setBounds(0, 0, dr.getIntrinsicWidth(), dr.getIntrinsicHeight());
                view.setError(error, dr);
            }
        }
    }


}
