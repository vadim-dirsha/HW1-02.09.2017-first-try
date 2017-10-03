package com.zedzul.github.hw1_02092017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_BAD = "BAD";
    public static final String MSG_FATAL_ERROR = "FATAL ERROR";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //feature_n
        //feature_1
        Log.d(TAG_BAD, MSG_FATAL_ERROR);
        //chery pick test begin
    }
}
