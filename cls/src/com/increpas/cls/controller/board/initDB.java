package com.increpas.cls.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.service.BoardinitService;

public class initDB implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		BoardinitService bSrvc = new BoardinitService();
		
		int cnt = bSrvc.setBD();
		System.out.println(cnt + " 명의 회원이 글을 남겼습니다람쥐.");
		
		String view = "/cls/board/boardList.cls";
		req.setAttribute("isRedirect", true);
		return view;
	}
}
