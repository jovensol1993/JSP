package com.increpas.cls.controller.guestBoard;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.GBoardDao;
import com.increpas.cls.vo.GuestBoardVO;

public class GuestBoard implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "guestBoard/GuestBoard";
		
		// 데이터베이스에서 데이터 가져오고
		GBoardDao gDao = new GBoardDao();
		ArrayList<GuestBoardVO> list = new GBoardDao().getGBoardList();

		int cnt = 0;
		try {
			String sid = (String) req.getSession().getAttribute("SID");
			/* list활용방법
			for (int i = 0; i < list.size(); i++) {
				GuestBoardVO gVO = list.get(i);
				String tid = gVO.getId();
				if (sid != null && sid.equals(tid)) {
					cnt = 1;
				}
			}
			*/
			
			// 질의 명령을 한번더 보내서 처리한 방법 cnt = 0 or 1
			cnt = gDao.getIdCnt(sid); 
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 뷰에 데이터 심고
		req.setAttribute("LIST", list);
		req.setAttribute("CNT", cnt);

		return view;
	}
}
