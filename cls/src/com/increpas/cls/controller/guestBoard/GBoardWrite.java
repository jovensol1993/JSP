package com.increpas.cls.controller.guestBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.GBoardDao;

public class GBoardWrite implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		// 할일
		// 1. 파라미터 읽어오고
		String sid = "";
		String view = "/cls/guestBoard/guestBoard.cls";

		// 리다이렉트 시켜줘야 한다.
		req.setAttribute("isRedirect", true);
		try {
			sid =(String) req.getSession().getAttribute("SID");
			String body = req.getParameter("body");

			// 2. 데이터베이스 작업하고
			GBoardDao gDao = new GBoardDao();
			int cnt = gDao.addGBoard(sid, body);
			
			if(cnt == 0) {
				view = "/cls/member/login.cls";
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// 3. 결과에 따라 뷰 부르고
		
		
		return view;
	}

}
