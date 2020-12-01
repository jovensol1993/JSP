package com.increpas.cls.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.BoardDao;
import com.increpas.cls.vo.BoardVO;

public class BoardEdit implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String view = "board/BoardEdit";
		
		// 파라미터 받고
		String sno = req.getParameter("bno");
		System.out.println(sno);
		int bno = 0;
		try {
			bno = Integer.parseInt(sno);
			System.out.println(bno);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("숫자 변환 에러");
			
			// 이경우는 게시글 번호를 가져올 수 없는 상황이므로 게시글 리스트로 다시 보낸다.
			req.setAttribute("isRedirect", true);
			return "/cls/board/boardList.cls";
		}
		
		// 긃 번호에 해당하는 데이터를 db에서 가져오고...
		BoardDao bDao = new BoardDao();
		BoardVO bVO = bDao.getDetail(bno);
		
		// 뷰에 데이터 심고
		req.setAttribute("DATA", bVO);
		return view;
	}

}
