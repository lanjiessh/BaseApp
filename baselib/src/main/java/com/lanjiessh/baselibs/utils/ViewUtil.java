package com.lanjiessh.baselibs.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;


/**
 * View tools
 *
 * Created by Vin on 2015/12/31.
 */
public class ViewUtil {

    /**
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
     * @param view
     * @param error
     */
    public static void setError(TextView view, CharSequence error) {
        setError(view, error, 0);
    }


    /**
     * @param view
     * @param error
     * @param indicator_input_error icon
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
