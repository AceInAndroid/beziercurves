package com.example.zhangbing.beziercurves;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TypeTextView mTypeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTypeTextView = ( TypeTextView )findViewById(R.id.typeTxtId);
        mTypeTextView.setOnTypeViewListener( new TypeTextView.OnTypeViewListener( ) {
            @Override
            public void onTypeStart() {

            }
            @Override
            public void onTypeOver() {

            }
        });

        mTypeTextView.start("u 55IW I \n I am serious！\n  ");

    }
}
