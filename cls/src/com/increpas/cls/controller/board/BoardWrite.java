package com.increpas.cls.controller.board;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.BoardDao;
import com.increpas.cls.util.PageUtil;
import com.increpas.cls.vo.BoardVO;

public class BoardWrite implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
	
		String view = "board/BoardWrite";
		return view;
	}
}
