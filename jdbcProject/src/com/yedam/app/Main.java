package com.yedam.app;

import java.util.ArrayList;
import java.util.Scanner;

// 사용자 입력 -> DB반영.
// DB결과 -> 콘솔출력.
// 컨트롤 역할 수행 파일
public class Main {
	public static void main(String[] args) {
		boolean run = true; // 반복조건에 사용
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO(); //조회
		while(run) {
			System.out.println("📚도서관리 시스템");
			System.out.println("1. 도서목록");
			System.out.println("2. 도서등록");
			System.out.println("3. 도서수정");
			System.out.println("4. 도서삭제");
			System.out.println("9. 종료");
			System.out.print("선택: ");
			int menu = scn.nextInt(); // 입력값을 menu 변수에 대입(할당)
			switch(menu) {
			case 1 : // 도서목록.
				ArrayList<Book> list =  dao.findAll(); // 반환: ArrayList<Book>
				System.out.println("도서번호\t도서명\t\t저자\t가격");
				System.out.println("==========================");
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).getId()
							+"\t"+list.get(i).getTitle()
							+"\t"+list.get(i).getAuthor()
							+"\t"+list.get(i).getPrice());
				}//end of for.
				break;
			case 2 : // 도서등록.
				System.out.print("도서번호>> ");
				int bno = scn.nextInt();scn.nextLine();  // 반환값이 int.
				System.out.print("도서제목>> ");
				String title = scn.nextLine(); // 반환값이 String.
				System.out.print("도서저자>> ");
				String author = scn.nextLine(); // 반환값이 String.
				System.out.print("도서가격>> ");
				int price = scn.nextInt();scn.nextLine();  // 반환값이 int.
				
				Book book = new Book(bno, title, author, price);
				if(dao.insert(book)) {
					System.out.println("정상 등록.");
				} else {
					System.out.println("등록 중 오류.");
				}
				break;
			case 3 : // 도서수정.
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
