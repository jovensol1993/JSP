package com.increpas.cls.sql;

public class test01 {

	public test01() {
		// TODO Auto-generated constructor stub
		BoardSQL bSQL = new BoardSQL();
		String sql = bSQL.getSQL(bSQL.EDIT_BOARD);
		System.out.println("### edit sql : " + sql);
		
		// 타이틀을 수정하는 경우
		sql = sql.replaceAll("###", "title =? ");
		System.out.println("### edit sql : " + sql);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test01();
		
		
	}

}
