package 민윤기;

import java.util.Scanner;

public class Report6 {

	public static void main(String[] args) {
		// 가위,바위,보 게임 프로그램
		Scanner sc = new Scanner(System.in);
//		int scissors = 0;
//		int rock = 1;
//		int paper = 2;
		int com ;
		boolean operSwitch = true;
//		while(operSwitch) {
//			com = (int)(Math.random()*3);
//			System.out.println("가위:0, 바위:1, 보:2 중 하나를 선택하세요(0~2)");
//			int userSelect = Integer.parseInt(sc.nextLine());
//			if(userSelect>2) {
//				System.out.println("end");
//				operSwitch = false;
//			}else {
//				switch(userSelect) {
//				case 0 :
//					if(com==2) {
//						System.out.println("user win");
//					}else if (com==1){
//						System.out.println("user lose");					
//					}else {
//						System.out.println("draw");			
//					}
//					break;
//				case 1 :
//					if(com==0) {
//						System.out.println("user win");
//					}else if (com==2){
//						System.out.println("user lose");					
//					}else {
//						System.out.println("draw");			
//					}
//					break;
//				default :
//					if(com==1) {
//						System.out.println("user win");
//					}else if (com==0){
//						System.out.println("user lose");					
//					}else {
//						System.out.println("draw");			
//					}
//					break;							
//			}
//		
//			}
//		}
		while(operSwitch) {
			com = (int)(Math.random()*3);
			System.out.println("가위:0, 바위:1, 보:2 중 하나를 선택하세요(0~2)");
			int userSelect = Integer.parseInt(sc.nextLine());			
			int calculator = (userSelect-com)%3+1;
			if(userSelect>2) {
				System.out.println("end");
				operSwitch = false;
				break;
			}else if(calculator%3 == 1){
				System.out.println("draw");
			}else if(calculator%3 == 0) {
				System.out.println("user loose");
			}else {
				System.out.println("user win");			
			}			
		}
		sc.close();
	}//end main

}//end class
