package com.yedam.guestManager.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class BeautyDAO {
	// 예약손님 등록
	public boolean insert(Beauty beauty,String id, String pw) {
		Connection conn = DBUUtil.getConnect(id, pw);
		String query = "insert into beauty (id, reser_date, name) values(?,?,?)";
		
		String inputDate = beauty.getReserDate();
		
			//문자열 -> java 스탬프변환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			
		
		try {
			java.util.Date parsedDate = sdf.parse(inputDate);
			
			Timestamp timestamp = new Timestamp(parsedDate.getTime());
			
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, beauty.getId());
//			stmt.setString(2, beauty.getReserDate());
			stmt.setTimestamp(2,  timestamp);
			stmt.setString(3, beauty.getName());
			
			int r = stmt.executeUpdate();
			if (r>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;		
		
	}
	
	// 목록조회(다건)
			public ArrayList<Beauty> findAll(String id, String pw) {			
				Connection conn = DBUUtil.getConnect(id, pw);
				ArrayList<Beauty> list = new ArrayList<Beauty>();// 컬렉션(Book)
				try {
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from beauty");
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
