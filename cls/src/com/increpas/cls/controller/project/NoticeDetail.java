package com.increpas.cls.controller.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.NoticeDao;
import com.increpas.cls.vo.NoticeVO;
import com.increpas.cls.dao.NoticeDao;

public class NoticeDetail implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String nno2 = req.getParameter("nno2");
		System.out.println(nno2);
		int nno = Integer.parseInt(nno2);
		NoticeDao nDao = new NoticeDao();
		NoticeVO nVO = nDao.noticeDetail(nno);
		
		req.setAttribute("nVO", nVO);
		String view = "project/NoticeDetail";
		return view;
	}

}
