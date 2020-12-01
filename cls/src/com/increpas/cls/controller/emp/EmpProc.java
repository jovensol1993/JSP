package com.increpas.cls.controller.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.EmpDao;
import com.increpas.cls.vo.EmpVO;

public class EmpProc implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		req.setAttribute("isRedirect", null);
		
		String empnoo = req.getParameter("eno");
		int empno = Integer.parseInt(empnoo);
			System.out.println(empno);
		EmpDao eDao = new EmpDao();
		EmpVO eVO = eDao.getDetailList(empno);
		
		
		StringBuffer buff = new StringBuffer();
		buff.append("{");
		buff.append(" \"empno\":  "+eVO.getEmpno()+", ");
		buff.append(" \"ename\": \""+eVO.getEname()+"\", ");
		buff.append(" \"hiredate\": \""+eVO.getHiredate()+"\", ");
		buff.append(" \"mgr\":  "+eVO.getMgr()+", ");
		buff.append(" \"comm\": \""+eVO.getComm()+"\" ");
		buff.append("}");
		System.out.println(buff.toString());
		return buff.toString();
	}

}
