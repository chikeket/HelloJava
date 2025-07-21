package chap06_1;

import java.util.Scanner;

public class BookData {
	//필드
	//생성자
	//메소드
	Scanner sc = new Scanner(System.in);
	
	Book[] bData(int n){
		Book[] bookss = new Book[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d번째 도서번호", i+1);
			int num = Integer.parseInt(sc.nextLine());
			
			System.out.printf("%d번째 책제목", i+1);
			String name = sc.nextLine();
			
			System.out.printf("%d번째 도서가격", i+1);
			int price = Integer.parseInt(sc.nextLine());	
			bookss[i] = new Book(num, name, price);
			
		}
		return bookss;
		
//		Book[] books = {
//				new Book(1234, "리어왕", 25600),
//				new Book(4567, "오셀로", 15800),
//				new Book(7890, "햄릿", 37890)
//		};
		
	}
}//end class
