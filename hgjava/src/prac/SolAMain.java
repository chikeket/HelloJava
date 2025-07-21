package prac;

import java.util.Scanner;

public class SolAMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean oper = true;
		int cnt = 0;
		SolAData bookData = new SolAData();
		SolA[] books = null;
		while(oper) {
			System.out.println("1북수,2북인풋,3북출력,4북연산,5종료");
			int select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1 :
				System.out.println("1번");
				System.out.println("북의 수>");
				cnt = Integer.parseInt(sc.nextLine());
				break;
			case 2 :
				System.out.println("2번");
				books = bookData.bData(cnt);
				break;
			case 3 :
				System.out.println("3번");
				for(int i=0;i<cnt;i++) {
					System.out.printf("책번호:%d, 책제목:%s, 책가격:%d\n",books[i].num,books[i].name,books[i].price);					
				}
				break;
			case 4 :
				System.out.println("4번");
				int max = books[0].price;
				int min = books[0].price;
				double sum = 0;
				for(int i=0;i<cnt;i++) {
					sum += books[i].price;
					if(max < books[i].price) {
						max = books[i].price;
					}else {
						min = books[i].price;
					}
				}
				System.out.printf("최고%d 최저%d 평균%.2f\n",max,min,sum/cnt);
				break;
			case 5 :
				System.out.println("5번");
				oper = false;
				break;
			default :
				System.out.println("다시");
			}
			
		}//end while
		System.out.println("종료");
		sc.close();

	}//end main

}//end class
