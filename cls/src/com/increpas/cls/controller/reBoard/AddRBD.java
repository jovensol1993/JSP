package com.increpas.cls.controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.service.AddRBDService;

public class AddRBD implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String view = "/cls/reBoard/reBoardList.cls";
		req.setAttribute("isRedirect", true);
		
		AddRBDService rSrvc = new AddRBDService(); 
		int cnt = rSrvc.writeRBD();
		
		System.out.println("***** 입력된 원글 수 : " + cnt);
		
		
		return view;
	}

}
