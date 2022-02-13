# BasicPref
Small library for handling SharedPreferences.<br>
`This library is made to make data management easier for android programming beginners.`

Add Library In Your Project
-----------
Add this line in `dependencies`
~~~
implementation 'com.github.hakansrndk60:BasicPref:0.0.3'
~~~

# Usage

Creating BasicPref Object
-----------
You can create `BasicPref` object in the follow this way:
```java
BasicPref basicPref = new BasicPref(context);
```
Only needs to be installed once for a Activity.

Example:
```java
BasicPref basicPref = new BasicPref(MainActivity.this);
```

Saving Data
-----------
You can save data with this methods:
```java
basicPref.setString(key, value);
basicPref.setInt(key, value);
basicPref.setFloat(key, value);
basicPref.setBoolean(key, value);
basicPref.setJSONObject(key, value);
basicPref.setJSONArray(key, value);
```

Examples:
```java
basicPref.setString("key", "string there");
basicPref.setInt("key", 1);
basicPref.setFloat("key", 5f);
basicPref.setBoolean("key", true);
basicPref.setJSONObject("key", "json object as string");
basicPref.setJSONArray("key", "json array as string");
```

Reading Data
-----------
You can read & get data with this methods:
```java
String data = basicPref.getString(key, defaultValue);
Integer data = basicPref.getInt(key, defaultValue);
Float data = basicPref.getFloat(key, defaultValue);
Boolean data = basicPref.getBoolean(key, defaultValue);
JSONObject data = basicPref.getJSONObject(key, defaultValue);
JSONArray data = basicPref.getJSONArray(key, defaultValue);
```

Examples:
```java
String data = basicPref.getString("key", "if not signed this string show up");
Integer data = basicPref.getInt("key", 0);
Float data = basicPref.getFloat("key", 3f);
Boolean data = basicPref.getBoolean("key", false);
JSONObject data = basicPref.getJSONObject("key", "default json object as string");
JSONArray data = basicPref.getJSONArray("key", "default json array as string");
```

License
-----------
~~~
Copyright (C) 2022, hknsoft

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
~~~
