package chap04;

import java.util.Scanner;

public class Bank183 {

	public static void main(String[] args) {
		// p183 sol_7
		//잔고 변수 생성
		//실행제어 변수
		//업무 1 : 예금, 2:출금, 3:조회, 4:종료
		//종료가 될 때까지 반복
		
		int balance = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int money;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1:예금 | 2:출금 | 3:조회 | 4:종료");
			System.out.println("-----------------------------------");
			
			System.out.print("선택 >");
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			case 1 :
				System.out.print("예금액 >");
				money =Integer.parseInt(sc.nextLine());
				balance += money;
				break;
			case 2 :
				System.out.print("출금액 >");
				money =Integer.parseInt(sc.nextLine());
				
				while(money>balance) {
					System.out.println("잔액부족");
					System.out.printf("출금 가능 금액:%d\n",balance);
					System.out.println("출금액 재입력");
					money =Integer.parseInt(sc.nextLine());
				}
				balance -= money;
				break;
			case 3 :	
				System.out.printf("계좌조회 예치금:%d\n",balance);
				break;
			default :				
				run = false;
			}
		}
		System.out.println("은행 프로그램 종료");
sc.close();
	}//end main

}//end class
