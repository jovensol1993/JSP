package com.increpas.cls.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.increpas.cls.sql.NoticeSQL;
import com.increpas.cls.vo.NoticeVO;

import db.FreeDBCP;

public class NoticeDao {
	FreeDBCP db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	NoticeSQL nSQL;
	
	public NoticeDao() {
		db = new FreeDBCP();
		nSQL = new NoticeSQL();
	}
	
	// 공지사항 전체 가져오기 전담 처리함수
	public ArrayList<NoticeVO> getNoticeTotal(){
		ArrayList<NoticeVO> list  = new ArrayList<NoticeVO>();
		
		
		con = db.getCon();
		String sql = nSQL.getSQL(nSQL.SEL_NOTICE_TOTAL);
		stmt = db.getSTMT(con);
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NoticeVO nVO = new NoticeVO();
				nVO.setNno(rs.getInt("nno"));
				String title = rs.getString("title");
				if(title.length() > 30) {
					title = title.substring(0, 30) + "...";
				}
				nVO.setTitle(title);
				nVO.setContents(rs.getString("contents"));
				nVO.setHits(rs.getInt("hits"));
				nVO.setWdate(rs.getDate("ndate"));
				nVO.setWtime(rs.getTime("ndate"));
				list.add(nVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
	
	// contents 가져오기 전담 처리 함수
	public NoticeVO getContentsList(String title) {
		con = db.getCon();
		String sql = nSQL.getSQL(nSQL.SEL_NOTICE_LIST);
		pstmt = db.getPSTMT(con, sql);
		NoticeVO nVO = new NoticeVO();
		try {
			pstmt.setNString(1, title);
			rs = pstmt.executeQuery();
			rs.next();
			nVO.setContents(rs.getString("contents"));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return nVO;
	}
	
	// 조회수 처리 함수
	public NoticeVO upHits(int nno) {
		con = db.getCon();
		String sql = nSQL.getSQL(nSQL.UPDATE_NOTICE_HITS);
		pstmt = db.getPSTMT(con, sql);
		NoticeVO nVO = new NoticeVO();
		try {
			pstmt.setInt(1, nno);
			rs = pstmt.executeQuery();
			rs.next();
			nVO.setHits(rs.getInt("hits"));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return nVO;
	}
	
	// detail 처리 함수
	public NoticeVO noticeDetail(int nno) {
		con = db.getCon();
		String sql = nSQL.getSQL(nSQL.SEL_NOTICE_DETAIL);
		pstmt = db.getPSTMT(con, sql);
		NoticeVO nVO = new NoticeVO();
		try {
			pstmt.setInt(1, nno);
			rs = pstmt.executeQuery();
			rs.next();
			nVO.setNno(rs.getInt("nno"));
			nVO.setTitle(rs.getString("title"));
//			String contents = rs.getString("contents");
//			if(contents.length() > 30) {
//				contents = contents.substring(0, 50) + "...";
//			}
			nVO.setContents(rs.getString("contents"));
			nVO.setHits(rs.getInt("hits"));
			nVO.setWdate(rs.getDate("ndate"));
			nVO.setWtime(rs.getTime("ndate"));
			nVO.setIsshow(rs.getString("isshow"));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return nVO;
	}
	
	// 글 삭제 데이터 베이스 전담 처리 함수
	public int delNotice(int nno) {
		int cnt = 0;
		 
		con = db.getCon();
		String sql = nSQL.getSQL(nSQL.UPDATE_NOTICE_DEL);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, nno);
			cnt = pstmt.executeUpdate();
		} catch(Exception e ) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	// 글 편집 데이터베이스 전담 처리 함수
	public int editNotice(String contents, int nno) {
		int cnt = 0;
		// 할일
		// 커넥션 얻어오고
		con = db.getCon();
		// 질의 명령 가져오고
		String sql = nSQL.getSQL(nSQL.UPDATE_NOTICE_EDIT);
		// pstmt가져오고
		pstmt = db.getPSTMT(con, sql);
		try {
			// 질의명령 완성하고
			pstmt.setString(1, contents);
			pstmt.setInt(2, nno);
			// 질의명령 보내고 반환값 받고
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		// 결과 내보내고
		return cnt;
	}
	
}
