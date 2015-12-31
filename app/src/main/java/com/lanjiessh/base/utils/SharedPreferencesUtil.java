package com.lanjiessh.base.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;

import java.util.Map;
import java.util.Set;


/**
 * SharedPreferences工具类  必须在application进行初始化
 * Created by Vin on 2015/12/31.
 */
public class SharedPreferencesUtil {


    private static Context mContext;
    private static Boolean mIsInitialized;


    /**
     * 在application调用进行初始化
     * @param mContext
     */
    public void init(Context mContext){
        if (mIsInitialized) {
            Log.v(SharedPreferencesUtil.class.getSimpleName(), "SharedPreferences already initialized.");
            return;
        }

        this.mContext = mContext;
        mIsInitialized = true;
        Log.v(SharedPreferencesUtil.class.getSimpleName(), "SharedPreferences initialized successfully.");
    }


    private static SharedPreferences getSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(mContext);
    }


    public static Map<String, ?> getAll() {
        return getSharedPreferences().getAll();
    }

    public static String getString(String key, String defValue) {
        return getSharedPreferences().getString(key, defValue);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Set<String> getStringSet(String key, Set<String> defValues) {
        return getSharedPreferences().getStringSet(key, defValues);
    }

    public static int getInt(String key, int defValue) {
        return getSharedPreferences().getInt(key, defValue);
    }

    public static long getLong(String key, long defValue) {
        return getSharedPreferences().getLong(key, defValue);
    }

    public static float getFloat(String key, float defValue) {
        return getSharedPreferences().getFloat(key, defValue);
    }

    public static boolean getBoolean(String key, boolean defValue) {
        return getSharedPreferences().getBoolean(key, defValue);
    }

    public static boolean contains(String key) {
        return getSharedPreferences().contains(key);
    }

    public static void putString(String key, String value) {
        getSharedPreferences().edit().putString(key, value).commit();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void putStringSet(String key, Set<String> values) {
        getSharedPreferences().edit().putStringSet(key, values).commit();
    }

    public static void putInt(String key, int value) {
        getSharedPreferences().edit().putInt(key, value).commit();
    }

    public static void putLong(String key, long value) {
        getSharedPreferences().edit().putLong(key, value).commit();
    }

    public static void putFloat(String key, float value) {
        getSharedPreferences().edit().putFloat(key, value).commit();
    }

    public static void putBoolean(String key, boolean value) {
        getSharedPreferences().edit().putBoolean(key, value).commit();
    }

    public static void remove(String key) {
        getSharedPreferences().edit().remove(key).commit();
    }

    public static void clear() {
        getSharedPreferences().edit().clear().commit();
    }



}
