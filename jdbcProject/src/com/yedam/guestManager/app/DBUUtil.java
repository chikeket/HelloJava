package com.yedam.guestManager.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUUtil {
	public static Connection getConnect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Connection getConnect(String id, String pw) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", id, pw);
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return conn;
	}
}
