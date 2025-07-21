package chap04;

public class Ex182 {

	public static void main(String[] args) {
		// p182 문제3
		//1에서 100까지 정수 중 3의 배수 합, 3의 배수의 갯수
		
		int sam = 0;
		int samCount = 0;
		for(int i = 1 ; i<=100;i++) {
			if(i%3 == 0) {
				sam += i;
				samCount++;
			}
		}
		System.out.printf("3의배수합:%d,3의 배수의 갯수:%d\n",sam,samCount);
		
		//문제3
		// 추가 : 몇 번만에 탈출했는지 출력
		int cnt=0;
		int diceA = 0;
		int diceB = 0;
		while(diceA+diceB !=5) {
			diceA = (int)(Math.random()*6)+1;
			diceB = (int)(Math.random()*6)+1;
			cnt++;
			System.out.printf("주사위눈:%d,%d던진횟수:%d \n",diceA,diceB,cnt);
		}
		
		//문제4
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(4*x+5*y ==60) {
					System.out.printf("(%d,%d)\n",x,y);
				}
			}
		}
		
		//문제6
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
