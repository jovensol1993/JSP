package com.increpas.cls.controller.emp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.EmpDao;
import com.increpas.cls.vo.EmpVO;

public class EmpInfo implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		String sno = req.getParameter("empno");
		System.out.println(sno);
		int eno = Integer.parseInt(sno);
		
		EmpDao eDao = new EmpDao();
		EmpVO eVO = eDao.getDetailList(eno);
		req.setAttribute("EVO",eVO);
		req.getSession().setAttribute("ENO", eno);
		String view = "emp/EmpInfo";
		return view;
	}
}
