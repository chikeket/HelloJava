package chap06_1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// 6-1 클래스 과제
		Scanner sc = new Scanner(System.in);
		boolean oper = true;
		int cnt = 0;
		BookData bookData = new BookData();
		Book[] books=null;
		while(oper) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.도서수 입력 2.도서정보 등록 3.도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("------------------------------------------------------");
			int select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1 :
				System.out.println("선택 > 1");
				System.out.println("도서 수 >");
				cnt = Integer.parseInt(sc.nextLine());
				break;
			case 2 :
				System.out.println("선택 > 2");
				books=bookData.bData(cnt);
				break;
			case 3 :
				System.out.println("선택 > 3");		
				for(int i =0; i<books.length;i++) {
					System.out.printf("도서번호:%d, 책제목:%s, 가격:%d\n",books[i].getNum(),books[i].getName(),books[i].getPrice());
				}
				break;
			case 4 :
				System.out.println("선택 > 4");
					int max = books[0].getPrice();
					int min = books[0].getPrice();
					double sum = 0.0;
					
					for(int i=0;i<books.length;i++) {
						sum += books[i].getPrice();
						if(max < books[i].getPrice()) {
							max = books[i].getPrice();
						}else {
							min = books[i].getPrice();
					}					
				}
					System.out.printf("최고 가격 : %d\n최저 가격 : %d\n평균 가격은 %.1f점 입니다.\n",max,min,sum/cnt);
				break;
			case 5 :
				System.out.println("선택 > 5");
				oper = false;
				break;
			default :
				System.out.println("잘못 입력 됨");
			}
		}
		System.out.println("종료");
		sc.close();

	}//end main

}//end class
