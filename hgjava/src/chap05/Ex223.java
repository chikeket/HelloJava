package chap05;

import java.util.Scanner;

public class Ex223 {

	public static void main(String[] args) {
		// p223 문제 6번
		//switch문 이용
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");			
			System.out.println("--------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo){
			case 1 : 
				System.out.println("선택> 1");
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				break;
			case 2 :
				System.out.println("선택> 2");
				scores = new int[studentNum];
				for(int i=0;i<scores.length;i++) {
					System.out.printf("%d번째 학생 점수 입력>",i+1);
					int score = Integer.parseInt(sc.nextLine());
					scores[i]=score;					
				}	
				break;
			case 3 :
				System.out.println("선택> 3");
				for(int i=0;i<scores.length;i++) {
					System.out.printf("%d번째 학생>%d\n",i+1,scores[i]);
				}
				break;
			case 4 :
				System.out.println("선택> 4");
				int maxscore = scores[0];
				double scoreSum = 0;
				
				for(int i=0;i<scores.length;i++) {
					scoreSum += scores[i];
					if(maxscore < scores[i]) {
						maxscore = scores[i];
					}
				}
				double scoreAge = scoreSum/(double)studentNum;
				System.out.printf("최고 점수: %d\n",maxscore);
				System.out.printf("평균 점수: %.2f\n",scoreAge);
				break;
				
			default : 
				System.out.println("선택> 5");				
				run = false;				
			}
		}
		System.out.println("프로그램 종료");
		sc.close();

	}//end main

}//end class
