package 민윤기;

public class report7 {

	public static void main(String[] args) {
		// 3, 6, 9 게임 프로그램
		int cnt = 0;
		for(int i =0;i<=4;i++) {
			String demiPlace ="";
			if(i%3==0&& i != 0) {
				demiPlace = "♥";
			}
			for(int j =1;j<=10;j++) {
				cnt++;
				String firstPlace ="";
				if(j%3==0 &&i%3==0 && i!=0) {
					firstPlace ="♥";
					System.out.printf("%-3s",demiPlace+firstPlace);
				}else if(j%3==0 || (j==10 && j%3==2)) {
					firstPlace ="♥";					
					System.out.printf("%-3s",firstPlace);					
				}else if(j%3!=0 && i%3 ==0 &&i!=0 && j!=10) {
					System.out.printf("%-3s",demiPlace);
				}else if(i%3==2 && j==10) {
					String ten ="♥";	
					System.out.printf("%-3s",ten);
				}else{
					System.out.printf("%-3d",cnt);
				}
							
			}
			System.out.println();
		}

	}//end main

}//end class
