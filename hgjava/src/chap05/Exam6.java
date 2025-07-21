package chap05;

public class Exam6 {

	public static void main(String[] args) {
		// 2차원 배열 만들기(5-1 과제 프로그램)
		int[][] thirdArr = new int[3][5];		
		for(int i=0;i<5;i++) {			
			int ranrow = (int)(Math.random()*thirdArr.length);
			int rancol = (int)(Math.random()*thirdArr[0].length);
			
			if(thirdArr[ranrow][rancol]!=0) {
				i--;
			}else {
				thirdArr[ranrow][rancol]=1;
			}
			
		}
		for(int i=0;i<thirdArr.length;i++) {
			for(int j=0;j<thirdArr[0].length;j++) {
				System.out.printf("%-2d",thirdArr[i][j]);
			}
			System.out.println();
		}

	}

}
