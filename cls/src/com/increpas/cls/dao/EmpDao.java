package com.increpas.cls.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.increpas.cls.sql.BoardSQL;
import com.increpas.cls.sql.EmpSQL;
import com.increpas.cls.vo.EmpVO;

import db.ClsDBCP;

public class EmpDao {
	ClsDBCP db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	EmpSQL eSQL;
	
	public EmpDao() {
		db = new ClsDBCP();
		eSQL = new EmpSQL();
	}
	
	public ArrayList<EmpVO> getNameList(){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		con = db.getCon();
		String sql = eSQL.getSQL(eSQL.SELECT_EMP_LIST);
		stmt = db.getSTMT(con);
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				eVO.setEmpno(rs.getInt("empno"));
//				System.out.println(eVO.getEmpno());
				eVO.setEname(rs.getString("ename"));
//				System.out.println(eVO.getEname());
				list.add(eVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
	
	public EmpVO getDetailList(int empno){
		con = db.getCon();
		String sql = eSQL.getSQL(eSQL.SELECT_EMPDETAIL_LIST);
		pstmt = db.getPSTMT(con, sql);
		EmpVO eVO = new EmpVO();
		try {
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			rs.next();
			eVO.setEmpno(rs.getInt("empno"));
			eVO.setEname(rs.getString("ename"));
			eVO.setMgr(rs.getInt("mgr"));
			eVO.setComm(rs.getString("comm"));
			eVO.setWdate(rs.getDate("hiredate"));
			eVO.setWtime(rs.getTime("hiredate"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return eVO;
	}
	
	public int getEmpCnt(int empno) {
		int cnt = 0;
		con = db.getCon();
		String sql = eSQL.getSQL(eSQL.SELECT_ENAME_CNT);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
}
