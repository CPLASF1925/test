package com.bril.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;



public class LoadHelper {

	private static LoadHelper instance;
	private Dialog dialogLoading = null;

	private LoadHelper() {
	}

	public static LoadHelper getInstance() {
		if (instance == null) {
			instance = new LoadHelper();
		}
		return instance;
	}

	public void showLoading(Context context, String loadingTxt) {
		dialogLoading = new Dialog(context);
		dialogLoading.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialogLoading.setCanceledOnTouchOutside(false);
		dialogLoading.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(0, 0, 0, 0)));
		View view = LayoutInflater.from(context).inflate(R.layout.dialog_loading, null);
		UniversalLoadingView loding = (UniversalLoadingView) view.findViewById(R.id.ulv_loading);
		if (loadingTxt != null) {
			loding.setLoading(loadingTxt);
		}
		dialogLoading.setContentView(view);
		dialogLoading.show();
	}


	public void showLoading(Context context) {
		showLoading(context, null);
	}


	public void closeLoading() {
		dialogLoading.dismiss();
	}

	public boolean isLoading() {
		return dialogLoading.isShowing();
	}
}
