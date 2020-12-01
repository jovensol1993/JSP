package com.increpas.cls.controller.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.EmpDao;
import com.increpas.cls.dao.NoticeDao;
import com.increpas.cls.vo.NoticeVO;

public class NoticeProc implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		req.setAttribute("isRedirect", null);
		
		String title = req.getParameter("title");
		NoticeDao nDao = new NoticeDao();
		NoticeVO nVO = nDao.getContentsList(title);
		System.out.println(title);
		StringBuffer buff = new StringBuffer();
		buff.append("{");
		buff.append(" \"contents\": \""+ nVO.getContents()+"\" ");
		buff.append("}");
		return buff.toString();
	}
}
