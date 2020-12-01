package com.increpas.cls.service;

import java.util.ArrayList;

import com.increpas.cls.dao.BoardDao;
import com.increpas.cls.vo.BoardVO;

public class BoardinitService {
	BoardDao bDao;
	
	public BoardinitService() {
		bDao = new BoardDao();
	}
	
	public int setBD() {
		int cnt = 0;
		ArrayList<String> ids = bDao.getIdList();
		
		for (int i = 0; i < ids.size(); i++) {
			BoardVO bVO = new BoardVO();
			bVO.setId(ids.get(i));
			bVO.setTitle(ids.get(i) + "의 타이틀");
			bVO.setBody(ids.get(i) + "의 몸뚱아리");
			cnt += bDao.addBoard(bVO);
		} 
		return cnt;
	}
}
