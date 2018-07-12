package com.bril.widget;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class LoginHelper {

	public static final String MX_PAGENAME = "com.bril.im";
	public static final String MX_LOGIN_CLASS = "com.minxing.client.LoginActivity";

	public static boolean Login(Activity activity) {

		int state = MDMInfoUtils.getLockState(activity);
		if (state == 1) {
			activity.finish();
			return false;
		}

		state = MDMInfoUtils.getUnifiedState(activity);
		if (state == 0) {
			Intent intent = new Intent();
			intent.setClassName(MX_PAGENAME, MX_LOGIN_CLASS);
			intent.putExtra("otherapk", true);
			activity.startActivity(intent);
		}

		return true;
	}

}
