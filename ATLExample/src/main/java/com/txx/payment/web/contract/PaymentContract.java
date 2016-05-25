package com.txx.payment.web.contract;

import java.util.Map;

/**
 * Payment contract that must be implements for 3rd party payment providers
 * @author Liu Xin (milo.xiaoxin@hotmail.com)
 *	
 */
public interface PaymentContract {
	public String getPartyServiceUrl(Map<String, String> parameters);
}
