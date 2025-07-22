package com.yedam.guestManager.app;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		boolean run = true; // 반복조건에 사용		
		Scanner scn = new Scanner(System.in);
		BeautyDAO dao = new BeautyDAO(); //조회
		String userId = "scott";
		String userPw = "tiger";
		//로그인 와일문
		loof : while(run) {
//			System.out.println("id 입력");
//			id = scn.nextLine();
//			System.out.println("pw 입력");
//			pw = scn.nextLine();
			Connection conn = DBUUtil.getConnect(userId, userPw);
			if(conn == null) {
				System.out.println("관리자 확인이 되지 않습니다.");
			} else {
				System.out.println("관리자 확인이 되었습니다.");
				break loof ;
			}
		}
			
		//시스템 와일문
		while(run) {
			System.out.println("미용실 손님 관리 시스템");
			System.out.println("1. 예약리스트");
			System.out.println("2. 예약등록");
			System.out.println("3. 예약수정");
			System.out.println("4. 예약삭제");
			System.out.println("5. 고객이력");
			System.out.println("9. 종료");
			System.out.print("선택: ");
			int menu = scn.nextInt(); // 입력값을 menu 변수에 대입(할당)
			switch(menu) {
			case 1 : // 예약리스트.
				ArrayList<Beauty> list =  dao.findAll(userId, userPw); // 반환: ArrayList<Book>
				System.out.println("생년월일\t손님이름\t예약날짜\t\t\t첫방문\t\t\t예약경로");
				System.out.println("======================================================================");
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).getId()
							+"\t"+list.get(i).getName()
							+"\t"+list.get(i).getReserDate()
							+"\t"+list.get(i).getFirstDate()
							+"\t"+list.get(i).getReserType());
				}//end of for.
				break;
			case 2 : // 예약접수.
				System.out.print("생년월일>> ");
				int id = scn.nextInt();scn.nextLine();  // 반환값이 int.
				System.out.print("예약날짜(yyyy-mm-dd 00:00)>> ");
				String reserDate = scn.nextLine(); // 반환값이 String.
				System.out.print("성함>> ");
				String name = scn.nextLine(); // 반환값이 String.
				
				
				Beauty beauty = new Beauty(id, reserDate, name);
				if(dao.insert(beauty, userId, userPw)) {
					System.out.println("정상 등록.");
				} else {
					System.out.println("등록 중 오류.");
				}
				break;
			case 3 : // 예약수정.
				System.out.print("도서번호>> ");
				 bno = scn.nextInt();scn.nextLine();  // 반환값이 int.
				System.out.print("도서가격>> ");
				 price = scn.nextInt();scn.nextLine();  // 반환값이 int.
				if (dao.update(bno, price)) {
					System.out.println("정상 등록.");
				} else {
					System.out.println("수정 중 오류.");
				}
				break;
			case 9 : // 종료.
				run = false;
			}//end of switch.
			
		}//end of while
		System.out.println("end of program.");
		scn.close();

	}//end main

}//end class
