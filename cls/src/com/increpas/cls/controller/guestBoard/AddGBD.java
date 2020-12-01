package com.increpas.cls.controller.guestBoard;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.cls.controller.ClsMain;
import com.increpas.cls.dao.GBoardDao;

public class AddGBD implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String view = "/cls/guestBoard/guestBoard.cls";
		/*
		// 데이터베이스에 데이터 입력하고
		ArrayList<HashMap<String, String>> list = getList();
		*/
		
		
		ArrayList<HashMap<String, String>> list = getList(getNameList());
		GBoardDao gDao = new GBoardDao();
		int cnt = gDao.addGBoard(list);
		
		System.out.println("데이터 입력 수" + cnt);
		
		req.setAttribute("isRedirect", true);
		return view;
	}
	
	public ArrayList<String> getNameList(){
		ArrayList<String> name = new ArrayList<String>();
		name.add("jinwoo");
		name.add("hh"); 
		name.add("wook");
		name.add("jang");
		name.add("smkim");
		name.add("mygusdnd");
		name.add("euns");
		name.add("jieun");
		name.add("jeong");
		name.add("juhyun");
		name.add("park");
		
		return name;
	}
	
	public ArrayList<HashMap<String, String>> getList(){
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("id", "euns");
		map1.put("body", "인삿말을 등록하세요!");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("id", "euisan");
		map2.put("body", "내가 일등이다!!!");
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("id", "jiwoo");
		map3.put("body", "제발 지우지마세요!");
		
		HashMap<String, String> map4 = new HashMap<String, String>();
		map4.put("id", "jjang");
		map4.put("body", "10분 쉬었다해요!!!");
		
		HashMap<String, String> map5 = new HashMap<String, String>();
		map5.put("id", "sun");
		map5.put("body", "아이디는 단순하게 만드세요!!");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		return list;
	}
	
	public ArrayList<HashMap<String, String>> getList(ArrayList<String> name){
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		
		for (int i = 0; i < name.size(); i++) { //11
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("id", name.get(i));
			map.put("body", "오늘 가입했어요~![" + (i + 1) + " ]");
			list.add(map);
		}
		return list;
	}
}
