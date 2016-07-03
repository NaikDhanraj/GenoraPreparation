package com.dssp.genorapreparation.util;

public class MyLog {

    public static boolean DEBUG = false;

    public static void d(String tag, String message) {
        if (DEBUG) {
            android.util.Log.d(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if (DEBUG) {
            android.util.Log.e(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if (DEBUG) {
            android.util.Log.i(tag, message);
        }
    }
}
