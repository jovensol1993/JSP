package com.increpas.cls.sql;

public class EmpSQL {
	public final int SELECT_EMP_LIST	= 1001;
	public final int SELECT_EMPDETAIL_LIST	= 1002;
	public final int SELECT_ENAME_CNT = 1003;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SELECT_EMP_LIST:
				buff.append(" SELECT ");
				buff.append("	empno, ename ");
				buff.append(" FROM ");
				buff.append(" 	scott.emp");
				break;
		case SELECT_EMPDETAIL_LIST:
				buff.append(" SELECT ");
				buff.append("	empno, ename, hiredate, mgr, comm ");
				buff.append(" FROM ");
				buff.append(" 	scott.emp");
				buff.append(" WHERE ");
				buff.append(" 	empno = ? ");
				break;
		case SELECT_ENAME_CNT:
				buff.append(" SELECT ");
				buff.append("	count(*) cnt ");
				buff.append(" FROM ");
				buff.append(" 	scott.emp");
				buff.append(" WHERE ");
				buff.append(" 	empno = ? ");
				break;
		}
		return buff.toString();
	}
}
