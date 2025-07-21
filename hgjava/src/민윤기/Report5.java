package 민윤기;

import java.util.Scanner;

public class Report5 {

	public static void main(String[] args) {
		// 섭씨-화씨 온도 변환 프로그램
		boolean operSwitch = true;
		double celsius ;
		double fahrenheit ;
		double userOndo ;
		Scanner sc = new Scanner(System.in);
		while(operSwitch) {
			System.out.println("-------------");
			System.out.println("1.화씨f=>섭씨c");
			System.out.println("2.섭씨c=>화씨f");
			System.out.println("3.종료");
			System.out.println("-------------");
			int selectMenu = Integer.parseInt(sc.nextLine());
			switch(selectMenu) {
			case 1 :
				System.out.println("화씨 온도 입력");
				userOndo = Double.parseDouble(sc.nextLine());
				System.out.println(userOndo);
				celsius = (double)5/9*(userOndo-32);
				System.out.println("섭씨온도 = "+celsius);
				break;
			case 2 :
				System.out.println("섭씨 온도 입력");
				userOndo = Double.parseDouble(sc.nextLine());
				fahrenheit = (double)9/5*userOndo+32;
				System.out.println("화씨온도 = "+fahrenheit);
				break;
			default : 
				System.out.println("Program end");
				operSwitch = false;
			}
		}
		sc.close();

	}//end main

}//end class
