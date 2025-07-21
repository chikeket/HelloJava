package chap04;

public class Exam162 {

	public static void main(String[] args) {
		// 주사위 게임
		// 주사위를 2개 던져서 합이 10을 넘으면 두 수를 더하고
		// 아니면 두 수를 곱한 결과를 출력
		int diceA = (int)(Math.random()*6)+1;
		System.out.println(diceA);
		int diceB = (int)(Math.random()*6)+1;
		System.out.println(diceB);
		
		if(diceA+diceB>10) {			
			System.out.println("10보다큼"+(diceA+diceB));
		}else {
			System.out.println("10보다 작음"+diceA*diceB);
		}
		
		//오전시간 (9~12) 일정 출력
		//현재 시간 확인
		int time = (int) (Math.random()*4)+9;
		System.out.println("현재 시간 : "+time);			
		//9시 : 출근합니다
		//10시 : 회의합니다
		//11시 : 업무를 봅니다
		//12시 : 외근을 나갑니다
		
		switch(time) {
		case 9 :
			System.out.println("출근합니다");			
		case 10 :
			System.out.println("회의합니다");			
		case 11 :
			System.out.println("업무를 봅니다");			
		default :
			System.out.println("외근을 나갑니다");			
		}
		System.out.println("오늘 일정 끝");	
		
		//동전 교환 프로그램
		//500원, 100원, 50원, 10원 교환
		//동전 총개수 최소화
		//고액먼저교환
		
//		int money500 ;
//		int money100 ;
//		int money50 ;
//		int money10 ;
		
		//p169 문제3을 스위치문으로 바꾸기
		int score = 95;		
		
		System.out.print("등급은 ");
		
		switch(score/10) {
		case 6 :
			System.out.print("D");
			break;
	    case 7 :
		    System.out.print("C");
		    break;
        case 8 :
	        System.out.print("B");
	        break;
        default :
	        System.out.print("A");	        
        }
		System.out.println("입니다.");
		
		// 주사위 게임
		// 주사위 2개 던져서 합이 10이상이 되면 탈출
		// 주사위 순서쌍 출력 ex(5,2)
		// 5회이상이 되면 게임 오버 출력
		for(int i = 1 ; i<=5 ;i++) {			
			int diceAA = (int)(Math.random()*6)+1;
			int diceBB = (int)(Math.random()*6)+1;
			System.out.printf("%d , %d\n",diceAA,diceBB);
			if(diceAA+diceBB > 10) {
				System.out.printf("%d , %d 5회 전에 나옴",diceAA,diceBB);
				break;
			}
		}
		System.out.println("5회 돌림");
		

	}//end main

}//end class
