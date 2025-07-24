package com.yedam.guestManager.app;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		boolean run = true; // 반복조건에 사용		
		Scanner scn = new Scanner(System.in);
		BeautyDAO dao = new BeautyDAO(); //조회
		String userId = null; //= "scott"
		String userPw = null; //= "tiger"
		//로그인 와일문
		loof : while(run) {
			System.out.println("id 입력");
			userId = scn.nextLine();
			System.out.println("pw 입력");
			userPw = scn.nextLine();
			Connection conn = DBUUtil.getConnect(userId, userPw);
			if(conn == null) {
				System.out.println("관리자(점주) 확인이 되지 않습니다.");
			} else {
				System.out.println("관리자(점주) 확인이 되었습니다.");
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
			System.out.println("5. 손님이력");
			System.out.println("6. 노쇼확인");
			System.out.println("9. 종료");
			System.out.print("선택: ");
			int menu = scn.nextInt(); scn.nextLine();// 입력값을 menu 변수에 대입(할당)
			switch(menu) {
			case 1 : // 예약리스트.
				methodCase1(dao, userId, userPw);
				break;			  
			case 2 : // 예약접수.
				methodCase2(scn, dao, userId, userPw);				
				break;
			case 3 : // 예약수정.
				methodCase3(scn, dao, userId, userPw);				
				break;				
			case 4 : //예약 삭제.
				methodCase4(scn, dao, userId, userPw);				
				break;					
			case 5 : //특정손님 예약이력 조회
				methodCase5(scn, dao, userId, userPw);				
				break;
			case 6 : //노쇼 Yes/No 입력하기
				methodCase6(scn, dao, userId, userPw);				
				break;	
			case 9 : // 종료.
				run = false;
			}//end of switch.
			
		}//end of while
		System.out.println("end of program.");	
				
		scn.close();			
		
	}//end main
			//main 메소드 모음 start
	public static void methodCase1(BeautyDAO dao, String userId, String userPw) {
		ArrayList<Beauty> list =  dao.findAll(userId, userPw); // 반환: ArrayList<Book>
		System.out.println("생년월일\t손님이름\t예약날짜\t\t\t첫방문\t\t\t예약경로");
		System.out.println("======================================================================");
		for(int i=0; i<list.size(); i++) {
			Timestamp tsR = Timestamp.valueOf(list.get(i).getReserDate());
			Timestamp tsF = Timestamp.valueOf(list.get(i).getFirstDate());					
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			System.out.println(list.get(i).getId()
					+"\t"+list.get(i).getName()
					+"\t"+sdf.format(tsR)
					+"\t"+sdf.format(tsF)
					+"\t"+list.get(i).getReserType());
		}//end of for.
	}//end of methodCase1
			
		public static void methodCase2(Scanner scn, BeautyDAO dao, String userId, String userPw) {
			System.out.print("손님이름>> ");
			String name = scn.nextLine(); // 반환값이 String.
			System.out.print("생년월일>> ");
			int id = scn.nextInt();scn.nextLine();  // 반환값이 int.
			System.out.print("예약날짜(yyyy-mm-dd 00:00)>> ");
			String reserDate = scn.nextLine(); // 반환값이 String.
			System.out.print("예약경로>> ");
			String yeyacType = scn.nextLine(); // 반환값이 String.			
			Beauty beauty = new Beauty(id, reserDate, name, yeyacType);
			if(dao.insert(beauty, userId, userPw)) {
				System.out.println("정상 등록.");
			} else {
				System.out.println("등록 중 오류.");
			}
		}//end of methodCase2
		
		public static void methodCase3(Scanner scn, BeautyDAO dao, String userId, String userPw) {
			System.out.println("손님이름>>주민번호-예약날짜-커트-펌-두피케어-소개 유무-대화내용");
			System.out.print("손님이름>> ");
			String name3 = scn.nextLine();  
			System.out.println("손님이름-주민번호>>예약날짜-커트-펌-두피케어-소개 유무-대화내용");
			System.out.print("주민번호>> ");
			 int id3 = scn.nextInt();scn.nextLine();  // 반환값이 int.
			 System.out.println("손님이름-주민번호-예약날짜>>커트-펌-두피케어-소개 유무-대화내용");
			 System.out.print("예약날짜(yyyy-mm-dd 00:00)>> ");
			 String reserDate = scn.nextLine();  
			 System.out.println("손님이름-주민번호-예약날짜-커트>>펌-두피케어-소개 유무-대화내용");
			 System.out.print("커트>> ");
			 String cut = scn.nextLine();  
			 System.out.println("손님이름-주민번호-예약날짜-커트-펌>>두피케어-소개 유무-대화내용");
			 System.out.print("펌>> ");
			 String perm = scn.nextLine();  
			 System.out.println("손님이름-주민번호-예약날짜-커트-펌-두피케어>>소개 유무-대화내용");
			 System.out.print("두피케어>> ");
			 String care = scn.nextLine();  
			 System.out.println("손님이름-주민번호-예약날짜-커트-펌-두피케어-소개 유무>>대화내용");
			 System.out.print("소개 유무>> ");
			 String intro = scn.nextLine();  
			 System.out.println("손님이름-주민번호-예약날짜-커트-펌-두피케어-소개 유무-대화내용>>");
			 System.out.print("대화내용>> ");
			 String content = scn.nextLine();  
			if (dao.update(id3, name3, cut, perm, care, intro, content, reserDate, userId, userPw)) {
				System.out.println("정상 수정.");
			} else {
				System.out.println("수정 중 오류.");
			}
		}//end of methodCase3
		
		public static void methodCase4(Scanner scn, BeautyDAO dao, String userId, String userPw) {
			System.out.print("손님이름>> ");
			String name4 = scn.nextLine(); 
			System.out.print("주민번호>> ");
			 int id4 = scn.nextInt();scn.nextLine();  // 반환값이 int.
			 System.out.print("예약날짜>> ");
			 String reserDate = scn.nextLine(); 
			 if (dao.delete(id4, name4, reserDate, userId, userPw)) {
					System.out.println("정상 삭제.");
				} else {
					System.out.println("수정 중 오류.");
				}
		}//end of methodCase4
		
		public static void methodCase5(Scanner scn, BeautyDAO dao, String userId, String userPw) {
			System.out.print("손님이름>> ");
			String name5 = scn.nextLine();
			System.out.print("주민번호>> ");
			 int id5 = scn.nextInt();scn.nextLine();  // 반환값이 int.
			 ArrayList<Beauty> list5 =  dao.findUser(id5, name5, userId, userPw);
			 System.out.println("손님이름\t예약날짜\t\t\t커트\t펌\t두피케어\t노쇼이력\t소개유무\t대화내용");
				System.out.println("======================================================================");
				for(int i=0; i<list5.size(); i++) {
					Timestamp tsR = Timestamp.valueOf(list5.get(i).getReserDate());											
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
					System.out.println(list5.get(i).getName()
							+"\t"+sdf.format(tsR)
							+"\t"+list5.get(i).getCut()
							+"\t"+list5.get(i).getPerm()
							+"\t"+list5.get(i).getCare()
							+"\t"+list5.get(i).getNoshow()
					        +"\t"+list5.get(i).getIntro()
					        +"\t"+list5.get(i).getContent());
				}
				System.out.println(list5.size()+"건 검색이 되었습니다.");
		}//end of methodCase5
		
		public static void methodCase6(Scanner scn, BeautyDAO dao, String userId, String userPw) {
			System.out.print("손님이름>> ");
			String name6 = scn.nextLine();				
			System.out.print("주민번호>> ");
			int id6 = scn.nextInt();scn.nextLine();  // 반환값이 int.				
			System.out.print("예약날짜(yyyy-mm-dd 00:00)>> ");
		    String reserDate6 = scn.nextLine(); // 반환값이 String. 
		    System.out.print("노쇼유무(true/false)>> ");
		    String noshow = scn.nextLine(); // 반환값이 String. 
		    if (noshow.equals("true")) {
		    	dao.noshowUpdate(name6, id6, reserDate6, noshow, userId, userPw);				
			} else {
				System.out.println("노쇼수정 취소함");
			}
		}//end of methodCase6
		//main 메소드 모음 end
		
}//end class
