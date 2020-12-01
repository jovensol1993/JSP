package com.increpas.cls.controller;

import javax.servlet.http.*;

import com.increpas.cls.dao.ReBoardDao;

public class MainController implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		// view is main jsp file
		String view = "main";
		
		// 댓글게시판 입력 글 수 알아내기
		int cnt = new ReBoardDao().getCnt();
		
		// 데이터 뷰에 심고
		req.setAttribute("RCNT", cnt);
		return view;
	}
}
