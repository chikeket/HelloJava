package com.yedam.guestManager.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class BeautyDAO {
	//노쇼 체크
	public boolean noshowUpdate(String name, int id, String reserDate, String noshow, String userId, String userPw) {
		Connection conn = DBUUtil.getConnect(userId, userPw);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String inputDate = reserDate;
			String query = "update beauty set content = '없음', cut = 'false', perm = 'false', care = 'false', introduction = '없음', noshow = 'true' where id = ? and name = ? and reser_date = ? "; 
//			String query = "update beauty set noshow = 'true' where id = ? and name = ? and reser_date = ? ";
			try {
				PreparedStatement stmt = conn.prepareStatement(query);
				Date parsedDate = sdf.parse(inputDate);			
				Timestamp timestamp = new Timestamp(parsedDate.getTime());
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setTimestamp(3, timestamp);			
				
				int r = stmt.executeUpdate();
//				ResultSet r = stmt.executeQuery();
				if (r>0) {
					System.out.println("dao 성공");
					return true;
				}
			} catch (Exception e) {				
				e.printStackTrace();
			}
						
		System.out.println("dao실패");
		return false;			
	}
	
	//특정 손님 이력 조회
	public ArrayList<Beauty> findUser(int id, String name, String userId, String userPw) {			
		Connection conn = DBUUtil.getConnect(userId, userPw);
		ArrayList<Beauty> list = new ArrayList<Beauty>();// 컬렉션(Book)
		String query = "select * from beauty where id = ? and name = ? order by reser_date desc";
		try {					
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			ResultSet rs = stmt.executeQuery();
			// 반복.
			while(rs.next()) {
				Beauty beauty = new Beauty();				
				beauty.setName(rs.getString("name")); // title -> title 필드.
				beauty.setReserDate(rs.getString("reser_date"));
				beauty.setCut(rs.getString("cut"));
				beauty.setPerm(rs.getString("perm"));
				beauty.setCare(rs.getString("care"));
				beauty.setNoshow(rs.getString("noshow"));
				beauty.setIntro(rs.getString("introduction"));
				beauty.setContent(rs.getString("content"));
				// 컬렉션에 추가.
				list.add(beauty);				
			}
		} catch (SQLException e) {				
			e.printStackTrace();
		}
		return list;
	}
	// 예약 이력삭제
	public boolean delete(int id, String name, String userId, String userPw) {
		Connection conn = DBUUtil.getConnect(userId, userPw);
		String query = "delete beauty "+								
			           "where id = ? and name = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			int r = stmt.executeUpdate();
			if (r>0) {
				return true;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return false;
	}
	
	// 서비스완료 후 예약손님에게 제공한 서비스이력 추가입력
	public boolean update(int id, String name, String cut, String perm, String care, String intro, String content, String userId, String userPw) {
		Connection conn = DBUUtil.getConnect(userId, userPw);
		String query = "update beauty "+
				"set cut = ?,"+
				    "perm = ?,"+
				     "care = ?,"+
				     "introduction = ?,"+
				     "content = ?"+					
				"where id = ? and name = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, cut);
			stmt.setString(2, perm);
			stmt.setString(3, care);
			stmt.setString(4, intro);
			stmt.setString(5, content);
			stmt.setInt(6, id);
			stmt.setString(7, name);
			System.out.println(query);
			int r = stmt.executeUpdate();
			if (r>0) {
				return true;
			}
		} catch (SQLException e) {				
			e.printStackTrace();
		}
		return false;
	}

	
	// 예약손님 등록
	public boolean insert(Beauty beauty,String id, String pw) {
		Connection conn = DBUUtil.getConnect(id, pw);
		ArrayList<Beauty> list = new ArrayList<Beauty>();
		list = findAll(id, pw);
		//문자열 -> java 스탬프변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");			
		String inputDate = beauty.getReserDate();		
		String inputFDate ;		
		String query ;				
		loof : for(int i=0; i<list.size(); i++) {	
			if(beauty.getId()==list.get(i).getId()  && beauty.getName().equals(list.get(i).getName()) ) {
				query = "insert into beauty (id, reser_date, first_date, name, reser_type) values(?,?,?,?,?)";
				inputFDate = list.get(i).getFirstDate();
				try {
					Date parsedDate = sdf.parse(inputDate);			
					Timestamp timestamp = new Timestamp(parsedDate.getTime());			
					Date parsedFDate = sdf.parse(inputFDate);			
					Timestamp timesFtamp = new Timestamp(parsedFDate.getTime());			
					PreparedStatement stmt = conn.prepareStatement(query);
					stmt.setInt(1, beauty.getId());
//					stmt.setString(2, beauty.getReserDate());
					stmt.setTimestamp(2,  timestamp);
					stmt.setTimestamp(3,  timesFtamp);
					stmt.setString(4, beauty.getName());			
					stmt.setString(5, beauty.getReserType());			
					int r = stmt.executeUpdate();
					if (r>0) {
						return true;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break loof;
			}else {
				query = "insert into beauty (id, reser_date, first_date, name, reser_type) values(?,?,?,?,?)";
				try {
					Date parsedDate = sdf.parse(inputDate);			
					Timestamp timestamp = new Timestamp(parsedDate.getTime());			
					PreparedStatement stmt = conn.prepareStatement(query);
					stmt.setInt(1, beauty.getId());
//					stmt.setString(2, beauty.getReserDate());
					stmt.setTimestamp(2,  timestamp);
					stmt.setTimestamp(3,  timestamp);
					stmt.setString(4, beauty.getName());
					stmt.setString(5, beauty.getReserType());
					int r = stmt.executeUpdate();
					if (r>0) {
						return true;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		return false;		
		
	}//end of insert
	
	// 목록조회(다건)
			public ArrayList<Beauty> findAll(String id, String pw) {			
				Connection conn = DBUUtil.getConnect(id, pw);
				ArrayList<Beauty> list = new ArrayList<Beauty>();// 컬렉션(Book)
				try {
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from beauty order by reser_date desc");
					// 반복.
					while(rs.next()) {
						Beauty beauty = new Beauty();
						beauty.setId(rs.getInt("id")); // id -> id 필드에 할당.
						beauty.setName(rs.getString("name")); // title -> title 필드.
						beauty.setReserDate(rs.getString("reser_date"));
						beauty.setFirstDate(rs.getString("first_date"));
						beauty.setReserType(rs.getString("reser_type"));
						// 컬렉션에 추가.
						list.add(beauty);
						
					}
				} catch (SQLException e) {				
					e.printStackTrace();
				}
				return list;
				
		}//end of findAll().
			
}
