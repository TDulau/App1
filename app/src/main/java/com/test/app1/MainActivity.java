package com.test.app1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		System.out.println("nothing but a log message");
        setContentView(R.layout.activity_main);
    }
}
