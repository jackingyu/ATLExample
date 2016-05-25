package com.txx.payment.web.controller.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginPageController {
	
	@RequestMapping("/login")
	@ResponseBody
	public String getServiceUrl(final HttpServletRequest request, final Model model) {
		return "hello ATL!";
	}

}
