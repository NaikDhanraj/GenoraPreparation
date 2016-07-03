package com.dssp.genorapreparation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.dssp.genorapreparation.R;

/**
 * Created by dhanrajnaik522 on 7/3/2016.
 */
public class SplashActivity extends AppCompatActivity {

    private String LOGTAG = SplashActivity.class.getSimpleName();
    private Context context=SplashActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(context,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                ,5000
        );

        */

        for(int i=1;i<=20;i++){
            for(int j=0;j<i;j++){
              //  Log.e(LOGTAG,"*");
                System.out.print("*");

            }
            System.out.println();

        }
    }


}
