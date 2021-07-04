package com.hknsoft.basicpref;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

public class BasicPref {
    public Context activity_context;

    public  BasicPref(@NonNull Context context) {
        activity_context = context;
    }

    public void setString(String key, String value) {
        SharedPreferences sharedPref = activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, value);
        edit.apply();
    }

    public void setInt(String key, Integer value) {
        SharedPreferences sharedPref = activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public void setBoolean(String key, Boolean value) {
        SharedPreferences sharedPref = activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    public String getString(String key, String defaultValue) {
        return activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE).getString(key, defaultValue);
    }

    public Integer getInt(String key, Integer defaultValue) {
        return activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE).getInt(key, defaultValue);
    }

    public Boolean getBoolean(String key, Boolean defaultValue) {
        return activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE).getBoolean(key, defaultValue);
    }

    public void clearAll() {
        SharedPreferences sharedPref = activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.clear();
        edit.apply();
    }

    public void remove(String key) {
        SharedPreferences sharedPref = activity_context.getSharedPreferences(activity_context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.remove(key);
        edit.apply();
    }
}
