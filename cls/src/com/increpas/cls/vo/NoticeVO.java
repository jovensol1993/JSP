package com.increpas.cls.vo;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class NoticeVO {
	private int nno, hits;
	private String title, contents, ndate, isshow;
	private Date wdate;
	private Time wtime;
	
	public String getIsshow() {
		return isshow;
	}
	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}
	public int getNno() {
		return nno;
	}
	public void setNno(int nno) {
		this.nno = nno;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	// 입력받은 SQL쿼리 날짜 데이터로 변환시켜주기 위해 오버로딩
	public void setNdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm");
		ndate = form1.format(wdate) + " " + form2.format(wtime);
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
		// setwtime이 셋 될때 sdate가 셋팅되도록 해주기 위해
		setNdate();
	}
}