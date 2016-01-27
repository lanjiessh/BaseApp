package com.lanjiessh.baselibs.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast
 * Created by Vin on 2015/12/31.
 */
public class JToast {
	
	public static boolean isShow = true;

	private JToast() {
		/** cannot be instantiated **/
		throw new UnsupportedOperationException("cannot be instantiated");
	}

	/**
	 *
	 * @param context
	 * @param message
	 */
	public static void showShort(Context context, CharSequence message) {
		if (isShow)
			Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}

	/**
	 *
	 * @param context
	 * @param message
	 */
	public static void showLong(Context context, CharSequence message) {
		if (isShow)
			Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}

	/**
	 *
	 * @param context
	 * @param message
	 * @param duration
	 */
	public static void show(Context context, CharSequence message, int duration) {
		if (isShow)
			Toast.makeText(context, message, duration).show();
	}

}
