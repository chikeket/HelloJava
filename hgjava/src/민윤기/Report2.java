package 민윤기;

import java.util.Scanner;

public class Report2 {

	public static void main(String[] args) {
		// 동전 교환 프로그램
		Scanner sc = new Scanner(System.in);
		int coin500 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin10 = 0;
		int remainCoin = 0;
		System.out.println("교환할 금액 입력>");
		int userCash = Integer.parseInt(sc.nextLine());
		int cashCal = 0;
		if((int)(userCash/500.0)!=0) {
			coin500+=(int)(userCash/500.0);
			cashCal+=coin500*500;			
		}
		if((int)(userCash-cashCal/100.0)!=0) {
			coin100+=(int)((userCash-cashCal)/100.0);			
			cashCal+=coin100*100;				
		}
		if((int)(userCash-cashCal/50.0)!=0) {
			coin50+=(int)((userCash-cashCal)/50.0);
			cashCal+=coin50*50;
		}
		if((int)(userCash-cashCal/10.0)!=0) {
			coin10+=(int)((userCash-cashCal)/10.0);
			cashCal+=coin10*10;			
		}
		remainCoin = userCash-cashCal;
		
		System.out.printf("교환금액:%d,500원:%d,100원:%d,50원:%d,10원:%d,남은:%d,교환금액:%d",userCash,coin500,coin100,coin50,coin10,remainCoin,cashCal);
		sc.close();

	}//end main

}//end class
