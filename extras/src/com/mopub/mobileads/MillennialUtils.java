package com.mopub.mobileads;

import android.os.Handler;
import android.os.Looper;


final public class MillennialUtils {

	private static final Handler handler = new Handler(Looper.getMainLooper());

	public static final String VERSION = "1.2.0";


	public static void postOnUiThread(Runnable runnable) {

		handler.post(runnable);
	}


	public static boolean isEmpty(String s) {

		return (s == null || s.trim().isEmpty());
	}
}