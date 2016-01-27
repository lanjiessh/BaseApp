package com.lanjiessh.baselibs.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;


/**
 * 版本工具类
 * Created by Vin on 2015/12/31.
 */
public class AppVersionUtils {
	private AppVersionUtils() {
		/** cannot be instantiated **/
		throw new UnsupportedOperationException("cannot be instantiated");

	}

	/**
	 *
	 * @param context //
	 * @return 返回versionCode
	 *
	 */
	public static int getVersionCode(Context context) {
		try {
			PackageManager packageManager = context.getPackageManager();
			PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);

			return packageInfo.versionCode;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @param context //
	 * @return versionName
	 */
	public static String getVersionName(Context context) {
		try {
			PackageManager packageManager = context.getPackageManager();
			PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
			return packageInfo.versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}




}
