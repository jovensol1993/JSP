package com.increpas.cls.controller.emp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.EmpDao;
import com.increpas.cls.vo.EmpVO;

public class EmpList implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		EmpDao eDao = new EmpDao();
		ArrayList<EmpVO> list = eDao.getNameList();
		req.setAttribute("LIST", list);
		
		String view = "emp/EmpList";
		return view;
	}

}
