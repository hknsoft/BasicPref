/*
 * Copyright (C) 2022, hknsoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hknsoft.library;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Small library for handling SharedPreferences.
 */
public class BasicPref {
    public Context context;

    /**
     * @param context for handling preferences
     */
    public BasicPref(@NonNull Context context) {
        this.context = context;
    }

    /**
     * @param key   specific key for storing data
     * @param value data
     */
    public void setString(String key, String value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, value);
        edit.apply();
    }

    /**
     * @param key   specific key for storing data
     * @param value data
     */
    public void setInt(String key, Integer value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putInt(key, value);
        edit.apply();
    }

    /**
     * @param key   specific key for storing data
     * @param value data
     */
    public void setFloat(String key, Float value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putFloat(key, value);
        edit.apply();
    }

    /**
     * @param key   specific key for storing data
     * @param value data
     */
    public void setBoolean(String key, Boolean value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    /**
     * @param key   specific key for storing data
     * @param value data as string
     */
    public void setJSONObject(String key, String value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, value);
        edit.apply();
    }

    /**
     * @param key   specific key for storing data
     * @param value data as string
     */
    public void setJSONArray(String key, String value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, value);
        edit.apply();
    }

    /**
     * @param key          specific key for storing data
     * @param defaultValue if key null this value to be return
     */
    public String getString(String key, String defaultValue) {
        return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getString(key, defaultValue);
    }

    /**
     * @param key          specific key for storing data
     * @param defaultValue if key null this value to be return
     */
    public Integer getInt(String key, Integer defaultValue) {
        return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getInt(key, defaultValue);
    }

    /**
     * @param key          specific key for storing data
     * @param defaultValue if key null this value to be return
     */
    public Float getFloat(String key, Float defaultValue) {
        return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getFloat(key, defaultValue);
    }

    /**
     * @param key          specific key for storing data
     * @param defaultValue if key null this value to be return
     */
    public Boolean getBoolean(String key, Boolean defaultValue) {
        return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getBoolean(key, defaultValue);
    }

    /**
     * @param key          specific key for storing data
     * @param defaultValue if key null this value to be return
     */
    public JSONObject getJSONObject(String key, String defaultValue) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = new JSONObject(context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getString(key, defaultValue));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    /**
     * @param key          specific key for storing data
     * @param defaultValue if key null this value to be return
     */
    public JSONArray getJSONArray(String key, String defaultValue) {
        JSONArray jsonArray = new JSONArray();
        try {
            jsonArray = new JSONArray(context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getString(key, defaultValue));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonArray;
    }

    /**
     * Clear all data.
     */
    public void clearAll() {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.clear();
        edit.apply();
    }

    /**
     * Remove a specific key.
     *
     * @param key the key you want to delete
     */
    public void remove(String key) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.remove(key);
        edit.apply();
    }
}