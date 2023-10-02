/*
 * Copyright (C) 2023 hknsoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hknsoft.basicpref;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

import java.lang.ref.WeakReference;

/**
 * BasicPref - A powerful library for handling SharedPreferences.
 *
 * @author hknsoft
 * @version 1.0.4
 */
public class BasicPref {
    private static volatile BasicPref instance;
    private final SharedPreferences sharedPref;
    private final WeakReference<Context> context;

    private final Gson gson = new Gson();

    /**
     * @param context must be not null.
     */
    private BasicPref(@NonNull Context context) {
        this.context = new WeakReference<>(context);
        this.sharedPref = getContext().getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
    }

    /**
     * Get BasicPref instance.
     *
     * @param context must be not null
     * @return BasicPref object
     * @see BasicPref
     */
    public static BasicPref getInstance(@NonNull Context context) {
        if (instance == null) {
            synchronized (BasicPref.class) {
                if (instance == null) {
                    instance = new BasicPref(context);
                }
            }
        }

        return instance;
    }

    /**
     * Get context.
     *
     * @return global context
     */
    private Context getContext() {
        return context.get();
    }

    /**
     * Store boolean data.
     *
     * @param key   specific key for storing value
     * @param value boolean
     */
    public void setBoolean(String key, boolean value) {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    /**
     * Store float data.
     *
     * @param key   specific key for storing value
     * @param value float
     */
    public void setFloat(String key, float value) {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putFloat(key, value);
        edit.apply();
    }

    /**
     * Store integer data.
     *
     * @param key   specific key for storing value
     * @param value integer
     */
    public void setInt(String key, int value) {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putInt(key, value);
        edit.apply();
    }

    /**
     * Store long data.
     *
     * @param key   specific key for storing value
     * @param value long
     */
    public void setLong(String key, long value) {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putLong(key, value);
        edit.apply();
    }

    /**
     * Store string data.
     *
     * @param key   specific key for storing value
     * @param value string
     */
    public void setString(String key, String value) {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, value);
        edit.apply();
    }

    /**
     * Store any object.
     *
     * @param key specific key for storing value
     * @param obj object
     */
    public void setObject(String key, Object obj) {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, gson.toJson(obj));
        edit.apply();
    }

    /**
     * Retrieve boolean data.
     *
     * @param key      specific key for retrieving value
     * @param defValue default value for if key not set
     * @return boolean
     */
    public boolean getBoolean(String key, boolean defValue) {
        return sharedPref.getBoolean(key, defValue);
    }

    /**
     * Retrieve float data.
     *
     * @param key      specific key for retrieving value
     * @param defValue default value for if key not set
     * @return float
     */
    public float getFloat(String key, float defValue) {
        return sharedPref.getFloat(key, defValue);
    }

    /**
     * Retrieve integer data.
     *
     * @param key      specific key for retrieving value
     * @param defValue default value for if key not set
     * @return integer
     */
    public int getInt(String key, int defValue) {
        return sharedPref.getInt(key, defValue);
    }

    /**
     * Retrieve long data.
     *
     * @param key      specific key for retrieving value
     * @param defValue default value for if key not set
     * @return long
     */
    public long getLong(String key, long defValue) {
        return sharedPref.getLong(key, defValue);
    }

    /**
     * Retrieve string data.
     *
     * @param key      specific key for retrieving value
     * @param defValue default value for if key not set
     * @return string
     */
    public String getString(String key, String defValue) {
        return sharedPref.getString(key, defValue);
    }

    /**
     * Retrieve object.
     *
     * @param key    specific key for retrieving object
     * @param defObj default value for if key not set
     * @return object
     */
    public Object getObject(String key, Object defObj) {
        String s = sharedPref.getString(key, gson.toJson(defObj));
        return gson.fromJson(s, defObj.getClass());
    }

    /**
     * Remove value stored with key.
     *
     * @param key specific key for removing value
     */
    public void remove(String key) {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.remove(key);
        edit.apply();
    }

    /**
     * Removes all values.
     */
    public void clear() {
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.clear();
        edit.apply();
    }
}