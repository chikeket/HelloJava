package chap04;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단
		//단 반복
//		for(int dan = 2; dan<=9; dan++) {
//			System.out.println("****"+dan+"****");
//			for(int gob = 1; gob <=9; gob++) {
//				System.out.printf("%d x %d = %d\n",dan,gob,dan*gob);
//			}
//		}
		
		//구구단2
//		for(int dan = 2; dan<=9; dan++) {
//			System.out.printf("%3d단   ",dan);
//		}
//		for(int dan = 1; dan<=9; dan++) {	
//			System.out.println();
//			for(int gob = 2; gob <=9; gob++) {
//				System.out.printf("%dx%d=%2d ",gob,dan,dan*gob);
//			}
//		}
		
		//p183 문제5
//		for(int i=1;i<=4;i++) {//줄수
//			for(int j=1;j<=i;j++) {//별수
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//p183 문제6
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//가위바위보
		int scissors = 0;
		int rock = 1;
		int paper = 2;
		int com = (int)(Math.random()*3);
		int user = (int)(Math.random()*3);
		System.out.printf("user:%d , com:%d\n",user,com);
		if ((user==scissors &&com==paper)||(user==rock &&com==scissors)||(user==paper &&com==rock)) {
			System.out.println("user win");
		}else if((user==scissors &&com==scissors)||(user==rock &&com==rock)||(user==paper &&com==paper)) {
			System.out.println("draw");
		}else if((user==scissors &&com==rock)||(user==rock &&com==paper)||(user==paper &&com==scissors)) {
			System.out.println("user lose");
		}else {
			System.out.println("game over");			
		}
	}

}
