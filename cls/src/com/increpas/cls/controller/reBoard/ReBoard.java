package com.increpas.cls.controller.reBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;

public class ReBoard implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String view = "reBoard/ReBoard";
		
		// 데이터 베이스에서 데이터 가져오고
		
		return view;
	}
}
