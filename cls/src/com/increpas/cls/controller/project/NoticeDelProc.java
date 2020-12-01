package com.increpas.cls.controller.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.NoticeDao;

public class NoticeDelProc implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		// 번호 받아오고
		int nno = Integer.parseInt(req.getParameter("nno"));
		
		NoticeDao nDao = new NoticeDao();
		int cnt = nDao.delNotice(nno);
		System.out.println("###+ "+ nno+ " 삭제 성공");
		
		String view = "/cls/project/notice.cls";
		req.setAttribute("isRedirect", true);
		return view;
	}

}
