package 민윤기;

import java.util.Scanner;

public class Report3 {

	public static void main(String[] args) {
		// 숫자 추측 게임
		Scanner sc = new Scanner(System.in);
		int randomNum = (int)(Math.random()*100)+1;
		System.out.println("숫자입력");
		int guessNum = Integer.parseInt(sc.nextLine());
		while(guessNum !=randomNum) {
			if(guessNum>randomNum) {
				System.out.println("down하세요!!");
				System.out.println(randomNum);
				guessNum = Integer.parseInt(sc.nextLine());
			}else if(guessNum<randomNum){
				System.out.println("up하세요!!");
				System.out.println(randomNum);
				guessNum = Integer.parseInt(sc.nextLine());
			}
		}
		System.out.println("축하합니다!!");				
		sc.close();

	}//end main

}//end class
