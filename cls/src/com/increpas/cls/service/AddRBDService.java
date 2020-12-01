package com.increpas.cls.service;

import com.increpas.cls.dao.ReBoardDao;
import com.increpas.cls.vo.*;
import java.util.*;
public class AddRBDService {
	ReBoardDao rDao;
	public AddRBDService() {
		rDao = new ReBoardDao();
	}
	
	// 댓글게시판 원글입력 전담 처리함수
	public int writeRBD() {
		int cnt = 0;
		ArrayList<ReBoardVO> list = getList();
		
		for (int i = 0; i < list.size(); i++) {
			cnt += rDao.addBoard(list.get(i));
		}
		
		return cnt;
	}
	
	// 댓글게시판 더미데이터 생성 함수
	public ArrayList<ReBoardVO> getList(){
		// 반환값 변수
//		ArrayList<ReBoardVO> list = new ArrayList<ReBoardVO>();
		ArrayList<ReBoardVO> list = getIdList();
		// 본문글만 채워준다
		for (int i = 0; i < list.size(); i++) {
//			ReBoardVO rVO = list.get(i);
//			rVO.setBody(rVO.getId() + " 님이 글을 씁니다.") // jiwoo 씨가 글을 씁니다.
			list.get(i).setBody(list.get(i).getId() + " 님이 글을 씁니다.");
			
		}
		
		return list;
	}
	
	// 회원 아이디 리스트 반환해주는 함수
	public ArrayList<ReBoardVO> getIdList(){
		ArrayList<ReBoardVO> list = rDao.getIdList();
		
		/*
		list.add("gildong");
		list.add("euisan");
		list.add("sun");
		list.add("jjang");
		list.add("jinwoo");
		list.add("hh");
		list.add("kys");
		list.add("wook");
		list.add("jang");
		list.add("smkim");
		list.add("mygusdnd");
		list.add("jiwoo");
		list.add("euns");
		list.add("jieun");
		list.add("jeong");
		list.add("juhyun");
		list.add("park");
		*/
		
		
		return list;
	}
}
