package com.yedam;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.common.DBUtil;
import com.yedam.vo.Book;

public class Main {
	public static void main(String[] args) {
		DBUtil util = new DBUtil();
		SqlSessionFactory factory = util.getInstance();
		SqlSession sqlSession = factory.openSession(); // SqlSession 객체를 반환.
		
		//단건조회.
		Book book = sqlSession.selectOne("com.yedam.mapper.BookMapper.selectBook", 1000);
		System.out.println(book);
	}//end main
}//end class
