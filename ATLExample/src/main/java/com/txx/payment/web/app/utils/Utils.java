/**
 * 
 */
package com.txx.payment.web.app.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu Xin (milo.xiaoxin@hotmail.com)
 *
 */
public class Utils {
	public static <T> List<T> filterList(List<T> filterList, List<T> dest) {
		List<T> list = new ArrayList<T>();
		for (T t : dest) {
			if (!filterList.contains(t))
				list.add(t);
		}

		return list;
	}
	
	private final static char[] mChars = "0123456789ABCDEF".toCharArray(); 
	public static String byte2HexStr(byte[] b) {
		StringBuilder sb = new StringBuilder();
		for (int n = 0; n < b.length; n++) {
			sb.append(mChars[(b[n] & 0xFF) >> 4]);
			sb.append(mChars[b[n] & 0x0F]);
		}
		return sb.toString();
	}

}
