package com.dssp.genorapreparation.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dssp.genorapreparation.R;

/**
 * Created by dhanrajnaik522 on 7/3/2016.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private String LOGTAG = LoginActivity.class.getSimpleName();
    private Context context=LoginActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onClick(View v) {

    }
}
