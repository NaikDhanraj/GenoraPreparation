package com.dssp.genorapreparation.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dssp.genorapreparation.R;

public class MainActivity extends AppCompatActivity {

    private String LOGTAG = MainActivity.class.getSimpleName();
    private Context context=MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
