package com.hknsoft.basicpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hknsoft.library.BasicPref;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BasicPref basicPref = new BasicPref(MainActivity.this);

        String jsonAsString = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";
        basicPref.setJSONObject("key1", jsonAsString);

        Log.d("test", basicPref.getJSONObject("key1", "default").toString());
    }
}