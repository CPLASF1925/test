package com.bril.widget;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class MDMInfoUtils {

	protected static final String AUTHORITY = "LocationContentProvider";
	private static final String TABLENAME = "location";
	public static final Uri URI = Uri.parse("content://" + AUTHORITY + "/" + TABLENAME);

	public static String getUserInfo(Context context) {
		String sql = "select userinfo from " + TABLENAME + " limit 1 ";
		Cursor cc = null;
		String ret = null;
		try {
			ContentResolver cr = context.getContentResolver();

			cc = cr.query(URI, null, sql, null, null);
			if (cc.moveToFirst()) {
				ret = cc.getString(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (cc != null)
				cc.close();
		}
		return ret;
	}


	public static String getJYBH(Context context) {
		String sql = "select JYBH from " + TABLENAME + " limit 1 ";
		Cursor cc = null;
		String ret = null;
		try {
			ContentResolver cr = context.getContentResolver();

			cc = cr.query(URI, null, sql, null, null);
			if (cc.moveToFirst()) {
				ret = cc.getString(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (cc != null)
				cc.close();
		}
		return ret;
	}
	
	public static int getUnifiedState(Context context) {
		String sql = "select unified_state from " + TABLENAME + " limit 1 ";
		Cursor cc = null;
		int ret = 0;
		try {
			ContentResolver cr = context.getContentResolver();

			cc = cr.query(URI, null, sql, null, null);
			if (cc.moveToFirst()) {
				ret = cc.getInt(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (cc != null)
				cc.close();
		}
		return ret;
	}
	
	public static int getLockState(Context context) {
		String sql = "select lock_state from " + TABLENAME + " limit 1 ";
		Cursor cc = null;
		int ret = 0;
		try {
			ContentResolver cr = context.getContentResolver();

			cc = cr.query(URI, null, sql, null, null);
			if (cc.moveToFirst()) {
				ret = cc.getInt(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (cc != null)
				cc.close();
		}
		return ret;
	}

	

}
