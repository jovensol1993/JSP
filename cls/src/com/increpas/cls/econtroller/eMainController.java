package com.increpas.cls.econtroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;

public class eMainController implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		req.setAttribute("isRedirect", false);
		
		String view = "main";
		
		return view;
	}
}
