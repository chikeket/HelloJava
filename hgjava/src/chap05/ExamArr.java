package chap05;

//import java.util.Scanner;

public class ExamArr {

	public static void main(String[] args) {
		// 배열 과제1
		// 배열생성 , 크기 10, 데이터 1~100사이 난수
		// 배열의 값 출력
		// 배열의 합, 최대값, 최소값 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("배열의 길이 설정>");
//		int arrUserNum = Integer.parseInt(sc.nextLine());
		int[] pracArr = new int[10];
		int maxNum = 0;
		int minNum = 100;
		for(int i=0;i<pracArr.length;i++) {			
			int ranNum = (int)(Math.random()*100)+1;
			if(ranNum > maxNum) {
				maxNum = ranNum;
			}
			if(ranNum < minNum) {
				minNum = ranNum;
			}
			pracArr[i] = ranNum;
			System.out.printf("%-4d",ranNum);
			if(i%10 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		int pracArrSum = add(pracArr);
		
		System.out.printf("배열의 합:%d, 최대값:%d, 최소값:%d\n",pracArrSum,maxNum,minNum);
		
		// 배열의 요소 중 4의 배수 출력
		// 4의 배수 갯수 출력
		int fourNum = 0;
		for(int i=0;i<pracArr.length;i++) {
			if(pracArr[i]%4==0) {
				System.out.printf("%-4d",pracArr[i]);
				fourNum++;
			}
			
		}
		System.out.println();
		System.out.println("4의 배수 갯수 : "+fourNum);
		
		//2차원 배열
		//배열 선언
		int [][] twoArr = {
				{80, 90},
				{70, 60, 50}
		};
		//2차원 출력
		for(int i=0;i<twoArr.length;i++) {
			for(int j=0;j<twoArr[i].length;j++) {
				System.out.printf("| %d:(%d,%d) ",twoArr[i][j],i,j);
			}
			System.out.println();
		}
		System.out.println();
		//2차원 배열 출력 2번째(5-1과제프로그램 pdf에 있는 2번 문제임)
		int [][] twoTwoArr = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		//출력하기
		for(int i=0;i<twoTwoArr.length;i++) {
			for(int j=0;j<twoTwoArr[i].length;j++) {
				System.out.printf("%d:(%d,%d) ",twoTwoArr[i][j],i,j);
			}
			System.out.println();
		}
		//3번문제(5-1과제프로그램 pdf에 있는 3번 문제임)
		int [][] movieArr = new int[3][10];
		int movieCnt = 0;
		for(int i=0;i<movieArr.length;i++) {
			for(int j=0;j<movieArr[i].length;j++) {
				int ranNum = (int)(Math.random()*2);
				movieArr[i][j] = ranNum;
				System.out.print(movieArr[i][j]+" ");
				if(ranNum==1) {
					movieCnt++;
				}
			}
			System.out.println();
		}
		System.out.println(movieCnt);
		
		//4번문제(5-1과제프로그램 pdf에 있는 4번 문제임)
		int [][] studentScore = new int[3][5];
		for(int i=0;i<studentScore.length;i++) {
			for(int j=0;j<studentScore[i].length;j++) {
				studentScore[i][j] = (int)(Math.random()*51)+50;
				System.out.print(studentScore[i][j] +"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<studentScore.length;i++) {
			double anyOne = 0.0;			
			for(int j=0;j<studentScore[i].length;j++) {
				anyOne += studentScore[i][j];			
			}
			System.out.printf("%d번 학생 평균 = %.2f \n",i+1,anyOne/studentScore[i].length); 		
		}
		System.out.println();
		//5번문제(5-1과제프로그램 pdf에 있는 5번 문제임)
		String [][] trumpCard = {
				{"Clubs", "Diamonds", "Hearts", "Spades"},
				{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}
		};
		
		for(int i=0;i<5;i++) {
			int ranA = (int)(Math.random()*4); 
			int ranB = (int)(Math.random()*13);
			System.out.printf("%s의 %s\n",trumpCard[0][ranA],trumpCard[1][ranB]);
		}
		System.out.println();
		//5번문제 배열 따로 떼기
		String [] trumpName = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] trumpNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		for(int i=0;i<5;i++) {
			int ranA = (int)(Math.random()*4); 
			int ranB = (int)(Math.random()*13);
			System.out.printf("%s의 %s\n",trumpName[ranA],trumpNum[ranB]);
		}
		
//		sc.close();

	}//end main

	public static int add(int[] pracArr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<pracArr.length;i++) {
			sum +=pracArr[i];
		}
		return sum;
	}//end add
	

}//end class
