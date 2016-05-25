/**
 * 
 */
package com.txx.payment.web.app.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liu Xin (milo.xiaoxin@hotmail.com)
 *
 */
public class JsonObjectMapper {
	private static final Map<String, String> mapper = new HashMap<String, String>();
	private static final String PATH = "/rest.php";
	private static final String SEARCHUSER = PATH + "/User/searchUser";
	private static final String SEARCHUSERADDRESS = PATH + "User/searchUserAddress";
	private static final String SEARCHSERVICE = PATH + "/Service/searchService";
	private static final String CARDSERVICE = PATH + "/CardRest/cardSearch";
	private static final String STARFLIST = PATH + "/Staff/staffList";
	
	{
		mapper.put(SEARCHUSER, "userList");
		mapper.put(SEARCHUSERADDRESS, "list");
		mapper.put(SEARCHSERVICE, "serviceList");
		mapper.put(CARDSERVICE, "userList");
		mapper.put(STARFLIST, "list");
	}
	
	public static String getResultKey (String key) {
		return mapper.get(key);
	}
}
