# BasicPref

A powerful library for handling SharedPreferences.

-----------------------------------------

### Documentation

* [Add Library In Your Project](#add-library-in-your-project)
* [Store Data](#store-data)
* [Retrieve Data](#retrieve-data)
* [Remove And Clear](#remove-and-clear)

-----------------------------------------

### Add Library In Your Project

Add this line in `dependencies`

~~~
implementation 'com.github.hknsoft:BasicPref:1.0.4'
~~~

-----------------------------------------

### Store Data

```java
BasicPref basicPref = BasicPref.getInstance(MainActivity.this);

basicPref.setBoolean("key", true);
basicPref.setFloat("key", 2.4F);
basicPref.setInt("key", 114);
basicPref.setLong("key", 1.970L);
basicPref.setString("key", "Jack");
basicPref.setObject("key", new ExampleObject());
```

-----------------------------------------

### Retrieve Data

```java
BasicPref basicPref = BasicPref.getInstance(MainActivity.this);

basicPref.getBoolean("key", false);
basicPref.getFloat("key", 0F);
basicPref.getInt("key", 0);
basicPref.getLong("key", 0L);
basicPref.getString("key", "Default");
basicPref.getObject("key", new ExampleObject());
```

-----------------------------------------

### Remove And Clear

```java
BasicPref basicPref = BasicPref.getInstance(MainActivity.this);

basicPref.remove("key"); // Remove value stored with key.
basicPref.clear(); // Removes all values.
```