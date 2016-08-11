package com.jesusalvizo.myfirstapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"BebasNeue Bold.ttf");
        TextView myTextview = (TextView)findViewById(R.id.textview1);
        myTextview.setTypeface(myTypeface);
    }
}
