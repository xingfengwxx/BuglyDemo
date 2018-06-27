package com.wangxingxing.buglydemo;

import android.util.Log;

public class BugClass {

    public static final String TAG = "BugClass";

    public String bug() {
//        String str = null;
//        Log.e(TAG, "bug: get string length:" + str.length());
        return "This is a bug class";
    }
}
