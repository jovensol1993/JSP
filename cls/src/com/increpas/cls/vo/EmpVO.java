package com.increpas.cls.vo;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class EmpVO {
	private int empno, mgr;
	private String ename, hiredate, comm;
	private Date wdate;
	private Time wtime;
	
	public String getComm() {
		return comm;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setHiredate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		this.hiredate = form1.format(wdate) +"  "+ form2.format(wtime);
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public Time getWtime() {
		return wtime;
	}
	public void setWtime(Time wtime) {
		this.wtime = wtime;
		setHiredate();
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
