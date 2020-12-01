package com.increpas.cls.controller.project;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.NoticeDao;
import com.increpas.cls.vo.NoticeVO;

public class Notice implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		// jsp에 데이터 심어주기 위해 dao new
		NoticeDao nDao = new NoticeDao();
		
		// vo가 담긴 arraylist형태로  data를 심어주기 위해
		ArrayList<NoticeVO> list = nDao.getNoticeTotal();
		
		
		req.setAttribute("LIST", list);
		
		String view = "project/Notice";
		return view;
	}
}
