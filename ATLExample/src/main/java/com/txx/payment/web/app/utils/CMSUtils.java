package com.txx.payment.web.app.utils;

import java.io.UnsupportedEncodingException;
import java.security.SignatureException;

public class CMSUtils {
	
	/**
	 * 生成6位验证随机数
	 */
	public static String getRandom(){
		return String.valueOf((int)((Math.random()*9+1)*100000));
	}

    /**
     * @param content
     * @param charset
     * @return
     * @throws SignatureException
     * @throws UnsupportedEncodingException 
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }

        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
        }
    }
    
    
}
