package com.increpas.cls.controller.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.NoticeDao;
import com.increpas.cls.vo.NoticeVO;

public class NoticeEdit implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
		String nno3 = req.getParameter("nno3");
		int nno = Integer.parseInt(nno3);
		
		NoticeDao nDao = new NoticeDao();
		NoticeVO nVO = nDao.noticeDetail(nno);
		req.setAttribute("nVO", nVO);
		
		String view = "project/NoticeEdit";
		return view;
	}

}
