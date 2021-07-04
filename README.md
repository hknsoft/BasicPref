# BasicPref
Small library for handling SharedPreferences.

Add Library In Your Project
-----------
Add this line in `dependencies`
~~~
compile 'com.github.hakansrndk60:BasicPref:0.0.1'
~~~

# Usage

Creating BasicPref Object
-----------
You can create `BasicPref` object in the follow this way:
~~~
BasicPref basicPref = new BasicPref(context);
~~~

Saving Data
-----------
You can save data with this methods:
~~~
basicPref.setString("key", value);
basicPref.setInt("key", value);
basicPref.setBoolean("key", value);
~~~

Reading Data
-----------
You can read & get data with this methods:
~~~
String value = basicPref.getString("key", defaultValue);
Integer value = basicPref.getInt("key", defaultValue);
Boolean value = basicPref.getBoolean("key", defaultValue);
~~~
