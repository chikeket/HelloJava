package com.yedam;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.common.DBUtil;
import com.yedam.mapper.BookMapper;
import com.yedam.vo.Book;

public class Main {
	public static void main(String[] args) {
		
//		object obj;
		// RunExe는 Runnable 구현하는 클래스.
		Runnable exe = new RunExe();
		exe.run(); // 인터페이스 - 구현클래스.
//		DBUtil util = new DBUtil(); //인스턴스 통해서 메모리 로딩.
		SqlSessionFactory factory = DBUtil.getInstance();
		SqlSession sqlSession = factory.openSession(); // SqlSession 객체를 반환.
		//인터페이스 - 구현클래스
		BookMapper mapper = sqlSession.getMapper(BookMapper.class);
//		Book book = mapper.selectBook(1001);
		List<Book> list = mapper.selectList();
		Book listb = mapper.selectBook(1000);

		
		//단건조회.
//		Book book = sqlSession.selectOne("com.yedam.mapper.BookMapper.selectBook", 1000);
//		List<Book> list = sqlSession.selectList("com.yedam.mapper.BookMapper.selectList");
		for( Book book : list) {
			System.out.println(book.toStr());
		}
		System.out.println(listb.toStr());
//		System.out.println(book.toString());
//		System.out.println(book.toStr());
	}//end main
}//end class
