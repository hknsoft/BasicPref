# BasicPref
Small library for handling SharedPreferences.\n
`This library is made to make data management easier for android programming beginners.`

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
Only needs to be installed once for a Activity.

Saving Data
-----------
You can save data with this methods:
~~~
basicPref.setString("key", value);
basicPref.setInt("key", value);
basicPref.setFloat("key", value);
basicPref.setBoolean("key", value);
~~~

Examples:
~~~
basicPref.setString("key", "string there");
basicPref.setInt("key", 1);
basicPref.setFloat("key", 5f);
basicPref.setBoolean("key", true);
~~~

Reading Data
-----------
You can read & get data with this methods:
~~~
String value = basicPref.getString("key", defaultValue);
Integer value = basicPref.getInt("key", defaultValue);
Float value = basicPref.getFloat("key", defaultValue);
Boolean value = basicPref.getBoolean("key", defaultValue);
~~~

Examples:
~~~
String value = basicPref.getString("key", "if not signed this string show up");
Integer value = basicPref.getInt("key", 0);
Float value = basicPref.getFloat("key", 3f);
Boolean value = basicPref.getBoolean("key", false);
~~~
