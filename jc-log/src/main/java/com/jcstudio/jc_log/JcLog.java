package com.jcstudio.jc_log;

import android.util.Log;

/**
 * Created by jeffrey on 2017/4/21.
 *
 * JC Studio 建立的方便的 Log 訊息產生器
 */

public class JcLog {
    public static String tag = "[訊息]";
    public static void print(String message){
        Log.d(tag, message);
    }
}
