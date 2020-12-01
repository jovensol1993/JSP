package com.increpas.cls.sql;

public class NoticeSQL {
	public final int SEL_NOTICE_TOTAL = 1001;
	public final int SEL_NOTICE_LIST = 1002;
	public final int SEL_NOTICE_DETAIL = 1003;
	
	public final int UPDATE_NOTICE_HITS = 2001;
	public final int UPDATE_NOTICE_DEL = 2002;
	public final int UPDATE_NOTICE_EDIT = 2003;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_NOTICE_TOTAL:
			buff.append("SELECT ");
			buff.append("	nno, title, contents, ndate, hits ");
			buff.append("FROM ");
			buff.append("	NOTICE ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("ORDER BY ");
			buff.append("	nno DESC ");
			break;
		case SEL_NOTICE_LIST:
			buff.append("SELECT ");
			buff.append(" 	contents ");
			buff.append("FROM ");
			buff.append("	NOTICE ");		
			buff.append("WHERE");
			buff.append("	title = ? ");
			break;
		case SEL_NOTICE_DETAIL:
			buff.append("SELECT ");
			buff.append(" 	nno, title, contents, ndate, hits, isshow ");
			buff.append("FROM ");
			buff.append("	NOTICE ");		
			buff.append("WHERE");
			buff.append("	nno = ? ");
			break;
		case UPDATE_NOTICE_HITS:
			buff.append("UPDATE ");
			buff.append(" 	notice ");
			buff.append("SET ");
			buff.append("	hits = hits + 1 ");		
			buff.append("WHERE");
			buff.append("	nno = ? ");
			break;
		case UPDATE_NOTICE_DEL:
			buff.append("UPDATE ");
			buff.append(" 	notice ");
			buff.append("SET ");
			buff.append("	isshow = 'N' ");		
			buff.append("WHERE");
			buff.append("	nno = ? ");
			break;
//		case UPDATE_NOTICE_EDIT:
//			buff.append("UPDATE ");
//			buff.append(" 	notice ");
//			buff.append("SET ");
//			buff.append("	contents = ?, ");		
//			buff.append("	ndate = sysdate, ");		
//			buff.append("WHERE");
//			buff.append("	nno = ? ");
//			break;
		}
		return buff.toString();
	}
}
