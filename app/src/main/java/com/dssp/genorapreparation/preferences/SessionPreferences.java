package com.dssp.genorapreparation.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.dssp.genorapreparation.util.Constant;

/**
 * Created by dhanrajnaik522 on 7/3/2016.
 */
public class SessionPreferences {
    private static final String MYPREFERENCES_KEY = "prefs";

    public static boolean setParams(Context context,
                                    String username,
                                    String email,
                                    String phonenum,
                                    boolean isloggedin) {

    //    SharedPreferences sharedPreferences = context.getSharedPreferences(MYPREFERENCES_KEY,Context.MODE_PRIVATE);
      SharedPreferences.Editor editor = context.getSharedPreferences(MYPREFERENCES_KEY,Context.MODE_PRIVATE).edit();
        editor.putString(Constant.USERNAME,username);
        editor.putString(Constant.EMAIL, email);
        editor.putString(Constant.PHONE, phonenum);
        editor.putBoolean(Constant.ISLOGGEDIN,isloggedin);

        return editor.commit();

    }

    //check user is logged in or not
    public static boolean isUserLoggesin(Context context){
        SharedPreferences preferences = context.getSharedPreferences(MYPREFERENCES_KEY,Context.MODE_PRIVATE);
      return   preferences.getBoolean(Constant.ISLOGGEDIN, false);
    }

    public static String getUserEmail(Context context){
        SharedPreferences preferences = context.getSharedPreferences(MYPREFERENCES_KEY,Context.MODE_PRIVATE);
      return   preferences.getString(Constant.EMAIL,"");

    }
}
