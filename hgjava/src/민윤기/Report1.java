package 민윤기;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		// 윤년 계산
		Scanner sc = new Scanner(System.in);
		System.out.println("##년도 입력");
		int yunYear = Integer.parseInt(sc.nextLine());
		if(yunYear%4==0&&(yunYear%100!=0 ||yunYear%400==0)) {
			System.out.printf("%d년은 윤년입니다",yunYear);
		}else {
			System.out.printf("%d년은 평년입니다",yunYear);			
		}
		
		sc.close();
	}//end main

}//end class
