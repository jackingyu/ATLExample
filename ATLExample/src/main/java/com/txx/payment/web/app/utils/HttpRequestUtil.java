package com.txx.payment.web.app.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class HttpRequestUtil {
	/**
	 * java.net实现 HTTP POST方法提交
	 * 
	 * @param url
	 * @param paramContent
	 * @return
	 */
	public static StringBuffer submitPost(String url, String paramContent) {
		StringBuffer responseMessage = null;
		java.net.URLConnection connection = null;
		java.net.URL reqUrl = null;
		OutputStreamWriter reqOut = null;
		InputStream in = null;
		BufferedReader br = null;
		String param = paramContent;
		try {

			responseMessage = new StringBuffer();
			reqUrl = new java.net.URL(url);
			connection = reqUrl.openConnection();
			connection.setConnectTimeout(1000000000);
			connection.setReadTimeout(1000000000);
		        
			connection.setDoOutput(true);
			reqOut = new OutputStreamWriter(connection.getOutputStream());
			reqOut.write(param);
			reqOut.flush();
			int charCount = -1;
			in = connection.getInputStream();

			br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			while ((charCount = br.read()) != -1) {
				responseMessage.append((char) charCount);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				in.close();
				reqOut.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return responseMessage;
	}

	/**
	 * java.net实现 HTTP或HTTPs GET方法提交
	 * 
	 * @param strUrl
	 *            提交的地址及参数
	 * @return 返回的response信息
	 */
	public static String submitGet(String strUrl) {
		URLConnection connection = null;
		BufferedReader reader = null;
		String str = null;
		try {
			URL url = new URL(strUrl);
			connection = url.openConnection();
			connection.setDoInput(true);
			connection.setDoOutput(false);
			// 取得输入流，并使用Reader读取
			reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String lines;
			StringBuffer linebuff = new StringBuffer("");
			while ((lines = reader.readLine()) != null) {
				linebuff.append(lines);
			}
			str = linebuff.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return str;
	}

}
